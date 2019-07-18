package com.freestyle.framework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.freestyle.framework.FrameworkApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=FrameworkApplication.class)
public class FrameworkBaseTest {
    public static Logger logger = LoggerFactory.getLogger(FrameworkBaseTest.class);
    
	@Test
	public void testKingtoolsMethod() {
	    logger.info("####### I am in testKingtoolsMethod...");
	}

}
