package com.ashokit.service;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.ashokit.dao.ContactDao;


public class ContactServiceTest {
	
	@Test
	public void testGetEmailById() {
		
		//creating mock object for Dao layer
		ContactDao daoProxy=EasyMock.createMock(ContactDao.class);
		
		// setting behaviour for proxy
		EasyMock.expect(daoProxy.findEmailById(101)).andReturn("siva@gmail.com");
		EasyMock.replay(daoProxy);
		
		ContactServiceImpl serviceImpl=new ContactServiceImpl();
		serviceImpl.setContactDao(daoProxy);
		String email=serviceImpl.findEmailById(101);
		assertNotNull(email);
	}

}
