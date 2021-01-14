package com.kkn1.mindahannewnormal;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Button button1, button2, button3, button4;
    Button nas, jateng, jepara;
    Button hot, wa, bshare;

    private boolean adaInternet(){
        ConnectivityManager koneksi = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        return koneksi.getActiveNetworkInfo() != null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1=findViewById(R.id.hperiksa);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,PeriksaActivity.class);
                startActivity(intent);

            }
        });
        button2=findViewById(R.id.htips);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,TipsActivity.class);
                startActivity(intent);
            }
        });
        button3=findViewById(R.id.hfaq);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FaqActivity.class);
                startActivity(intent);
            }
        });
        button4=findViewById(R.id.habout);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

        nas=findViewById(R.id.wnas);
        nas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adaInternet()){
                    Intent intent=new Intent(MainActivity.this,WNasActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent=new Intent(MainActivity.this,NointernetActivity.class);
                    startActivity(intent);
                }

            }
        });
        jateng=findViewById(R.id.wjateng);
        jateng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adaInternet()){
                    Intent intent=new Intent(MainActivity.this,WJatengActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent=new Intent(MainActivity.this,NointernetActivity.class);
                    startActivity(intent);
                }

            }
        });
        jepara=findViewById(R.id.wjepara);
        jepara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adaInternet()){
                    Intent intent=new Intent(MainActivity.this,WJeparaActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent=new Intent(MainActivity.this,NointernetActivity.class);
                    startActivity(intent);
                }

            }
        });

        hot=findViewById(R.id.hotline);
        hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "+628112716119";
                Intent Call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
                startActivity(Call);
            }
        });
        wa=findViewById(R.id.whatsapp);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adaInternet()){
                    Intent intent = new Intent();
                    intent.setAction(intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://wa.me/628112716119"));
                    startActivity(intent);
                }else{
                    Intent intent=new Intent(MainActivity.this,NointernetActivity.class);
                    startActivity(intent);
                }

            }
        });
        bshare=findViewById(R.id.share);
        bshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,BagikanActivity.class);
                startActivity(intent);
            }
        });

    }

}