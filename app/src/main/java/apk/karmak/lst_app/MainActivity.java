package apk.karmak.lst_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import apk.karmak.lst_app.auth.LoginArtFragment;
import apk.karmak.lst_app.main.ChatFragment;
import apk.karmak.lst_app.main.HomeFragment;
import apk.karmak.lst_app.main.LentaFragment;
import apk.karmak.lst_app.main.MapFragment;
import apk.karmak.lst_app.main.VideoFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        openFragment(new HomeFragment());

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_reg, new HomeFragment()).commit();
                        return true;
                    case R.id.video:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_reg, new VideoFragment()).commit();
                        return true;
                    case R.id.lenta:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_reg, new LentaFragment()).commit();
                        return true;
                    case R.id.chat:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_reg, new ChatFragment()).commit();
                        return true;
                    case R.id.map:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_reg, new MapFragment()).commit();
                        return true;
                }
                return false;
            }
        });
    }

}