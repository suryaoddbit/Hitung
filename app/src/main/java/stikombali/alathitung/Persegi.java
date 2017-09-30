package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity {
    Button btnLuaspersegi, btnKelilingpersegi, btnLuaspersegipanjang, btnKelilingpersegipanjang;
    EditText etSisipersegi, etLebarpersegipanjang, etPanjangpersegipanjang;
    TextView tvHasilPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        btnLuaspersegi = (Button) findViewById(R.id.btnLuaspersegi);
        btnKelilingpersegi = (Button) findViewById(R.id.btnKelilingpersegi);
        etSisipersegi = (EditText) findViewById(R.id.etSisipersegi);

        btnLuaspersegipanjang = (Button) findViewById(R.id.btnLuasPersegipanjang);
        btnKelilingpersegipanjang = (Button) findViewById(R.id.btnKelilingpersegipanjang);
        etLebarpersegipanjang = (EditText) findViewById(R.id.etLebarpersegipanjang);
        etPanjangpersegipanjang= (EditText) findViewById(R.id.etPanjangpersegipanjang);

        tvHasilPersegi = (TextView) findViewById(R.id.HasilPersegi);
        //persegi
        btnLuaspersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Sisipersegi = Double.valueOf(etSisipersegi.getText().toString());
                double Hasil = Sisipersegi*Sisipersegi;
                tvHasilPersegi.setText(String.valueOf(Hasil));
            }
        });
        btnKelilingpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Sisipersegi = Double.valueOf(etSisipersegi.getText().toString());
                double Hasil = Sisipersegi*4;
                tvHasilPersegi.setText(String.valueOf(Hasil));
            }
        });
        //persegi panjang
        btnLuaspersegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Panjang = Double.valueOf(etPanjangpersegipanjang.getText().toString());
                double Lebar = Double.valueOf(etLebarpersegipanjang.getText().toString());
                double Hasil = Panjang * Lebar;
                tvHasilPersegi.setText(String.valueOf(Hasil));
            }
        });
        btnKelilingpersegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Panjang = Double.valueOf(etPanjangpersegipanjang.getText().toString());
                double Lebar = Double.valueOf(etLebarpersegipanjang.getText().toString());
                double Hasil = 2*(Panjang+Lebar);
                tvHasilPersegi.setText(String.valueOf(Hasil));
            }
        });

    }
}
