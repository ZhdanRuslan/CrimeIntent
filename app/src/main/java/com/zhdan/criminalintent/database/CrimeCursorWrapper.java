package com.zhdan.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

public class CrimeCursorWrapper extends CursorWrapper {
    /**
     * Creates a cursor wrapper.
     *
     * @param cursor The underlying cursor to wrap.
     */
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }
}
