package com.jason.rpc.serializer;

/**
 * Created by jason on 2017/7/16.
 */
public interface Serializer {

    String reqSerialize(Class clazz, String method, Object param);

    String respSerialize(Object response);

}
