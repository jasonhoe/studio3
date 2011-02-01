/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.findbar.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

import com.aptana.editor.findbar.FindBarPlugin;

/**
 * @author Fabio Zadrozny
 */
public class FindBarPreferencesInitializer extends AbstractPreferenceInitializer
{

	@Override
	public void initializeDefaultPreferences()
	{
		IEclipsePreferences pref = new DefaultScope().getNode(FindBarPlugin.PLUGIN_ID);

		pref.put(IPreferencesConstants.USE_CUSTOM_FIND_BAR, "true");

	}

}
