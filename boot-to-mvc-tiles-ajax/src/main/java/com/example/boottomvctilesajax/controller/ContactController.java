package com.example.boottomvctilesajax.controller;

import com.example.boottomvctilesajax.model.Contact;
import com.example.boottomvctilesajax.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "roytuts.com.homepage";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactPage(){
        return "roytuts.com.contactpage";
    }

//    @RequestMapping(value = "/saveContact", method = RequestMethod.POST)
//    @ResponseBody
//    public String saveContact(@RequestParam(value = "name") String name,
//                              @RequestParam(value = "address") String address,
//                              @RequestParam(value = "phone") String phone) {
//        System.out.println("name : " + name + ", address : " + address + ", phone : " + phone);
//
//        Contact contact = new Contact();
//        contact.setContactName(name);
//        contact.setContactAddress(address);
//        contact.setContactPhone(phone);
//        // save contact to database
//        contactService.saveContact(contact);
//        return "Contact successfully saved";
//    }

    //----------or using HttpServletRequest,
    @RequestMapping(value = "/saveContact", method = RequestMethod.POST)
    @ResponseBody
    public String saveContact(HttpServletRequest request) {
        // or using HttpServletRequest,
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        System.out.println("name : " + name + ", address : " + address + ", phone : " + phone);
        // create contact object
        Contact contact = new Contact();
        contact.setContactName(name);
        contact.setContactAddress(address);
        contact.setContactPhone(phone);
        // save contact to database
        contactService.saveContact(contact);
        return "Contact successfully saved";
    }
}
