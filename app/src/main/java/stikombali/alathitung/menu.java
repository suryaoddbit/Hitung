package stikombali.alathitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Math.sqrt;

public class menu extends AppCompatActivity {
    Button btnTambah, btnKurang, btnKali, btnBagi, btnPersen, btnMod, btnPangkat, btnakar2, btnconversisatuan;
    //Button btnSegitiga, btnPersegi, btnLingkaran, btnJajargenjang, btnBelahketupat, btnTrapesium, btnLayanglayang, btnconversisatuan;
    EditText Value1, Value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //pendeklerasian button kalkulator
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnPersen = (Button) findViewById(R.id.btnPersen);
        btnMod = (Button) findViewById(R.id.btnMod);
        btnPangkat = (Button) findViewById(R.id.btnPangkat);
        btnakar2 = (Button) findViewById(R.id.btnakar2);
        btnconversisatuan = (Button) findViewById(R.id.btnconversisatuan);

        //pendeklerasian button passing atau pindah
//        btnSegitiga=(Button) findViewById(R.id.btnSegitiga);
//        btnPersegi=(Button) findViewById(R.id.btnPersegi);
//        btnLingkaran=(Button) findViewById(R.id.btnLingkaran);
//        btnJajargenjang=(Button) findViewById(R.id.btnJajargenjang);
//        btnBelahketupat=(Button) findViewById(R.id.btnBelahketupat);
//        btnTrapesium=(Button) findViewById(R.id.btnTrapesium);
//        btnLayanglayang = (Button) findViewById(R.id.btnLayanglayag);
//        btnconversisatuan  = (Button) findViewById(R.id.btnconversisatuan);

        //pendeklerasian value
        Value1 = (EditText) findViewById(R.id.Value1);
        Value2 = (EditText) findViewById(R.id.Value2);

        //method untuk kalkulator
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mengubah tipe data variable dari string menjadi float
                float Valuee1 = Float.valueOf(Value1.getText().toString());
                float Valuee2 = Float.valueOf(Value2.getText().toString());
                float Hasil = Valuee1 + Valuee2;
                Value1.setText(String.valueOf(Hasil));
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Valuee1 = Float.valueOf(Value1.getText().toString());
                float Valuee2 = Float.valueOf(Value2.getText().toString());
                float Hasil = Valuee1 - Valuee2;
                Value1.setText(String.valueOf(Hasil));
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Valuee1 = Float.valueOf(Value1.getText().toString());
                float Valuee2 = Float.valueOf(Value2.getText().toString());
                float Hasil = Valuee1 * Valuee2;
                Value1.setText(String.valueOf(Hasil));
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Valuee1 = Float.valueOf(Value1.getText().toString());
                float Valuee2 = Float.valueOf(Value2.getText().toString());
                float Hasil = Valuee1 / Valuee2;
                Value1.setText(String.valueOf(Hasil));
            }
        });
        btnPersen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Valuee1 = Float.valueOf(Value1.getText().toString());
                float Hasil = Valuee1 / 100;
                Value2.setText(String.valueOf(Hasil) + "%");
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Valuee1 = Float.valueOf(Value1.getText().toString());
                float Valuee2 = Float.valueOf(Value2.getText().toString());
                float Hasil = Valuee1 % Valuee2;
                Value1.setText(String.valueOf(Hasil));
            }
        });
        btnPangkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Valuee1 = Float.valueOf(Value1.getText().toString());
                float Hasil = Valuee1 * Valuee1;
                Value1.setText(String.valueOf(Hasil));
            }
        });
        btnakar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Valuee1 = Double.valueOf(Value1.getText().toString());
                double Hasil = sqrt(Valuee1);
                Value1.setText(String.valueOf(Hasil));
            }
        });
        btnconversisatuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toconvertsatuan = new Intent(menu.this, Cnversisatuan.class);
                startActivity(toconvertsatuan);
            }
        });

        //button untuk pindah ke benberapa layer
//        btnSegitiga.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent toSegitiga = new Intent(menu.this, segitiga.class);
//                startActivity(toSegitiga);
//            }
//        });
//        btnPersegi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent toPersegi = new Intent(menu.this, Persegi.class);
//                startActivity(toPersegi);
//            }
//        });
//        btnLingkaran.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent toLingkaran = new Intent(menu.this, Lingkaran.class);
//                startActivity(toLingkaran);
//            }
//        });
//        btnJajargenjang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent toJajargenjang = new Intent(menu.this, Jajargenjang.class);
//                startActivity(toJajargenjang);
//            }
//        });
//        btnBelahketupat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent toBelahketupat = new Intent(menu.this, Belahketupat.class);
//                startActivity(toBelahketupat);
//            }
//        });
//        btnTrapesium.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent toTrapesium = new Intent(menu.this, Trapesium.class);
//                startActivity(toTrapesium);
//            }
//        });
//        btnLayanglayang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent toLayanglayang = new Intent(menu.this, Layanglayang.class);
//                startActivity(toLayanglayang);
//            }
//        });

    }
}
