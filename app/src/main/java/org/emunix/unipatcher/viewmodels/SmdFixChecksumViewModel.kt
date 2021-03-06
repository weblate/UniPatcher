/*
 Copyright (c) 2014-2020 Boris Timofeev

 This file is part of UniPatcher.

 UniPatcher is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 UniPatcher is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with UniPatcher.  If not, see <http://www.gnu.org/licenses/>.

 */

package org.emunix.unipatcher.viewmodels

import android.app.Application
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.apache.commons.io.FileUtils
import org.emunix.unipatcher.R
import org.emunix.unipatcher.Utils
import org.emunix.unipatcher.helpers.ConsumableEvent
import org.emunix.unipatcher.tools.SmdFixChecksum
import timber.log.Timber
import java.io.File

class SmdFixChecksumViewModel(val app: Application): AndroidViewModel(app) {
    private var romUri: Uri? = null
    private val romName: MutableLiveData<String> = MutableLiveData()
    private val message: MutableLiveData<ConsumableEvent<String>> = MutableLiveData()
    private val actionIsRunning: MutableLiveData<Boolean> = MutableLiveData()

    fun getRomName(): LiveData<String> = romName
    fun getMessage(): LiveData<ConsumableEvent<String>> = message
    fun getActionIsRunning(): LiveData<Boolean> = actionIsRunning

    init {
        actionIsRunning.value = false
    }

    fun romSelected(uri: Uri) = viewModelScope.launch {
        romUri = uri
        val name = DocumentFile.fromSingleUri(app.applicationContext, uri)?.name ?: "Undefined name"
        Timber.d("ROM name: $name")
        romName.value = name
    }

    fun runActionClicked() = viewModelScope.launch {
        when (romUri) {
            null -> {
                message.value = ConsumableEvent(app.getString(R.string.main_activity_toast_rom_not_selected))
                return@launch
            }
            else -> {
                try {
                    actionIsRunning.value = true
                    fixChecksum()
                    message.postValue(ConsumableEvent(app.getString(R.string.notify_smd_fix_checksum_complete)))
                } catch (e: Exception) {
                    val errorMsg = "${app.getString(R.string.notify_error)}: ${e.message ?: app.getString(R.string.notify_error_unknown)}"
                    message.postValue(ConsumableEvent(errorMsg))
                } finally {
                    actionIsRunning.value = false
                }
            }
        }
    }

    private suspend fun fixChecksum() = withContext(Dispatchers.IO) {
        val romUri = romUri
        require(romUri != null) { "romUri is null" }

        var tmpFile: File? = null
        try {
            tmpFile = Utils.copyToTempFile(app.applicationContext, romUri)
            val worker = SmdFixChecksum(app.applicationContext, tmpFile)
            worker.fixChecksum()
            Utils.copy(tmpFile, romUri, app.applicationContext)
        } finally {
            FileUtils.deleteQuietly(tmpFile)
        }
    }
}