package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    Button btnLuaslingkaran, btnKelilinglingkaran;
    Button btnLuaslingkarandengandiameter, btnKelilinglingkarandengandiameter;
    EditText etJarijari, etDiameter;
    TextView tvHasillingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        btnLuaslingkaran = (Button) findViewById(R.id.btnLuasLingkaran);
        btnKelilinglingkaran = (Button) findViewById(R.id.btnKelilinglingkaran);

        btnLuaslingkarandengandiameter = (Button) findViewById(R.id.btnLuasLingkarandengandiameter);
        btnKelilinglingkarandengandiameter = (Button) findViewById(R.id.btnKelilinglingkarandengandiameter);

        etJarijari = (EditText) findViewById(R.id.etJarijari);
        etDiameter = (EditText) findViewById(R.id.etDiameter);

        tvHasillingkaran = (TextView) findViewById(R.id.tvHasilLingkaran);

        btnLuaslingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Jarijari = Double.valueOf(etJarijari.getText().toString());
                double Hasil = 3.14*(Jarijari*Jarijari);
                tvHasillingkaran.setText(String.valueOf(Hasil));
            }
        });
        btnKelilinglingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Jarijari = Double.valueOf(etJarijari.getText().toString());
                double Hasil= 3.14*(Jarijari+Jarijari);
                tvHasillingkaran.setText(String.valueOf(Hasil));
            }
        });
        btnLuaslingkarandengandiameter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Diameter = Double.valueOf(etDiameter.getText().toString());
                double Jarijari= (Diameter/2);
                double Hasil = 3.14*(Jarijari*Jarijari);
                tvHasillingkaran.setText(String.valueOf(Hasil));
            }
        });
        btnKelilinglingkarandengandiameter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Diameter = Double.valueOf(etDiameter.getText().toString());
                double Hasil = 3.14*Diameter;
                tvHasillingkaran.setText(String.valueOf(Hasil));
            }
        });
    }
}
