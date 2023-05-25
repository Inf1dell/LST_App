package apk.karmak.lst_app.auth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import apk.karmak.lst_app.R;


public class LoginArtFragment extends Fragment {

    Button btn1,btn2,btn3,btn4,btn5;
    Boolean b1=false,b2=false,b3=false,b4=false,b5=false;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login_art, container, false);

        btn1=v.findViewById(R.id.btn_art1);
        btn2=v.findViewById(R.id.btn_art2);
        btn3=v.findViewById(R.id.btn_art3);
        btn4=v.findViewById(R.id.btn_art4);
        btn5=v.findViewById(R.id.btn_art5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1) {
                    b1=false;
                    btn1.setText("sdf");
                }else {
                    b1=true;
                    btn1.setText("qqq");
                }
            }
        });



        return v;
    }
}