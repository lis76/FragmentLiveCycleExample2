package ru.synergy.fragmentlivecycleexample2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Date;

public class BlankFragment extends Fragment {

    public BlankFragment(){
        super(R.layout.fragment_content);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button updateButton1 = view.findViewById(R.id.updateButton1);
        TextView updateBox1 = view.findViewById(R.id.dateTextView);

        updateButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curDate = new Date().toString();
                updateBox1.setText(curDate);
            }
        });

        Button updateButton2 = view.findViewById(R.id.updateButton2);
        TextView updateBox2 = view.findViewById(R.id.dateTextView);
        updateButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curDate = new Date().toString();
                updateBox1.setText(curDate);
            }
        });
    }
}