package com.example.dzen.main.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dzen.databinding.FragmentHomeBinding;
import com.example.dzen.models.Feeling;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // привязались
        RecyclerView recFeeling = binding.feels;
        // создаем адаптер
        FeelingsAdapter adapter = new FeelingsAdapter(new Feeling[54]);
        // задаем адаптер в ресайклере
        recFeeling.setAdapter(adapter);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}