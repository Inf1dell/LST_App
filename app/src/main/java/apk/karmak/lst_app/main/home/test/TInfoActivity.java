package apk.karmak.lst_app.main.home.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import apk.karmak.lst_app.R;

public class TInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinfo);

        ImageView imageView39 = findViewById(R.id.imageView39);
        imageView39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent test = new Intent(TInfoActivity.this, TestActivity.class);
                startActivity(test);
            }
        });
    }
}