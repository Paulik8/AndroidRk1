package ru.paul.tpandroid1;

import android.annotation.SuppressLint;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.awt.font.TextAttribute;
import java.util.Date;

import ru.mail.park.articlelistlib.Article;
import ru.mail.park.articlelistlib.ArticleListFragment;
import ru.mail.park.articlelistlib.OnArticleClickListener;

public class MainActivity extends AppCompatActivity implements OnArticleClickListener {
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;
    TextView title;
    private Date date;
    private String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArticleListFragment articleListFragment = new ArticleListFragment();
        articleListFragment.setOnArticleClickListener(this);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, articleListFragment);
        fragmentTransaction.commit();

    }

    private void changeToFragment(Article article) {
    }

    @Override
    public void onArticleClick(Article article) {
        News news = new News();
        Bundle bundle = new Bundle();
        //bundle.putString("content", article.getContent());
        bundle.putString("header", article.getTitle());
        news.setArguments(bundle);
        //news.setter();
        //bundle.("title", article.getTitle());
        // = findViewById(R.id.header);
        //title.setText(article.getTitle());
        //changeToFragment(article);
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, news).addToBackStack("lol");
        fragmentTransaction.commit();
    }
}
