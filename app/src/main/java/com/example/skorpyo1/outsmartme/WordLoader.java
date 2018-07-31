package com.example.skorpyo1.outsmartme;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class WordLoader extends AsyncTaskLoader<List<Word>>{

    private static final String LOG_TAG = WordLoader.class.getName();
    private String mUrl;

    public WordLoader(Context context, String mUrl) {
        super(context);
        this.mUrl = mUrl;
    }

    @Override
    public List<Word> loadInBackground() {
        String x = null;
        if (mUrl == null) {
            return null;
        }
        List<Word> words = QueryUtils.fetchEarthquakesData(this.mUrl);
        return words;
    }

    protected void onStartLoading() {

        forceLoad();
    }
}

