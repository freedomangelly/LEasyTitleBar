package com.lightyear.leasytitlebar;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.lightyear.leasytoast.ToastUtils;
import com.lightyear.librarytitlebar.OnTitleBarListener;
import com.lightyear.librarytitlebar.TitleBar;


/**
*TitleBarActivity
*TitleBar 使用案例
*author Light Year
*email 674919909@qq.com
* created 2021/7/29
*
*/
public class TitleBarActivity extends AppCompatActivity {

    private TitleBar mTitleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.lightyear.leasytitlebar.R.layout.activity_titlebar);

        mTitleBar = findViewById(R.id.tb_main_bar);
        mTitleBar.setOnTitleBarListener(new OnTitleBarListener() {

            @Override
            public void onLeftClick(View v) {
                ToastUtils.show("左项 View 被点击");
            }

            @Override
            public void onTitleClick(View v) {
                ToastUtils.show("中间 View 被点击");
            }

            @Override
            public void onRightClick(View v) {
                ToastUtils.show("右项 View 被点击");
            }
        });
    }
}