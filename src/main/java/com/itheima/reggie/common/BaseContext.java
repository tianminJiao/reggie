package com.itheima.reggie.common;

public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrendId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrendId(){
        return threadLocal.get();
    }
}
