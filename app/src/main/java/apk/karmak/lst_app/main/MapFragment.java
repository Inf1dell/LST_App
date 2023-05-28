package apk.karmak.lst_app.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import apk.karmak.lst_app.R;
import apk.karmak.lst_app.main.Profile.ProfileActivity;


public class MapFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_map, container, false);

        ImageView imageView19 = v.findViewById(R.id.imageView19);
        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetMap = new BottomSheetDialog(getActivity());
                bottomSheetMap.setContentView(R.layout.bottom_map_layout);
                bottomSheetMap.show();
            }
        });



        return v;
    }
}