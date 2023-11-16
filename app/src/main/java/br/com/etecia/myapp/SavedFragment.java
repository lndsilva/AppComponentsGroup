package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;


public class SavedFragment extends Fragment {

    MaterialButton btnSaved;
    Snackbar snackbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_saved, container, false);

        btnSaved = view.findViewById(R.id.btnSaved);

        btnSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar = Snackbar.make(view, "Salvando arquivo", Snackbar.LENGTH_LONG)
                        .setAction("UNDO",
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(getContext(), "Apagando", Toast.LENGTH_SHORT).show();
                                    }
                                });
                snackbar.show();

            }
        });


        return view;
    }
}