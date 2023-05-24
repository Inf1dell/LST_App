package apk.karmak.lst_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoard extends AppCompatActivity {

    public static ViewPager viewPager;
    SlideViewPagerAdapter adapter;
    Button reg,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);

        reg = findViewById(R.id.reg_btn_board);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regis = new Intent(OnBoard.this, RegActivity.class);
                startActivity(regis);
            }
        });
        login = findViewById(R.id.log_btn_board);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regis = new Intent(OnBoard.this, LoginActivity.class);
                startActivity(regis);
            }
        });


        viewPager=findViewById(R.id.viewpager);
        adapter=new SlideViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

//        if (isOpenAlread())
//        {
//            Intent intent=new Intent(OnBoard.this, LoginActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(intent);
//        }
//        else
//        {
//            SharedPreferences.Editor editor=getSharedPreferences("board_pref",MODE_PRIVATE).edit();
//            editor.putBoolean("board",true);
//            editor.commit();
//        }

    }

    private boolean isOpenAlread() {
        SharedPreferences sharedPreferences=getSharedPreferences("board_pref",MODE_PRIVATE);
        return sharedPreferences.getBoolean("board",false);

    }
}