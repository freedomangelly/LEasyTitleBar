package com.lightyear.librarytitlebar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;


/**
*ITitleBarInitializer
*默认初始化器
*author Light Year
*email 674919909@qq.com
* created 2021/7/29
*
*/
public interface ITitleBarInitializer {

    /**
     * 获取左标题 View
     */
    TextView getLeftView(Context context);

    /**
     * 获取中间标题 View
     */
    TextView getTitleView(Context context);

    /**
     * 获取右标题 View
     */
    TextView getRightView(Context context);

    /**
     * 获取分割线 View
     */
    View getLineView(Context context);

    /**
     * 获取标题栏背景
     */
    Drawable getBackgroundDrawable(Context context);

    /**
     * 获取子控件的水平内间距
     */
    int getHorizontalPadding(Context context);

    /**
     * 获取子控件的垂直内间距
     */
    int getVerticalPadding(Context context);
}