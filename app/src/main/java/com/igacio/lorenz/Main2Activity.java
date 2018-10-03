package com.igacio.lorenz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Intent i = new Intent(this, CustomService.class);
        this.startService(i);
    }
    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.btn2){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.act2Map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.583494, 120.978261"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }
    }
}
