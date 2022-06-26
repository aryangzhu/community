package com.changzhu.community.mapper;

import com.changzhu.community.CommunityApplication;
import org.junit.Test;
import org.slf4j.Logger;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author leiliu
 * @date 22-6-26 下午3:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class LoggerTest {
    private static final Logger logger=LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test(){
        System.out.println(logger.getName());

        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }
}
