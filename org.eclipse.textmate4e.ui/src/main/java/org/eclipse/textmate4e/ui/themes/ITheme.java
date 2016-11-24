/**
 *  Copyright (c) 2015-2016 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.textmate4e.ui.themes;

/**
 * TextMate theme.
 *
 */
public interface ITheme extends ITokenProvider {

	/**
	 * Returns the id of the theme.
	 * 
	 * @return the id of the theme.
	 */
	String getId();

	/**
	 * Returns the name of the theme.
	 * 
	 * @return the name of the theme.
	 */
	String getName();
}