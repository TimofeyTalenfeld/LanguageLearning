package ru.yandex.yamblz.languagelearning.util.asynctask;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Build;
import android.os.WorkSource;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import ru.yandex.yamblz.languagelearning.lang.Language;
import ru.yandex.yamblz.languagelearning.lang.Word;
import ru.yandex.yamblz.languagelearning.lang.WordResponse;
import ru.yandex.yamblz.languagelearning.util.function.Consumer;

/**
 * Created by root on 7/23/16.
 */
public class ParseTask extends AsyncTask<String, Void, Word> {

    private Consumer<Word> consumer;

    public ParseTask(Consumer<Word> consumer) {

        this.consumer = consumer;
    }

    @Override
    protected Word doInBackground(String... strings) {

        Log.d("test", "here");
        Log.d("test", strings[0]);

        WordResponse wordResponse = new Gson().fromJson(strings[0], WordResponse.class);

        Log.d("test", wordResponse.getText()[0]);
        Log.d("test", strings[1]);


        Word word = new Word(wordResponse.getText()[0]);
        word.setLanguage(Language.valueOf(strings[1]));

        return word;
    }

    @Override
    protected void onPostExecute(Word word) {
        consumer.accept(word);
    }
}
