package com.spring.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.service.HelloService;

/**
 * @Description:   
 *
 * @author         zhuojl
 * @Date           2017年3月31日
 */
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(classes={SpringConfig.class,MybatisConfig.class}) 
public class SpringConfigTest {
	
	@Autowired
	HelloService hServ;
	
	@Test
	public void testSayHelloBaby(){
		System.out.println(233131);
		hServ.sayHelloBaby();
	}
	@Test
	public void testHserv(){
		hServ.useUserMapper();
	}
}
