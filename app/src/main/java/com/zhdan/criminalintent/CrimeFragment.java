package com.zhdan.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTItleField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmet_crime, container, false);

        mTItleField = (EditText)v.findViewById(R.id.crime_title);
        mTItleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                /*NOP*/
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCrime.setmTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                /*NOP*/
            }
        });
        return v;
    }
}
