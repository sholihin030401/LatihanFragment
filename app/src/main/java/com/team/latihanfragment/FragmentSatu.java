package com.team.latihanfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentSatu extends Fragment {

    TextView txusername, txpassword;

    public FragmentSatu() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_satu, container, false);

        Bundle bundle = getArguments();
        String username = bundle.getString("username");
        String password = bundle.getString("password");

        txusername = view.findViewById(R.id.txUsername);
        txpassword = view.findViewById(R.id.txPassword);

        txusername.setText(username);
        txpassword.setText(password);
        return view;
    }
}