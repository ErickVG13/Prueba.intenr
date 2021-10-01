package lol.erickes.pruebaintenr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    
    private Button btUNO, btDOS, btTRES, btCUATRO;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btUNO = (Button) findViewById(R.id.btUNO);
        btDOS = (Button) findViewById(R.id.btDOS);
        btTRES = (Button) findViewById(R.id.btTRES);

        btUNO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentuno = new Intent(this, MainActivityUNO.class);
                startActivity(intentuno);

            }
        });

        btDOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentdos = new Intent(this, MainActivityDOS.class);
                startActivity(intentdos);

            }
        });

        btTRES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intenttres = new Intent(this, MainActivityTRES.class);
                startActivity(intenttres);

            }
        });

    }
}