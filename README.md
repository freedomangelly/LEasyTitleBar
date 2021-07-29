# 标题栏

#### 集成步骤

```groovy
dependencies {
    https://github.com/freedomangelly/LEasyTitleBar
    implementation 'com.github.freedomangelly:LEasyTitleBar:0.0.0.1'
}
```

```xml
<declare-styleable name="TitleBar">
    <!-- 整体样式 -->
    <attr name="barStyle">
        <enum name="light" value="0x10" />
        <enum name="night" value="0x20" />
        <enum name="transparent" value="0x30" />
        <enum name="ripple" value="0x40" />
    </attr>
    <!-- 中间 -->
    <attr name="title" format="string" />
    <attr name="titleColor" format="color" />
    <attr name="titleSize" format="dimension" />
    <attr name="titleGravity">
        <flag name="top" value="0x30" />
        <flag name="bottom" value="0x50" />
        <flag name="left" value="0x03" />
        <flag name="right" value="0x05" />
        <flag name="center_vertical" value="0x10" />
        <flag name="center_horizontal" value="0x01" />
        <flag name="center" value="0x11" />
        <flag name="start" value="0x00800003" />
        <flag name="end" value="0x00800005" />
    </attr>
    <attr name="titleStyle">
        <flag name="normal" value="0" />
        <flag name="bold" value="1" />
        <flag name="italic" value="2" />
    </attr>
    <!-- 左边 -->
    <attr name="leftTitle" format="string"/>
    <!-- leftIcon 优先于 backButton -->
    <attr name="leftIcon" format="reference" />
    <attr name="leftTint" format="color" />
    <!-- 返回按钮（默认开） -->
    <attr name="backButton" format="boolean" />
    <attr name="leftColor" format="color" />
    <attr name="leftSize" format="dimension" />
    <attr name="leftBackground" format="reference|color" />
    <!-- 右边 -->
    <attr name="rightTitle" format="string" />
    <attr name="rightIcon" format="reference" />
    <attr name="rightTint" format="color" />
    <attr name="rightColor" format="color" />
    <attr name="rightSize" format="dimension" />
    <attr name="rightBackground" format="reference|color" />
    <!-- 分割线 -->
    <attr name="lineVisible" format="boolean" />
    <attr name="lineColor" format="reference|color" />
    <attr name="lineSize" format="dimension" />
    <!-- 图标显示大小 -->
    <attr name="drawableSize" format="dimension" />
    <!-- 图标和文字的间距 -->
    <attr name="android:drawablePadding" />
    <!-- 控件水平内间距 -->
    <attr name="android:paddingVertical" />
    <!-- 控件垂直内间距（可用于调整标题栏自适应的高度） -->
    <attr name="android:paddingHorizontal" />
</declare-styleable>
```

#### XML示例

> [点我查看完整的Demo示例](app/src/main/res/layout/activity_titlebar.xml)

```xml
<com.hjq.bar.TitleBar
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:title="默认的标题栏" />
```

#### 设置监听事件

```java
mTitleBar.setOnTitleBarListener(new OnTitleBarListener() {

    @Override
    public void onLeftClick(View v) {
        ToastUtils.show("左项View被点击");
    }

    @Override
    public void onTitleClick(View v) {
        ToastUtils.show("中间View被点击");
    }

    @Override
    public void onRightClick(View v) {
        ToastUtils.show("右项View被点击");
    }
});
```

#### 统一 TitleBar 样式

> 如果对 TitleBar 的默认样式或者属性不满意，可以在 Application 初始化的地方进行拦截并修改

```java
public class XXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化 TitleBar
        TitleBar.setDefaultInitializer(new LightBarInitializer() {
            @Override
            public TextView getLeftView(Context context) {
                return super.getLeftView(context);
            }

            @Override
            public TextView getTitleView(Context context) {
                return super.getTitleView(context);
            }

            @Override
            public TextView getRightView(Context context) {
                return super.getRightView(context);
            }

            @Override
            public View getLineView(Context context) {
                return super.getLineView(context);
            }

            @Override
            public Drawable getBackgroundDrawable(Context context) {
                return super.getBackgroundDrawable(context);
            }

            @Override
            public Drawable getBackIcon(Context context) {
                return super.getBackIcon(context);
            }

            @Override
            public int getHorizontalPadding(Context context) {
                return super.getHorizontalPadding(context);
            }

            @Override
            public int getVerticalPadding(Context context) {
                return super.getVerticalPadding(context);
            }
        });
    }
}
```

#### 框架亮点

* 性能最佳：不使用 LayoutInflater，而使用代码创建 View 的形式

* 体验最优：TitleBar 默认样式效果已经非常好，可下载 Demo 测试

* 支持操控子控件：可以在代码中获取 TitleBar 的子控件进行调用相关的 API

* 兼容沉浸式状态栏：兼容 Github 的沉浸式状态栏框架，达到完全沉浸的效果

* 框架兼容性良好：本框架不依赖任何第三方库，支持兼容所有的安卓版本

* 支持全局配置样式：可以在 Application 中初始化 TitleBar 样式，达到一劳永逸的效果

