package id.ignitech.rapochinki.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ViewFlipper;

import id.ignitech.rapochinki.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LayananFragment extends Fragment implements View.OnClickListener {

    ViewFlipper viewFlipper;
    Button btnTabLurah, btnTabForm, btnTabMotor, btnTabKebersihan;

    public LayananFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_layanan, container, false);
        viewFlipper = (ViewFlipper) view.findViewById(R.id.vf);
        btnTabForm = (Button) view.findViewById(R.id.btn_tab_form);
        btnTabMotor = (Button) view.findViewById(R.id.btn_tab_motor);
        btnTabKebersihan = (Button) view.findViewById(R.id.btn_tab_kebersihan);

        btnTabMotor.setOnClickListener(this);
        btnTabForm.setOnClickListener(this);
        btnTabKebersihan.setOnClickListener(this);
        viewFlipper.setDisplayedChild(3);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_tab_form:
                viewFlipper.setDisplayedChild(0);
                btnTabForm.setBackgroundColor(getContext().getResources().getColor(R.color.white));
                btnTabMotor.setBackgroundColor(getContext().getResources().getColor(R.color.colorPrimary));
                btnTabKebersihan.setBackgroundColor(getContext().getResources().getColor(R.color.colorPrimary));
                btnTabForm.setTextColor(getContext().getResources().getColor(R.color.colorPrimary));
                btnTabMotor.setTextColor(getContext().getResources().getColor(R.color.white));
                btnTabKebersihan.setTextColor(getContext().getResources().getColor(R.color.white));
                break;
            case R.id.btn_tab_motor:
                viewFlipper.setDisplayedChild(1);
                btnTabForm.setBackgroundColor(getContext().getResources().getColor(R.color.colorPrimary));
                btnTabMotor.setBackgroundColor(getContext().getResources().getColor(R.color.white));
                btnTabKebersihan.setBackgroundColor(getContext().getResources().getColor(R.color.colorPrimary));
                btnTabForm.setTextColor(getContext().getResources().getColor(R.color.white));
                btnTabMotor.setTextColor(getContext().getResources().getColor(R.color.colorPrimary));
                btnTabKebersihan.setTextColor(getContext().getResources().getColor(R.color.white));
                break;
            case R.id.btn_tab_kebersihan:
                viewFlipper.setDisplayedChild(2);
                btnTabForm.setBackgroundColor(getContext().getResources().getColor(R.color.colorPrimary));
                btnTabMotor.setBackgroundColor(getContext().getResources().getColor(R.color.colorPrimary));
                btnTabKebersihan.setBackgroundColor(getContext().getResources().getColor(R.color.white));
                btnTabForm.setTextColor(getContext().getResources().getColor(R.color.white));
                btnTabMotor.setTextColor(getContext().getResources().getColor(R.color.white));
                btnTabKebersihan.setTextColor(getContext().getResources().getColor(R.color.colorPrimary));
                break;
        }
    }
}
