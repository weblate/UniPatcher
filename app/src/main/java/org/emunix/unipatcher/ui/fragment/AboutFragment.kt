/*
Copyright (C) 2016, 2020 Boris Timofeev

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
package org.emunix.unipatcher.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import org.emunix.unipatcher.R
import org.emunix.unipatcher.Utils
import org.emunix.unipatcher.databinding.FragmentAboutBinding
import org.markdown4j.Markdown4jProcessor
import org.sufficientlysecure.htmltextview.HtmlResImageGetter

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.versionText.text = getString(R.string.help_activity_about_tab_version, Utils.getAppVersion(requireActivity()))
        try {
            val html = Markdown4jProcessor().process(
                    requireActivity().resources.openRawResource(R.raw.about))
            binding.aboutText.setHtml(html, HtmlResImageGetter(requireActivity()))
        } catch (e: Exception) {
            Toast.makeText(activity, R.string.help_activity_error_cannot_load_text, Toast.LENGTH_LONG).show()
        }
    }
}