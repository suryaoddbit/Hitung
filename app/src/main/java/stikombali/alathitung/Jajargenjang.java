package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Jajargenjang extends AppCompatActivity {
    Button btnLuasjajargenjang, btnKelilingjajargenjang;

    EditText etJajargenjangalas, etJajargenjangtinggi;
    TextView tvHasiljajargenjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajargenjang);
        btnLuasjajargenjang = (Button) findViewById(R.id.btnLuasJajargenjang);
        btnKelilingjajargenjang = (Button) findViewById(R.id.btnKelilingJajargenjang);

        etJajargenjangalas = (EditText) findViewById(R.id.etjajargenjangalas);
        etJajargenjangtinggi = (EditText) findViewById(R.id.etjajagenjangtinggi);

        tvHasiljajargenjang = (TextView) findViewById(R.id.tvhasiljajargenjang);

        btnLuasjajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Alas = Double.valueOf(etJajargenjangalas.getText().toString());
                double Tinggi = Double.valueOf(etJajargenjangtinggi.getText().toString());
                double Hasil = Alas*Tinggi;
                tvHasiljajargenjang.setText(String.valueOf(Hasil));
            }
        });
        btnKelilingjajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Alas = Double.valueOf(etJajargenjangalas.getText().toString());
                double Tinggi = Double.valueOf(etJajargenjangtinggi.getText().toString());
                double Hasil = 2* (Alas+Tinggi);
                tvHasiljajargenjang.setText(String.valueOf(Hasil));
            }
        });
    }
}
