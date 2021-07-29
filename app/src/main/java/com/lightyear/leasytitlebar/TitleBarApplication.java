package com.lightyear.leasytitlebar;

import android.app.Application;
import android.content.Context;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatTextView;

import com.lightyear.leasytoast.ToastUtils;
import com.lightyear.librarytitlebar.TitleBar;
import com.lightyear.librarytitlebar.initializer.LightBarInitializer;


public class TitleBarApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化 Toast
        ToastUtils.init(this);

        // 初始化 TitleBar
        TitleBar.setDefaultInitializer(new LightBarInitializer() {
            @Override
            protected TextView createTextView(Context context) {
                return new AppCompatTextView(context);
            }
        });
    }
}
