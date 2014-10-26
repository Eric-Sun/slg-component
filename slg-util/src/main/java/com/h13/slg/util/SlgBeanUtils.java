package com.h13.slg.util;

import com.h13.slg.RequestFatalException;

public class SlgBeanUtils {

    /**
     * 通过field名字获得对应的object中的value
     *
     * @param obj
     * @param name
     * @return
     * @throws RequestFatalException
     */
    public static String getProperty(Object obj, String name) throws RequestFatalException {
        try {
            return org.apache.commons.beanutils.BeanUtils.getProperty(obj, name);
        } catch (Exception e) {
            throw new RequestFatalException(
                    String.format("name=%s,obj class=%s", name, obj.getClass()),
                    e);
        }
    }


    /**
     * 复制对象
     *
     * @param dest 目标对象
     * @param orig 源对象
     * @throws RequestFatalException
     */
    public static void copyProperties(Object dest, Object orig) throws RequestFatalException {
        try {
            org.apache.commons.beanutils.BeanUtils.copyProperties(dest, orig);
        } catch (Exception e) {
            throw new RequestFatalException(
                    String.format("destClz=%s,origClz=%s", dest.getClass(), orig.getClass()),
                    e);
        }
    }
}
