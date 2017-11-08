package com.zhdan.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.util.Log;

import com.zhdan.criminalintent.Crime;
import com.zhdan.criminalintent.database.CrimeDbSchema.CrimeTable;

import java.util.Date;
import java.util.UUID;

public class CrimeCursorWrapper extends CursorWrapper {
    /**
     * Creates a cursor wrapper.
     *
     * @param cursor The underlying cursor to wrap.
     */
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }


    /**
     * Get a Crime entity from DB
     */
    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeTable.Cols.UUID));
        Log.e("GET", "getStr = " + uuidString);
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        Log.e("GET", "getTitle = " + title);
        long date = getLong(getColumnIndex(CrimeTable.Cols.DATE));
        Log.e("GET", "getDate = " + date);
        int isSolved = getInt(getColumnIndex(CrimeTable.Cols.SOLVED));
        Log.e("GET", "getSolved = " + isSolved);

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved != 0);

        return crime;
    }
}
