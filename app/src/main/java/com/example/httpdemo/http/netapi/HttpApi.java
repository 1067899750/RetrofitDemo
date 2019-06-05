package com.example.httpdemo.http.netutils.netapi;


import com.example.httpdemo.model.Login;

import io.reactivex.Observable;

import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by 眼神 on 2018/3/27.
 * <p>
 * 存放所有的Api
 */

public interface HttpApi {

    @POST("mobile/login.htm")
    Observable<Login> getLogin(@Query("password") String password,
                               @Query("mobile") String mobile,
                               @Query("cid") String cid);
}
