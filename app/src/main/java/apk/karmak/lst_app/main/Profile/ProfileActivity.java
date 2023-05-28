package apk.karmak.lst_app.main.Profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import apk.karmak.lst_app.LoginActivity;
import apk.karmak.lst_app.R;
import apk.karmak.lst_app.utils.MyDialogFragment;

public class ProfileActivity extends AppCompatActivity {
    Button exit_btn,otzov_btn;
    TextView textView27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        exit_btn=findViewById(R.id.exit_btn);
        exit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetExit = new BottomSheetDialog(ProfileActivity.this);
                bottomSheetExit.setContentView(R.layout.bottom_exit_layout);
                bottomSheetExit.show();
            }
        });
        otzov_btn=findViewById(R.id.otzov_btn);
        otzov_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getSupportFragmentManager();
                MyDialogFragment myDialogFragment = new MyDialogFragment();
                myDialogFragment.show(manager, "myDialog");
            }
        });

        textView27=findViewById(R.id.textView27);
        textView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent edit = new Intent(ProfileActivity.this, EditActivity.class);
                startActivity(edit);
            }
        });
    }
}