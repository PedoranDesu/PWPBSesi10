package com.pedoran.pwpbsesi10.KonversiSuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.pedoran.pwpbsesi10.R;

import java.text.DecimalFormat;

public class KonverterSuhu extends AppCompatActivity {
    EditText edC, edR, edF, edK, edRa,input;
    //urutan C,R,F,K,Ra
    protected String valueC,valueR,valueF,valueK,valueRa;
    protected double valueInput;
    protected int satuanInput;
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

        input = findViewById(R.id.tv_input);

        Button btnKonver = findViewById(R.id.btnKonvert);
        btnKonver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup inputType = findViewById(R.id.rgroup);
                int type = inputType.getCheckedRadioButtonId();
                switch (type){
                    //0-> C,1 -> R,2 -> F,3 -> K,4 -> Ra
                    case R.id.celcius: satuanInput = 0; break;
                    case R.id.fahren: satuanInput = 2; break;
                    case R.id.kelvin: satuanInput = 3; break;
                    case R.id.reamur: satuanInput = 1; break;
                    case R.id.rankine: satuanInput = 4; break;
                }
                valueInput = Double.parseDouble(input.getText().toString());
                valueC = konversiSuhu(valueInput,0,satuanInput);
                valueR = konversiSuhu(valueInput,1,satuanInput);
                valueF = konversiSuhu(valueInput,2,satuanInput);
                valueK = konversiSuhu(valueInput,3,satuanInput);
                valueRa = konversiSuhu(valueInput,4,satuanInput);

                edC.setText(valueC);
                edR.setText(valueR);
                edF.setText(valueF);
                edK.setText(valueK);
                edRa.setText(valueRa);
            }
        });
    }
    //0-> C,1 -> R,2 -> F,3 -> K,4 -> Ra
    private String konversiSuhu(Double valueC,int type,int inputType){
        Double hasilKonvert =   (valueC-titikBeku[inputType])/skalaInput[inputType] * skalaInput[type] + titikBeku[type];
        DecimalFormat konvert = new DecimalFormat("#.##");
        return konvert.format(hasilKonvert);
    }
}
