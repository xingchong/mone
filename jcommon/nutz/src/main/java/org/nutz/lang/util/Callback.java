package org.nutz.lang.util;

import java.io.Serializable;

/**
 * 带一个参数的通用回调接口
 * 
 * @author zozoh(zozohtnt@gmail.com)
 * @param <T>
 */
public interface Callback<T> extends Serializable {

    void invoke(T obj);

}
