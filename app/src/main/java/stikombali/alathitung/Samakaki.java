package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class Samakaki extends AppCompatActivity {
    //Luas
    Button btnHasilLuas;
    EditText etAlas, etTinggi;
    TextView tvHasil;
    //Keliling
    Button btnHasilkeliling;
    EditText etSisialas, etSisiMiring;
    //Mencari alas, tinggi dan sisi miring
    Button btnSM, btnMT, btnMA;
    EditText etSMtinggi, etSMalas, etMTalas, etMTmiring, etMAtinggi, etMAsisimiring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samakaki);
        //luas
        btnHasilLuas = (Button) findViewById(R.id.btnHasilluas);
        etAlas = (EditText) findViewById(R.id.etAlas);
        etTinggi = (EditText) findViewById(R.id.etTinggi);
        tvHasil = (TextView) findViewById(R.id.tvHasil);
        //Keliling
        btnHasilkeliling = (Button) findViewById(R.id.btnHasilKeliling);
        etSisialas = (EditText) findViewById(R.id.etSisiAlas);
        etSisiMiring = (EditText) findViewById(R.id.etSisimiring);

        btnHasilLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Valuealas = Double.valueOf(etAlas.getText().toString());
                double Valuetingi = Double.valueOf(etTinggi.getText().toString());
                double Hasil = 0.5 * Valuealas * Valuetingi;
                tvHasil.setText(String.valueOf(Hasil));
            }
        });
        btnHasilkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Valuealas = Double.valueOf(etSisialas.getText().toString());
                double ValueSisimiring = Double.valueOf(etSisiMiring.getText().toString());
                double Hasil = Valuealas + (ValueSisimiring*2);
                tvHasil.setText(String.valueOf(Hasil));
            }
        });

        //Sisi Miring segitiga
        btnSM = (Button) findViewById(R.id.btnSM);
        etSMalas = (EditText) findViewById(R.id.etSMalas);
        etSMtinggi = (EditText) findViewById(R.id.etSMtinggi);
        btnSM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Valuesmalas = Double.valueOf(etSMalas.getText().toString());
                double Valuesmalas1 = Valuesmalas/2;
                double Valuesmtinggi = Double.valueOf(etSMtinggi.getText().toString());
                double Valuemiring = sqrt((Valuesmalas1*Valuesmalas1)+(Valuesmtinggi*Valuesmtinggi));
                etSisiMiring.setText(String.valueOf(Valuemiring));
                etSisialas.setText(String.valueOf(Valuesmalas));
            }
        });
        //Tinggi segitiga
        btnMT = (Button) findViewById(R.id.btnMT);
        etMTalas = (EditText) findViewById(R.id.etMTalas);
        etMTmiring = (EditText) findViewById(R.id.etMTMiring);
        btnMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Valuemtalas = Double.valueOf(etMTalas.getText().toString());
                double Valuemtalas1 = Valuemtalas/2;
                double Valuemtmiring = Double.valueOf(etMTmiring.getText().toString());
                double Valuetinggi = sqrt((Valuemtmiring*Valuemtmiring)-(Valuemtalas1*Valuemtalas1));
                etTinggi.setText(String.valueOf(Valuetinggi));
            }
        });
        //Alas Segitiga
        btnMA = (Button) findViewById(R.id.btnMA);
        etMAtinggi = (EditText) findViewById(R.id.etMAtinggi);
        etMAsisimiring = (EditText) findViewById(R.id.etMAsisimiring);
        btnMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Valuetinggi = Double.valueOf(etMAtinggi.getText().toString());
                double Valuesisimiring = Double.valueOf(etMAsisimiring.getText().toString());
                double Valuealas = sqrt((Valuesisimiring*Valuesisimiring)-(Valuetinggi*Valuetinggi));
                double Valuealasfix = Valuealas*2;
                etAlas.setText(String.valueOf(Valuealasfix));
            }
        });
    }
}
