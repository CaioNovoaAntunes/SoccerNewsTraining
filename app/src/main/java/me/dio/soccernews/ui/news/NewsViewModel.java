package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        news = new MutableLiveData<>();


        List<News> notices = new ArrayList<>();
            notices.add(new News("Meninas poderoses", "Championes"));
            notices.add(new News("B poderoses", "Perdedores"));
            notices.add(new News("C poderoses", "Ganhadores"));

        this.news.setValue(notices);
        }


    public LiveData<List<News>> getNews() {
        return this.news;
    }
}