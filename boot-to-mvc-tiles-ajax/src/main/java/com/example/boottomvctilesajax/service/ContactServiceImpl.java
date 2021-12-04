package com.example.boottomvctilesajax.service;

import com.example.boottomvctilesajax.dao.ContactDao;
import com.example.boottomvctilesajax.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactDao contactDao;

    @Override
    public void saveContact(Contact contact) {
        contactDao.saveContact(contact);
    }
}
