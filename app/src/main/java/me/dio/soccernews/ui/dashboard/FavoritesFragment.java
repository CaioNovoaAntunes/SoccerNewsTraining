package me.dio.soccernews.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import me.dio.soccernews.databinding.FragmentDashboardBinding;

public class FavoritesFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // instanciando view model considerando ciclo de vida da activity
        FavoritesViewModel favoritesViewModel = new ViewModelProvider(this).get(FavoritesViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // instânciado, observa livedata e quando houver
        // estimulo atribui
        // o texto o qual está na tela
        favoritesViewModel.getText().observe(getViewLifecycleOwner(), binding.textNews::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}