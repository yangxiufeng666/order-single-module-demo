package com.dsy.order.infrastructure.config;

import org.apache.ibatis.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-02-25
 * @time 11:28
 */
public class MybatisLogger implements Log {

    Logger log;

    public MybatisLogger(String clazz) {
        if ("org.mybatis.spring.SqlSessionUtils".equals(clazz)){
            return;
        }
        if ("org.mybatis.spring.transaction.SpringManagedTransaction".equals(clazz)){
            return;
        }
        log = LoggerFactory.getLogger(clazz);
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public void error(String s, Throwable e) {
        if (null != log ){
            log.error(s , e);
        }
    }

    @Override
    public void error(String s) {
        if (null != log ){
            log.error(s);
        }
    }

    @Override
    public void debug(String s) {
        if (null != log ){
            log.info(s);
        }
    }

    @Override
    public void trace(String s) {
        if (null != log ){
            log.trace(s);
        }
    }

    @Override
    public void warn(String s) {
        if (null != log ){
            log.warn(s);
        }

    }
}
