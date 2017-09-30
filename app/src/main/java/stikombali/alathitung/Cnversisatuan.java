package stikombali.alathitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Cnversisatuan extends AppCompatActivity {
    Spinner spspiner1, spspiner2;
    Button btncovert;

    ArrayList<String> arrayspiner1 = new ArrayList<>();
    ArrayList<String> arrayspiner2 = new ArrayList<>();

    int from = 0, to = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnversisatuan);
        spspiner1 = (Spinner) findViewById(R.id.spspiner1);
        spspiner2 = (Spinner) findViewById(R.id.spspiner2);

        btncovert = (Button) findViewById(R.id.btnconvert);

        arrayspiner1.add("km");
        arrayspiner1.add("hm");
        arrayspiner1.add("dam");
        arrayspiner1.add("m");
        arrayspiner1.add("dm");
        arrayspiner1.add("cm");
        arrayspiner1.add("mm");

        arrayspiner2.add("km");
        arrayspiner2.add("hm");
        arrayspiner2.add("dam");
        arrayspiner2.add("m");
        arrayspiner2.add("dm");
        arrayspiner2.add("cm");
        arrayspiner2.add("mm");

        final ArrayAdapter<String> array1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayspiner1);
        final ArrayAdapter<String> array2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayspiner2);
        spspiner1.setAdapter(array1);
        spspiner2.setAdapter(array2);

        spspiner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Cnversisatuan.this,String.valueOf(position),Toast.LENGTH_LONG).show();
                from = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spspiner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Cnversisatuan.this,String.valueOf(position),Toast.LENGTH_LONG).show();
                to = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btncovert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cek = 0;
                String status = "";
                if (from < to){
                    status = "Dikali";
                    cek =  to - from;
                }else if (from > to){
                    status = "Dibagi";
                    cek = from - to;

                }else {
                    status = "Sama";
                }
                int operator = 1;
                for (int i = 0; i< cek; i++){
                    operator = operator * 10;
                }

                Toast.makeText(Cnversisatuan.this, status+" "+String.valueOf(operator), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
