package com.freestyle.framework.dao;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.freestyle.framework.FrameworkBaseTest;
import com.freestyle.framework.dao.SampleMapper;
import com.freestyle.framework.entity.Sample;

public class SampleMapperTest extends FrameworkBaseTest {
    
    public static final Logger logger = LoggerFactory.getLogger(SampleMapperTest.class);
    
    @Autowired
    private SampleMapper sampleMapper;
    
    
    @Test
    public void getSampleByName() {
        List<Sample> list = sampleMapper.getSampleByName("123");
        logger.info("####### result = {}",JSON.toJSONString(list));
    }
}
