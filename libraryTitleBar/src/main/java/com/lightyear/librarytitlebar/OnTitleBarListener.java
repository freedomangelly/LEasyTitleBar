package com.lightyear.librarytitlebar;

import android.view.View;

/**
*OnTitleBarListener
*标题栏点击监听接口
*author Light Year
*email 674919909@qq.com
* created 2021/7/29
*
*/
public interface OnTitleBarListener {

    /**
     * 左项被点击
     *
     * @param v     被点击的左项View
     */
    void onLeftClick(View v);

    /**
     * 标题被点击
     *
     * @param v     被点击的标题View
     */
    void onTitleClick(View v);

    /**
     * 右项被点击
     *
     * @param v     被点击的右项View
     */
    void onRightClick(View v);
}