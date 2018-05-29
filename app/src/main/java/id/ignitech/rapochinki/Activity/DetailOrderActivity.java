package id.ignitech.rapochinki.Activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import id.ignitech.rapochinki.R;

public class DetailOrderActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout lnrSatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_order);

        lnrSatu = (LinearLayout) findViewById(R.id.lnr_list1);
        lnrSatu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == lnrSatu){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Karyawan").setMessage("Bambang \nDD 123 L\n2 KM dari lokasi").setPositiveButton("Telepon", dialogClickListener)
                    .setNegativeButton("Tugaskan", dialogClickListener).show();
        }
    }

    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            switch (which){
                case DialogInterface.BUTTON_POSITIVE:
                    Toast.makeText(DetailOrderActivity.this, "BLablabla !", Toast.LENGTH_SHORT).show();
                    break;

                case DialogInterface.BUTTON_NEGATIVE:
                    //No button clicked
                    break;
            }
        }
    };
}
