package com.example.lc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        post p = new post();
        t = (TextView)findViewById(R.id.txt);
        requestpermision();
        p.Post(MainActivity.this,"https://s2446577@lamp.ms.wits.ac.za/home/public_html/cars.php",t);


    }

    public void requestpermision(){
        Object thisActivity;
        if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED)
        {
            // Permission is not granted

            Toast.makeText(this, "PERMISION denied", Toast.LENGTH_SHORT).show();
        }
        else{

        }
    }
}