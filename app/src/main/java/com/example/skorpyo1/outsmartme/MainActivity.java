package com.example.skorpyo1.outsmartme;

import android.app.LoaderManager;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Word>> {


    private static final String REQUEST_URL = "https://gist.githubusercontent.com/DroidCoder/7ac6cdb4bf5e032f4c737aaafe659b33/raw/baa9fe0d586082d85db71f346e2b039c580c5804/words.json";
    private static final int WORD_LOADER_ID = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLoaderManager().initLoader(WORD_LOADER_ID, null, this);

    }

    @Override
    public Loader<List<Word>> onCreateLoader(int id, Bundle args) {
        return new WordLoader(this, REQUEST_URL);
    }

    @Override
    public void onLoaderReset(Loader<List<Word>> loader) {
//        mAdapter.clear();
    }

    @Override
    public void onLoadFinished(Loader<List<Word>> loader, List<Word> data) {
//        mEmptyStateTextView.setText(R.string.no_earthquakes);
//
//        mAdapter.clear();
//        if (data != null && !data.isEmpty()) {
//            mAdapter.addAll(data);
//        }
    }


}
