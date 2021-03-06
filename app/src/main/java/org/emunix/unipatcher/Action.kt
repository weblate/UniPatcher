/*
 Copyright (c) 2017, 2019-2020 Boris Timofeev

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

package org.emunix.unipatcher

object Action {
    const val SELECT_ROM_FILE = 1
    const val SELECT_PATCH_FILE = 2
    const val SELECT_SOURCE_FILE = 3
    const val SELECT_MODIFIED_FILE = 4
    const val SELECT_OUTPUT_FILE = 5

    const val SNES_REMOVE_SMC_HEADER = 104
}
