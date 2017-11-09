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
        Log.i("GET", "getStr = " + uuidString);
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        Log.i("GET", "getTitle = " + title);
        long date = getLong(getColumnIndex(CrimeTable.Cols.DATE));
        Log.i("GET", "getDate = " + date);
        int isSolved = getInt(getColumnIndex(CrimeTable.Cols.SOLVED));
        Log.i("GET", "getSolved = " + isSolved);
        String suspect = getString(getColumnIndex(CrimeTable.Cols.SUSPECT));
        Log.i("GET", "getStr = " + uuidString);

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved != 0);
        crime.setmSuspect(suspect);

        return crime;
    }
}
