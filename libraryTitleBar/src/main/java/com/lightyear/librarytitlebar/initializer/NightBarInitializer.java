package com.lightyear.librarytitlebar.initializer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

import com.lightyear.librarytitlebar.R;
import com.lightyear.librarytitlebar.SelectorDrawable;


/**
*NightBarInitializer
*夜间主题样式实现（布局属性：app:barStyle="night"）
*author Light Year
*email 674919909@qq.com
* created 2021/7/29
*
*/
public class NightBarInitializer extends BaseBarInitializer {

    @Override
    public TextView getLeftView(Context context) {
        TextView leftView = super.getLeftView(context);
        leftView.setTextColor(0xCCFFFFFF);
        setViewBackground(leftView, new SelectorDrawable.Builder()
                .setDefault(new ColorDrawable(0x00000000))
                .setFocused(new ColorDrawable(0x66FFFFFF))
                .setPressed(new ColorDrawable(0x66FFFFFF))
                .build());
        return leftView;
    }

    @Override
    public TextView getTitleView(Context context) {
        TextView titleView = super.getTitleView(context);
        titleView.setTextColor(0xEEFFFFFF);
        return titleView;
    }

    @Override
    public TextView getRightView(Context context) {
        TextView rightView = super.getRightView(context);
        rightView.setTextColor(0xCCFFFFFF);
        setViewBackground(rightView, new SelectorDrawable.Builder()
                .setDefault(new ColorDrawable(0x00000000))
                .setFocused(new ColorDrawable(0x66FFFFFF))
                .setPressed(new ColorDrawable(0x66FFFFFF))
                .build());
        return rightView;
    }

    @Override
    public View getLineView(Context context) {
        View lineView = super.getLineView(context);
        setViewBackground(lineView, new ColorDrawable(0xFFFFFFFF));
        return lineView;
    }

    @Override
    public Drawable getBackIcon(Context context) {
        return getDrawableResources(context, R.drawable.bar_arrows_left_white);
    }

    @Override
    public Drawable getBackgroundDrawable(Context context) {
        return new ColorDrawable(0xFF000000);
    }
}