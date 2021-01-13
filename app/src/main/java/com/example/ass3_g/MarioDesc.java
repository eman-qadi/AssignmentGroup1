package com.example.ass3_g;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MarioDesc extends AppCompatActivity {

    ImageView imageView ;
    TextView name_txt , dec_txt ;
    String data1 , data2 ;
    int myIdImage ;
    Button btn ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mario_detales);
        imageView = findViewById(R.id.marioImg);
        name_txt = findViewById(R.id.txtname);
        dec_txt = findViewById(R.id.txtdescre);

        getData();
        setData();

    }
    private  void getData()
    {
        if(getIntent().hasExtra("images") && getIntent().hasExtra("name1") && getIntent().hasExtra("name2"))
        {
            data1 = getIntent().getStringExtra("name1");
            data2 = getIntent().getStringExtra("name2");
            myIdImage= getIntent().getIntExtra("images",1);

        }
    }
    private  void setData()
    {
        name_txt.setText(data1);
        dec_txt.setText(data2);
        imageView.setImageResource(myIdImage);
    }
    public void btn_OnClick(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
