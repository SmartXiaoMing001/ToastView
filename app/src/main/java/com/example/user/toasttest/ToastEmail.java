package com.example.user.toasttest;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 2017/7/17.
 */

public class ToastEmail {

    public static ToastEmail mToastEmail;
    private Toast toast;

    private ToastEmail() {
    }

    public static ToastEmail getToastEmail() {
        if (mToastEmail == null) {
            mToastEmail = new ToastEmail();
        }
        return mToastEmail;
    }

    /**
     * 显示
     */
    public void ToastShow(Context context, int resourceId, String str) {
        View view = LayoutInflater.from(context).inflate(R.layout.toast_email, null);
        TextView text = (TextView) view.findViewById(R.id.textToast);
        text.setText(str); // 设置显示文字

        ImageView imageView = (ImageView)view.findViewById(R.id.img_source);
        imageView.setImageResource(resourceId);

        toast = new Toast(context);
        toast.setGravity(Gravity.CENTER, 0, 0); // Toast显示的位置
        toast.setDuration(Toast.LENGTH_LONG); // Toast显示的时间
        toast.setView(view);
        toast.show();

    }

    public void ToastCancel() {
        if (toast != null) {
            toast.cancel();
        }
    }



}
