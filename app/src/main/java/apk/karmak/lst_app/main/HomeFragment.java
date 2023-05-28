
package apk.karmak.lst_app.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import apk.karmak.lst_app.R;
import apk.karmak.lst_app.main.Profile.ProfileActivity;


public class HomeFragment extends Fragment {

    LinearLayout profile;
    ImageView rank;

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
//        rank.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent prf = new Intent(getActivity(), RankActivity.class);
//                startActivity(prf);
//            }
//        });


        return v;
    }
}