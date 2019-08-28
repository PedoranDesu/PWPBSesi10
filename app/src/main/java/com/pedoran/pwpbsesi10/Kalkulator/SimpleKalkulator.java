package com.pedoran.pwpbsesi10.Kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

import com.pedoran.pwpbsesi10.R;

public class SimpleKalkulator extends AppCompatActivity implements View.OnClickListener {
    EditText txtA,txtB,txtC;
    Button btnCalc;

    protected Float angka1,angka2,hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_kalkulator);

        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtC = findViewById(R.id.txtC);

        Button btnTambah = findViewById(R.id.btn_tambah);
        Button btnKurang = findViewById(R.id.btn_kurang);
        Button btnKali = findViewById(R.id.btn_kali);
        Button btnBagi = findViewById(R.id.btn_bagi);

        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        angka1 = Float.parseFloat(txtA.getText().toString());
        angka2 = Float.parseFloat(txtB.getText().toString());

        switch (view.getId()){
            case R.id.btn_tambah:
                hasil = angka1+angka2;
                txtC.setText("Hasil : "+hasil);
                break;
            case R.id.btn_kurang:
                hasil = angka1-angka2;
                txtC.setText("Hasil : "+hasil);
                break;
            case R.id.btn_kali:
                hasil = angka1*angka2;
                txtC.setText("Hasil : "+hasil);
                break;
            case R.id.btn_bagi:
                hasil = angka1/angka2;
                txtC.setText("Hasil : "+hasil);
                break;
        }
    }
}
