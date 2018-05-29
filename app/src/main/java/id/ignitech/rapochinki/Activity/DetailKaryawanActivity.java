package id.ignitech.rapochinki.Activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import id.ignitech.rapochinki.R;

public class DetailKaryawanActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;
    Button btnHapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_karyawan);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnHapus = (Button) findViewById(R.id.btn_hapus);
        btnHapus.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View view) {
        if(view == btnHapus){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Hapus Karyawan").setMessage("Apakah anda yakin ingin menghapus karyawan ini ?").setPositiveButton("Hapus", dialogClickListener)
                    .setNegativeButton("Batal", dialogClickListener).show();
        }
    }

    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            switch (which){
                case DialogInterface.BUTTON_POSITIVE:
                    Toast.makeText(DetailKaryawanActivity.this, "Dihapus !", Toast.LENGTH_SHORT).show();
                    break;

                case DialogInterface.BUTTON_NEGATIVE:
                    //No button clicked
                    break;
            }
        }
    };
}
