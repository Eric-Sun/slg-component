package com.h13.slg.core.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: sunbo
 * Date: 14-3-4
 * Time: 下午5:44
 * To change this template use File | Settings | File Templates.
 */
public class SlgLogger {


    public static void info(SlgLoggerEntity obj) {
        Logger log = LoggerFactory.getLogger("slg." + obj.getType());
        log.info(obj.toString());
    }

    /**
     * 程序集bug
     *
     * @param obj
     */
    public static void error(SlgLoggerEntity obj) {
        Logger log = LoggerFactory.getLogger("slg." + obj.getType());
        log.error(obj.toString(), obj.getThrowable());
    }

    /**
     * 用来记录unexpected日志
     *
     * @param obj
     */
    public static void warn(SlgLoggerEntity obj) {
        Logger log = LoggerFactory.getLogger("slg." + obj.getType());
        log.warn(obj.toString());

    }

    public static void debug(SlgLoggerEntity obj) {
        Logger log = LoggerFactory.getLogger("slg." + obj.getType());
        if (log.isDebugEnabled()) {
            log.debug(obj.toString());
        }
    }


}
