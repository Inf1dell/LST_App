package apk.karmak.lst_app.main.home.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import apk.karmak.lst_app.R;

public class TestActivity extends AppCompatActivity {

    Integer im = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        ImageView imageView43= findViewById(R.id.imageView43);
        imageView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(im==0){
                    imageView43.setImageResource(R.drawable.f_test2);
                    im=im+1;
                }else if(im==1){
                    imageView43.setImageResource(R.drawable.f_test3);
                    im=im+1;
                }else if(im==2){
                    imageView43.setImageResource(R.drawable.f_test4);
                    im=im+1;
                }else if(im==3){
                    imageView43.setImageResource(R.drawable.f_test5);
                    im=im+1;
                }else if(im==4){
                    imageView43.setImageResource(R.drawable.f_test6);
                    im=im+1;
                }else if(im==5){
                    imageView43.setImageResource(R.drawable.f_test7);
                    im=im+1;
                }else if(im==6){
                    imageView43.setImageResource(R.drawable.f_test8);
                    im=im+1;
                }else if(im==7){
                    imageView43.setImageResource(R.drawable.f_test9);
                    im=im+1;
                }else if(im==8){
                    imageView43.setImageResource(R.drawable.f_test10);
                    im=im+1;
                }else if(im==9){
                    imageView43.setImageResource(R.drawable.f_test11);
                    im=im+1;
                }else{
                    Intent end= new Intent(TestActivity.this, EndTestActivity.class);
                    startActivity(end);
                    finish();
                }

            }
        });
    }
}