1 实现自定义键盘。
2 实现支付密码样式。
转载自
http://www.jianshu.com/p/faa2a9b463ca
http://www.jianshu.com/p/01a75d7827d9

### 1 实现自定义软键盘
* 自定义键盘样式。
* 定义键位。
* 添加动态属性。
* 添加键盘乱序事件。
* 回调添加，删除事件。


### 2 实现支付密码样式

* 自定义输入框样式

          <?xml version="1.0" encoding="utf-8"?>
        <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_height="wrap_content"
        android:layout_width="match_parent">
        <LinearLayout
        android:background="@android:color/transparent"
        android:layout_height="50dp"
        android:layout_margin="20dp"
        android:layout_width="match_parent"
        android:orientation="horizontal">
        <ImageView
            android:id="@+id/item_password_iv1"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_width="0dp"
            android:scaleType="fitXY"
            android:src="@drawable/no_pass_bg" />
        <ImageView
            android:id="@+id/item_password_iv2"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_width="0dp"
            android:scaleType="fitXY"
            android:src="@drawable/no_pass_bg" />
        <ImageView
            android:id="@+id/item_password_iv3"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_width="0dp"
            android:scaleType="fitXY"
            android:src="@drawable/no_pass_bg" />
        <ImageView
            android:id="@+id/item_password_iv4"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_width="0dp"
            android:scaleType="fitXY"
            android:src="@drawable/no_pass_bg" />
        <ImageView
            android:id="@+id/item_password_iv5"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_width="0dp"
            android:scaleType="fitXY"
            android:src="@drawable/no_pass_bg" />
        <ImageView
            android:id="@+id/item_password_iv6"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_width="0dp"
            android:scaleType="fitXY"
            android:src="@drawable/no_pass_bg" />
        </LinearLayout>
        <EditText
        android:background="@android:color/transparent"
        android:id="@+id/item_edittext"
        android:layout_height="50dp"
        android:layout_width="match_parent" />

        <diablo.softkeyboard.com.MyNumKeyBoard
        android:background="#b0b0b0"
        android:focusable="true"
        android:focusableInTouchMode="true"
        android:id="@+id/view_keyboard"
        android:keyBackground="@android:color/white"
        android:keyTextColor="#000000"
        android:layout_alignParentBottom="true"
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:shadowColor="@android:color/transparent"
        android:shadowRadius="0"
        app:wnkv_deleteBackgroundColor="#d2d5db"
        app:wnkv_deleteDrawable="@mipmap/ic_launcher"
        app:wnkv_deleteWidth="22dp" />
        </RelativeLayout>


* 自定义view中实现密码缓存更改有无密码的UI
* 完成输入，回调成功事件。

### 3 效果UI
未输入时样式：

![图片](http://oc4zuck5v.bkt.clouddn.com/nopass.png)

输入后样式

![图片](http://oc4zuck5v.bkt.clouddn.com/pass.png)



