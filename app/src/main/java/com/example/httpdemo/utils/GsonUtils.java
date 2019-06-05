package com.example.httpdemo.utils;

import com.google.gson.Gson;

/**
 *
 * Description 类描述：项目的util工具 gson解析
 * Author puyantao
 * Email 1067899750@qq.com
 * Date 2019/6/5 16:26
 */
public class GsonUtils {
    public static Gson gson = new Gson();
    /**
     * 说明：如果解析抛异常返回null
     * @param result 要解析的json字符串
     * @param clazz 对应的javabean的字节码
     * @return 返回 对应的javabean 对象
     */
    public static <T> T fromJson(String result, Class<T> clazz){
        try{
            if(gson==null){
                gson = new Gson();
            }
            return gson.fromJson(result, clazz);
        }catch (Exception e){

            return null;
        }
    }

    public static String toJson(Object obj){
        if(null == gson){
            gson = new Gson();
        }
        return gson.toJson(obj);
    }
}
