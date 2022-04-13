package com.team.latihanfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FragmentDua extends Fragment {

    //inisialisasi widget
    FloatingActionButton floatingActionButton;
    EditText edtUsername, edtPassword;
    String username, password;

    public FragmentDua() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dua, container, false);

        floatingActionButton = view.findViewById(R.id.fabLogin);
        edtUsername = view.findViewById(R.id.editUsername);
        edtPassword = view.findViewById(R.id.editPassword);
        floatingActionButton.setOnClickListener(v -> {

            username = edtUsername.getText().toString();
            password = edtPassword.getText().toString();

            Bundle bundle = new Bundle();
            bundle.putString("username", username);
            bundle.putString("password", password);

            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            FragmentSatu fragmentSatu = new FragmentSatu();
            fragmentSatu.setArguments(bundle);

            transaction.replace(R.id.container_dua, fragmentSatu);
            transaction.commit();
        });

        return view;
    }
}