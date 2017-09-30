package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Samasisi extends AppCompatActivity {
    //luas
    Button btnHasilSamasisi, btnLuassamasisi;
    EditText etSisi1Samasisi, etalassamasisi, ettinggisamasisi;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samasisi);
        btnHasilSamasisi = (Button) findViewById(R.id.btnHasilKelilingSamasisi);
        btnLuassamasisi = (Button) findViewById(R.id.btnHasilluasSamasisi);
        etSisi1Samasisi = (EditText) findViewById(R.id.etSisi1Samasisi);
        etalassamasisi = (EditText) findViewById(R.id.etAlassamasisi);
        ettinggisamasisi = (EditText) findViewById(R.id.ettinggisamasisi);
        tvHasil = (TextView) findViewById(R.id.tvHasilSamasisi);

        btnHasilSamasisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Value1 = Double.valueOf(etSisi1Samasisi.getText().toString());
                double Hasil = Value1*3;
                tvHasil.setText(String.valueOf(Hasil));
            }
        });
        btnLuassamasisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Valuealas = Double.valueOf(etalassamasisi.getText().toString());
                double Valuetinggi = Double.valueOf(ettinggisamasisi.getText().toString());
                double hasilluas = 0.5*Valuealas*Valuetinggi;
                tvHasil.setText(String.valueOf(hasilluas));
            }
        });
    }
}
