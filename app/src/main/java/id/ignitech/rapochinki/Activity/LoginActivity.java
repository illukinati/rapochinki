package id.ignitech.rapochinki.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import id.ignitech.rapochinki.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtDaftar;
    Button btnLogin;
    Intent intent;
    EditText edtEmail;
    ProgressBar pgBarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        txtDaftar = (TextView) findViewById(R.id.txt_daftar);
        btnLogin = (Button) findViewById(R.id.btn_login);
        edtEmail = (EditText) findViewById(R.id.edt_email);
        pgBarLogin = (ProgressBar) findViewById(R.id.pgBarLogin);

        btnLogin.setOnClickListener(this);
        txtDaftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_daftar:
                intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_login:
                pgBarLogin.setVisibility(View.VISIBLE);
                btnLogin.setVisibility(View.GONE);
                if (edtEmail.getText().toString().equals("admin")) {
                    intent = new Intent(LoginActivity.this, NavDrawAdminActivity.class);
                    startActivity(intent);
                    finish();
                } else if (edtEmail.getText().toString().equals("karyawan")) {
                    intent = new Intent(LoginActivity.this, KaryawanActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
                break;
        }
    }
}
