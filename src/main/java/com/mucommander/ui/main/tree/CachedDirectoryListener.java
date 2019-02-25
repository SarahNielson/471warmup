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

package com.mucommander.ui.main.tree;

import com.mucommander.commons.file.AbstractFile;

import java.util.EventListener;

/**
 * An interface that listeners to a directory cache must implement.
 * @author Mariusz Jakubowski
 *
 */
public interface CachedDirectoryListener extends EventListener {
   
    public void cachingStarted(AbstractFile parent);
    
    public void cachingEnded(AbstractFile parent);

}
