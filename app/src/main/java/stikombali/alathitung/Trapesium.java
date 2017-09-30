package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trapesium extends AppCompatActivity {
    Button btnTrapesiumLuas, btnTrapesiumkeliling;
    EditText etTrapesiumSisi1, etTrapesiumSisi2, etTrapesiumTinggi , etTrapesiumSisi1keliling, etTrapesiumSisi2Keliling,etTrapesiumsisi3Keliling, etTrapesiumsisi4Keliling;
    TextView tvHasilTrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);
        btnTrapesiumLuas = (Button) findViewById(R.id.btnTrapesiumLuas);
        btnTrapesiumkeliling = (Button) findViewById(R.id.btnTrapesiumKeliling);

        etTrapesiumSisi1 = (EditText) findViewById(R.id.etTrapesiumSisi1);
        etTrapesiumSisi2 = (EditText) findViewById(R.id.etTrapesiumSisi2);
        etTrapesiumTinggi = (EditText) findViewById(R.id.etTrapesiumTinggi);
        etTrapesiumSisi1keliling = (EditText) findViewById(R.id.etTrapesiumSisi1Keliling);
        etTrapesiumSisi2Keliling = (EditText) findViewById(R.id.etTrapesiumsisi2Keliling);
        etTrapesiumsisi3Keliling = (EditText) findViewById(R.id.etTrapesiumsisi3Keliling);
        etTrapesiumsisi4Keliling = (EditText) findViewById(R.id.etTrapesiumsisi4Keliling);

        tvHasilTrapesium = (TextView) findViewById(R.id.tvHasilTrapesium);

        btnTrapesiumLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Sisi1 = Double.valueOf(etTrapesiumSisi1.getText().toString());
                double Sisi2 = Double.valueOf(etTrapesiumSisi2.getText().toString());
                double Tinggi = Double.valueOf(etTrapesiumTinggi.getText().toString());
                double Hasil = 0.5* (Sisi1+Sisi2) * Tinggi;
                tvHasilTrapesium.setText(String.valueOf(Hasil));
            }
        });
        btnTrapesiumkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Sisi1 = Double.valueOf(etTrapesiumSisi1keliling.getText().toString());
                double Sisi2 = Double.valueOf(etTrapesiumSisi2Keliling.getText().toString());
                double Sisi3 = Double.valueOf(etTrapesiumsisi3Keliling.getText().toString());
                double Sisi4 = Double.valueOf(etTrapesiumsisi4Keliling.getText().toString());
                double Hasil = Sisi1+Sisi2+Sisi3+Sisi4;
                tvHasilTrapesium.setText(String .valueOf(Hasil));
            }
        });
    }
}
