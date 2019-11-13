package kr.co.itforone.asiaplus;

import android.app.Activity;
import android.content.Intent;
import android.webkit.JavascriptInterface;

class WebviewJavainterface {

    Activity activity;
    MainActivity mainActivity;


    WebviewJavainterface (MainActivity mainActivity){
        this.mainActivity=mainActivity;
    }
    WebviewJavainterface(Activity activity){
        this.activity=activity;
    }

    @JavascriptInterface
    public void share(String id, String table) {
    }
}
