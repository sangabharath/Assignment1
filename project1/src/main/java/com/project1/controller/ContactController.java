package com.project1.controller;

import com.project1.model.Contact;
import com.project1.repo.ContactRepo;
import com.project1.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/findByName/{firstName}")
    public Contact findByname(@PathVariable String firstName) {
        return contactService.findByName(firstName);
    }
    @GetMapping("/findAllContacts")
    public List<Contact> getContact() {
        return contactService.getContact();
    }

    @PostMapping("/addContact")
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }


    @PutMapping("/removeContact/{contactId}")
    public Contact removeContact(@PathVariable Long contactId){
        return contactService.removeContact(contactId);
    }

    @DeleteMapping("/deleteContactFromDb")
    public String deleteContact(Long contactId) {
        contactService.deleteContact(contactId);
        return "Data Deleted!";
    }

}
