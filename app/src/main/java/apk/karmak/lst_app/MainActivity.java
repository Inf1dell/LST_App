package apk.karmak.lst_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import apk.karmak.lst_app.main.ChatFragment;
import apk.karmak.lst_app.main.HomeFragment;
import apk.karmak.lst_app.main.LentaFragment;
import apk.karmak.lst_app.main.MapFragment;
import apk.karmak.lst_app.main.video.VideoFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new HomeFragment()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new HomeFragment()).commit();
                        return true;
                    case R.id.video:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new VideoFragment()).commit();
                        return true;
                    case R.id.lenta:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new LentaFragment()).commit();
                        return true;
                    case R.id.chat:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new ChatFragment()).commit();
                        return true;
                    case R.id.map:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new MapFragment()).commit();
                        return true;
                }
                return false;
            }
        });
    }

}