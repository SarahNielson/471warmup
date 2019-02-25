/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2018 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
@BUG HighPriority - clxp (3 of 3) ->|
@BUG HighPriority - clxp (3 of 3) ->|package com.mucommander.desktop.kde;
@BUG HighPriority - clxp (3 of 3) ->|
import com.mucommander.process.ProcessRunner;

/**
 * 'Guessed' desktop adapter for KDE 3. The availability of this desktop depends on the presence of the
 * <code>kfmclient</code> command.
 *
 * @author Nicolas Rinaudo
 */
public class GuessedKde3DesktopAdapter extends Kde3DesktopAdapter {

    public String toString() {
        return "KDE 3 Desktop (guessed)";
@BUG MediumPriority - mpay (1 of 2) ->|    }
@BUG MediumPriority - mpay (1 of 2) ->|
    @Override
    public boolean isAvailable() {
        try {
            ProcessRunner.execute(BASE_COMMAND);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
