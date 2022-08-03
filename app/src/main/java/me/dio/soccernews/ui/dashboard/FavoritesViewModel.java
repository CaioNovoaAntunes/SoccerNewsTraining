package me.dio.soccernews.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FavoritesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;


// método para instanciar uma MutableLiveData o qual aposar instânciar set o texto.
    public FavoritesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is favorites fragment");
    }
    // Objeto observable
    public LiveData<String> getText() {
        return mText;
    }
}