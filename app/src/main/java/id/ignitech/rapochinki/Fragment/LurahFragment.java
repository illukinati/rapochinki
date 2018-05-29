package id.ignitech.rapochinki.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ignitech.rapochinki.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LurahFragment extends Fragment {


    public LurahFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lurah, container, false);
    }

}
