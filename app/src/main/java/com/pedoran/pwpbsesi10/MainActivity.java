package com.pedoran.pwpbsesi10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pedoran.pwpbsesi10.InputNama.InputNama;
import com.pedoran.pwpbsesi10.KalkulasiLuas.KalkulasiLuas;
import com.pedoran.pwpbsesi10.Kalkulator.Calculator;
import com.pedoran.pwpbsesi10.Kalkulator.SimpleKalkulator;
import com.pedoran.pwpbsesi10.KonversiSuhu.KonverterSuhu;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initbtn((Button)findViewById(R.id.btnLat1), InputNama.class);
        initbtn((Button)findViewById(R.id.btnLat2), KalkulasiLuas.class);
        initbtn((Button)findViewById(R.id.btnLat3), SimpleKalkulator.class);
        initbtn((Button)findViewById(R.id.btnLat4), KonverterSuhu.class);
        initbtn((Button)findViewById(R.id.btnLat5), Calculator.class);
    }

    private void initbtn(Button btn,final Class bearclass){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(MainActivity.this,bearclass);
                startActivity(bearsense);
            }
        });
    }
}
