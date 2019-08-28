package com.pedoran.pwpbsesi10.InputNama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pedoran.pwpbsesi10.R;

public class InputNama extends AppCompatActivity {
    EditText etNamaDepan,etNamaBelakang;
    TextView tvOutput;
    Button btnTampil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);

        etNamaDepan = findViewById(R.id.et_nama_depan);
        etNamaBelakang = findViewById(R.id.et_nama_belakang);
        tvOutput = findViewById(R.id.tv_hasil);
        btnTampil = findViewById(R.id.btn_tampil);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = etNamaDepan.getText().toString();
                String lname = etNamaBelakang.getText().toString();
                String output = fname + " " +lname;

                tvOutput.setText(output);
            }
        });
    }
}
