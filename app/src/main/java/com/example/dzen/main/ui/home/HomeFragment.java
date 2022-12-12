package com.example.dzen.main.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
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

        Feeling[] owls = new Feeling[6];
        owls[0] = new Feeling("meow", "");
        owls[1] = new Feeling("meow", "");
        owls[2] = new Feeling("meow", "");
        owls[3] = new Feeling("meow", "");
        owls[4] = new Feeling("meow", "");
        owls[5] = new Feeling("meow", "");

        // создаем адаптер
        FeelingsAdapter adapter = new FeelingsAdapter(owls);
        // задаем адаптер в ресайклере
        recFeeling.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext(),
                RecyclerView.HORIZONTAL,
                false
        );
        recFeeling.setLayoutManager(manager);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
