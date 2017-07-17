# ToastView
This is a view with toast

```
Just have a look!
```
![image](https://github.com/SmartXiaoMing001/ToastView/raw/master/pictures/error.jpg)
![image](https://github.com/SmartXiaoMing001/ToastView/raw/master/pictures/success.jpg)

### MainActivity代码
```Java
@Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button://R.mipmap.success->图片
                ToastEmail.getToastEmail().ToastShow(mContext, R.mipmap.success, "我是Toast要显示的文字");
                break;
            default:
                break;
        }
    }
```

```
由于本人还是在校的学生，如果觉得代码对个人的学习有帮助，请路过的朋友帮忙fork和star一下了，小弟不胜感激😊😊😊
```
