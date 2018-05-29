package id.ignitech.rapochinki.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import id.ignitech.rapochinki.Activity.DetailOrderActivity;
import id.ignitech.rapochinki.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment implements View.OnClickListener{

    LinearLayout lnrSatu;

    public OrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_order, container, false);

        lnrSatu = (LinearLayout) view.findViewById(R.id.lnr_list1);
        lnrSatu.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if(view == lnrSatu){
            Intent intent = new Intent(getActivity(), DetailOrderActivity.class);
            startActivity(intent);
        }
    }
}
