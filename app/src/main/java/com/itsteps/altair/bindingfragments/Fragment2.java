package com.itsteps.altair.bindingfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    View rootview;
    Button getBtn;
    TextView nameTv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        rootview=inflater.inflate(R.layout.fragment2, container, false);

        return rootview;
    }

    @Override
    public void onStart() {
        super.onStart();

        getBtn = rootview.findViewById(R.id.getBtn);
        nameTv=rootview.findViewById(R.id.nameTv);

        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name=((EditText)getActivity().findViewById(R.id.editText1)).getText().toString();
                nameTv.setText(name);
            }
        });
    }
}
