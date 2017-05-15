package com.zhdan.criminalintent;

import android.content.Context;

class CrimeLab {
    private static CrimeLab sCrimeLab;

    private CrimeLab(Context context) {
    }

    public static CrimeLab getsCrimeLab(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
}
