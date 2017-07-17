package com.example.user.toasttest;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private Toast toast;
    private Context mContext;
    private int flag = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        mContext = this;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:// 自定义布局
                flag ++ ;
                ToastEmail.getToastEmail().ToastShow(mContext, (flag % 2 == 1 )? R.mipmap.success : R.mipmap.error, "我是Toast要显示的文字");
                break;
            default:
                break;
        }
    }
}
