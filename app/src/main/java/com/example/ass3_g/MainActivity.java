package com.example.ass3_g;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler = findViewById(R.id.mario);

        String[] captions= new String[MarioBakery.mariobaber.length];
        String[] dec= new String[MarioBakery.mariobaber.length];
        int[] ids = new int[MarioBakery.mariobaber.length];
        for (int i =0;i<captions.length ;i++){
            captions[i]=MarioBakery.mariobaber[i].getName();
            ids[i]= MarioBakery.mariobaber[i].getIdImg();
            dec[i]=MarioBakery.mariobaber[i].getDescription();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter=new Adapter(captions,ids,dec,this);
        recycler.setAdapter(adapter);
    }
}