package com.pedoran.pwpbsesi10.KonversiSuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pedoran.pwpbsesi10.R;

public class KonverterSuhu extends AppCompatActivity {
    EditText edC, edR, edF, edK, edRa;
    //urutan C,R,F,K,Ra
    protected double valueC,valueR,valueF,valueK,valueRa;
    protected double[] titikBeku = {0, 0, 32, 273.15, 491.67};
    protected double[] skalaInput = {5, 4, 9, 5, 9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konverter_suhu);

        edC = findViewById(R.id.edC);
        edR = findViewById(R.id.edR);
        edF = findViewById(R.id.edF);
        edK = findViewById(R.id.edK);
        edRa = findViewById(R.id.edRa);

        Button btnKonver = findViewById(R.id.btnKonvert);
        btnKonver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueC = Double.parseDouble(edC.getText().toString());

                valueR = konversiDariC(valueC,1);
                valueF = konversiDariC(valueC,2);
                valueK = konversiDariC(valueC,3);
                valueRa = konversiDariC(valueC,4);

                edR.setText(Double.toString(valueR));
                edF.setText(Double.toString(valueF));
                edK.setText(Double.toString(valueK));
                edRa.setText(Double.toString(valueRa));
            }
        });
    }
    //1 -> R,2 -> F,3 -> K,4 -> Ra
    private Double konversiDariC(Double valueC,int type){
        Double hasilKonvert =   (valueC+0)/skalaInput[0] * skalaInput[type] + titikBeku[type];
        return hasilKonvert;
    }
}
