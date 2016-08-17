/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.test;

import org.apache.log4j.Logger;

/**
 * <P>
 * Description:TODO
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年5月16日下午9:52:18
 */
public class MyOutputBean {

    private static Logger logger = Logger.getLogger(MyOutputBean.class);

    public static void main(String[] args) {
        logger.debug("tiaoshixinxi");
        logger.info("putongxinxi");
        logger.warn("jinggaoxinxi");
        logger.error("cuowuxinxi");
        logger.fatal("zhimingxinxi");
    }

}

