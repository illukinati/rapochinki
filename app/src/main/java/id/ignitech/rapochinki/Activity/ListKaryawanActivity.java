package id.ignitech.rapochinki.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import id.ignitech.rapochinki.R;

public class ListKaryawanActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;
    LinearLayout lnrSatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_karyawan);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        lnrSatu = (LinearLayout) findViewById(R.id.lnr_list1);
        lnrSatu.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view == lnrSatu) {
            Intent intent = new Intent(ListKaryawanActivity.this, DetailKaryawanActivity.class);
            startActivity(intent);
        }
    }
}
