package apk.karmak.lst_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class LoginActivity extends AppCompatActivity {

    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final BottomSheetDialog bottomSheetSucc = new BottomSheetDialog(LoginActivity.this);
        bottomSheetSucc.setContentView(R.layout.bottom_successf_layout);


        final BottomSheetDialog bottomSheetPass = new BottomSheetDialog(LoginActivity.this);
        bottomSheetPass.setContentView(R.layout.bottom_password_layout);

        Button codeBtn = bottomSheetPass.findViewById(R.id.sheet_pass_btn);
        codeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetSucc.show();
            }
        });




        login_btn=findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(LoginActivity.this);
                bottomSheetDialog.setContentView(R.layout.bottom_code_layout);

                Button Ibtn = bottomSheetDialog.findViewById(R.id.sheet_code_btn);
                Ibtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bottomSheetPass.show();
                    }
                });
                bottomSheetDialog.show();
            }
        });

    }
}