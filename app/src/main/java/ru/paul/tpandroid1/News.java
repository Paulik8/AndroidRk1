package ru.paul.tpandroid1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by paul on 07.03.18.
 */

public class News extends Fragment {
    private TextView titleView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_content, container, false);
        titleView = v.findViewById(R.id.header);
        Bundle bundle = getArguments();
        String title = bundle.getString("header");
        titleView.setText(title);
        return v;
    }

    public News setter() {
        return new News();
    }
}
