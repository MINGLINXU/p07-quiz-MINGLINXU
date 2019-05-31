package sg.edu.rp.soi.p07quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ListView lv;
    ArrayAdapter<String> aa;
    ArrayList <String> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        lv = findViewById(R.id.lv);

        al = new ArrayList<>();

        al.add("Apple");
        al.add("Ball");
        al.add("Cat");


        aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, al );
        lv.setAdapter(aa);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            String logselect = lv.getItemAtPosition(position).toString();
                            Log.d("Item clicked" , logselect);
                            }
                        });
                        break;
                    case 1:
                        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                String Itemselecte = lv.getItemAtPosition(position).toString();
                                Toast.makeText(MainActivity.this,"Item Clicked: "+Itemselecte,Toast.LENGTH_SHORT).show();
                            }
                        });
                        break;

                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
