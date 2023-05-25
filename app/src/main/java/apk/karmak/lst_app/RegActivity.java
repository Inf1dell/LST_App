package apk.karmak.lst_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import apk.karmak.lst_app.auth.LoginArtFragment;
import apk.karmak.lst_app.auth.LoginProfileFragment;

public class RegActivity extends AppCompatActivity {

    ProgressBar progressReg;
    Button create;
    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_reg, new LoginProfileFragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        progressReg=findViewById(R.id.progressReg);
        title=findViewById(R.id.textView9);

        create = findViewById(R.id.reg_create_btn);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(create.getText().equals("Создать аккаунт")) {
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_reg, new LoginArtFragment());
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    progressReg.setProgress(6);
                    create.setText("Завершить");
                    title.setText("Что вам больше нравится?");
                }else if(create.getText().equals("Завершить")) {
                    new AlertDialog.Builder(RegActivity.this)
                            .setTitle("Delete entry")
                            .setMessage("Are you sure you want to delete this entry?")
                            .setPositiveButton("Yes", null)
                            .setNegativeButton("No", null)
                            .show();
                }else {
                    Toast.makeText(RegActivity.this, "Error", Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}