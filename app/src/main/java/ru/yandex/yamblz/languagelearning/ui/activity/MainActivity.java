package ru.yandex.yamblz.languagelearning.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.yandex.yamblz.languagelearning.R;
import ru.yandex.yamblz.languagelearning.lang.WordStorage;
import ru.yandex.yamblz.languagelearning.ui.fragment.AccordanceFragment;
import ru.yandex.yamblz.languagelearning.util.ContentLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.content_layout, new AccordanceFragment())
                .commit();
        WordStorage.init(getApplicationContext());

    }
}
