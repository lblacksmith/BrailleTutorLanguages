package com.lukeneedham.brailletutor.Braille;

import android.content.Context;

/**
 * Created by Luke on 15/06/2017.
 */

public class DictionaryCategory
{
	private int nameRes;

	private BrailleSymbolType[] subpages;

	private int unlockLevel;

	private boolean translationToggle = false;

	public DictionaryCategory(int n, int l, BrailleSymbolType... ps)
	{
		nameRes = n;
		unlockLevel = l;
		subpages = ps;
	}

	public DictionaryCategory setTranslateToggle(boolean t)
	{
		translationToggle = t;
		return this;
	}

	public int getNameRes()
	{
		return nameRes;
	}

	public String getName(Context c)
	{
		return c.getResources().getString(nameRes);
	}

	public BrailleSymbolType[] getSubsections()
	{
		return subpages;
	}

	public int getUnlockLevel()
	{
		return unlockLevel;
	}

	public boolean canBeToggledForTranslation()
	{
		return translationToggle;
	}

	public String toString()
	{
		return unlockLevel + "";
	}

	public boolean equals(Object obj)
	{
		try
		{
			DictionaryCategory cat = (DictionaryCategory) obj;
			return (nameRes == cat.getNameRes()) && (unlockLevel == cat.getUnlockLevel());
		}
		catch(ClassCastException ex)
		{
			return false;
		}
	}
}
