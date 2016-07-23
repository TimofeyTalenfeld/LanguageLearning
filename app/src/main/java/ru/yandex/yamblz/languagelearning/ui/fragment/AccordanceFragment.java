package ru.yandex.yamblz.languagelearning.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import ru.yandex.yamblz.languagelearning.R;
import ru.yandex.yamblz.languagelearning.lang.Language;
import ru.yandex.yamblz.languagelearning.lang.Word;

/**
 * Created by root on 7/23/16.
 */
public class AccordanceFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.accordance_fragment, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();

    }

}
