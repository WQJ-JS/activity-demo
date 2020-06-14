package com.wuqj.util;

import org.activiti.engine.impl.cfg.IdGenerator;

import java.util.UUID;

/**
 * @description: 主键生成工具类
 * @author: wuqj
 * @date: 2020/6/14 16:41
 */
public class IdUtil implements IdGenerator {

    /**
     * @description: 生成随机UUID
     * @author: wuqj
     * @date: 2020/6/14 16:40
     * @param :
     * @return: java.lang.String
     */
    public static String uuid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    /**
     * @description: activity ID 生成
     * @author: wuqj
     * @date: 2020/6/14 16:38
     * @param :
     * @return: java.lang.String
     */
    @Override
    public String getNextId() {
        return IdUtil.uuid();
    }
}
