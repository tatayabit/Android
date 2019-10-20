package com.tatayab.tatayab.ui.concierge;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tatayab.tatayab.R;

public class ConciergeFragment extends Fragment {

    private ConciergeViewModel conciergeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        conciergeViewModel =
                ViewModelProviders.of(this).get(ConciergeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_concierge, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        conciergeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}