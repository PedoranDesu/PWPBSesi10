package com.pedoran.pwpbsesi10.KalkulasiLuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pedoran.pwpbsesi10.R;

public class KalkulasiLuas extends AppCompatActivity {
    EditText etPanjang,etLebar;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulasi_luas);

        etPanjang = findViewById(R.id.edt_panjang);
        etLebar = findViewById(R.id.edt_lebar);
        btnHitung = findViewById(R.id.btn_hitung);
        tvHasil = findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = etPanjang.getText().toString().trim();
                String lebar = etLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p*l;

                tvHasil.setText("Luas : "+luas);
            }
        });
    }
}
