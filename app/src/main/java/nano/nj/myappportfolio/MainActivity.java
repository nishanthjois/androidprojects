package nano.nj.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnPopularMovies, btnStockHawk,btnBuilditBigger, btnMakeYourAppMaterial, btnGoUbiquitous, btnCapstone;
    TextView tvHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHeader=(TextView) findViewById(R.id.tvHeader);
        btnPopularMovies=(Button) findViewById(R.id.btnPopularMovies);
        btnStockHawk=(Button) findViewById(R.id.btnStockHawk);
        btnBuilditBigger=(Button) findViewById(R.id.btnBuilditBigger);
        btnMakeYourAppMaterial=(Button) findViewById(R.id.btnMakeYourAppMaterial);
        btnGoUbiquitous=(Button) findViewById(R.id.btnGoUbiquitous);
        btnCapstone=(Button) findViewById(R.id.btnCapstone);


    }

    public void mProject(View v){
        if(v.getId()==R.id.btnPopularMovies){
            Toast.makeText(this,"This button will launch my Popular Movies app",Toast.LENGTH_LONG).show();

        }
        if(v.getId()==R.id.btnStockHawk){
            Toast.makeText(this,"This button will launch my Stock Hawk app",Toast.LENGTH_LONG).show();

        }
        if(v.getId()==R.id.btnBuilditBigger){
            Toast.makeText(this,"This button will launch my Build it Bigger app",Toast.LENGTH_LONG).show();

        }
        if(v.getId()==R.id.btnMakeYourAppMaterial){
            Toast.makeText(this,"This button will launch my Make Your App Material app",Toast.LENGTH_LONG).show();

        }
        if(v.getId()==R.id.btnGoUbiquitous){
            Toast.makeText(this,"This button will launch my Go Ubiquitous app",Toast.LENGTH_LONG).show();

        }
        if(v.getId()==R.id.btnCapstone){
            Toast.makeText(this,"This button will launch my Capstone app",Toast.LENGTH_LONG).show();

        }

    }
}
