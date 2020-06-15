package com.ashokit.service;

import com.ashokit.dao.ContactDao;

public class ContactServiceImpl implements ContactService {
	
	private ContactDao contactDao;
     /** manuvally to inject dao object by using set method**/
    public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}


	public String findEmailById(Integer id) {
		
		String email=contactDao.findEmailById(id);
		
		
		return email;
	}

}
