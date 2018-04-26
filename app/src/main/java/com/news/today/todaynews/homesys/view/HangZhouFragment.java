package com.news.today.todaynews.homesys.view;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.news.today.todaynews.R;
import com.news.today.todaynews.base.DaggerMvpFragment;

import butterknife.BindView;

/**
 * Created by anson on 2018/4/25.
 */

public class HangZhouFragment extends DaggerMvpFragment {

    @BindView(R.id.tv_home_test)
    TextView tvHomeTest;


    public static HangZhouFragment newInstance() {
        HangZhouFragment homeFragment = new HangZhouFragment();
        return homeFragment;
    }


    @Override
    public int getRootLayoutId() {
        return R.layout.fragment_home_test;
    }

    @Override
    public void afterViewBind(View rootView, Bundle savedInstanceState) {
        tvHomeTest.setText("HangZhou");
    }
}
