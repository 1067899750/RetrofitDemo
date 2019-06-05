package com.example.httpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.httpdemo.model.Login;
import com.example.httpdemo.http.netutils.RetrofitFactory;

import io.reactivex.observers.DisposableObserver;

public class MainActivity extends AppCompatActivity {
    private String password = "e10adc3949ba59abbe56e057f20f883e";
    private String mobile = "18503970627";
    private String cid = "3b09a4f6455c0a4fc724d4135cab2dbc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        RetrofitFactory.getInstance().toSubscribe(RetrofitFactory.getInstance().getHttpApi().getLogin(password, mobile, cid),
                new DisposableObserver<Login>() {
            @Override
            public void onNext(Login login) {
                Toast.makeText(MainActivity.this,login.toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(Throwable e) {
                Log.d("-->", e.toString());
            }

            @Override
            public void onComplete() {

            }
        });

    }


}
