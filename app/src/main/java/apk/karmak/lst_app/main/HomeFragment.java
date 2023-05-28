
package apk.karmak.lst_app.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import apk.karmak.lst_app.R;
import apk.karmak.lst_app.main.Profile.ProfileActivity;
import apk.karmak.lst_app.main.home.rank.RankActivity;
import apk.karmak.lst_app.main.home.test.TInfoActivity;


public class HomeFragment extends Fragment {

    LinearLayout profile;
    ImageView rank;
    ConstraintLayout test1,test2,test3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        profile=v.findViewById(R.id.linearLayout_profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prf = new Intent(getActivity(), ProfileActivity.class);
                startActivity(prf);
            }
        });
        rank=v.findViewById(R.id.imageView_rank);
        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prf = new Intent(getActivity(), RankActivity.class);
                startActivity(prf);
            }
        });
        test1=v.findViewById(R.id.test1);
        test2=v.findViewById(R.id.test2);
        test3=v.findViewById(R.id.test3);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent test = new Intent(getActivity(), TInfoActivity.class);
                startActivity(test);
            }
        });
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent test = new Intent(getActivity(), TInfoActivity.class);
                startActivity(test);
            }
        });
        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent test = new Intent(getActivity(), TInfoActivity.class);
                startActivity(test);
            }
        });


        return v;
    }
}