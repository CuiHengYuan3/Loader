package com.example.lenovo.loader;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
private  Loader loader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       loader=new Loader(MainActivity.this);
         final ImageView imageView=findViewById(R.id.image);
        Button button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                loader.bindBitmap("https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13628.jpg",imageView,imageView.getMaxWidth(),imageView.getMaxHeight());
            }
        });
    }
}
