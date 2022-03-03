/*
package com.example.demo.controller_me;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import se.hexastudio.craftson.exception.ResourceNotFoundException;
import se.hexastudio.craftson.pojos_entity_data_me.ContactPerson;
import se.hexastudio.craftson.pojos_entity_data_me.Projects;
import se.hexastudio.craftson.service_me.ContactPersonService;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("contactperson")
public class ContactPersonController {
    private ContactPersonService contactPersonService;

    @GetMapping("")
    public List<ContactPerson> getAllContactPersons() {
        return contactPersonService.getAllContactPerson();
    }

    @GetMapping("/{id}")
    public ContactPerson getContactPersonById(@PathVariable("id") Long personId) throws ResourceNotFoundException {
        return contactPersonService.getContactPersonById(personId);
    }

    @PostMapping("")
    public ContactPerson createContactPerson(@RequestBody ContactPerson contactPerson) {
        return contactPersonService.createContactPerson(contactPerson);
    }


    @PostMapping("/project/{id}")
    public Projects addNewContactPersonToExistingProject(@RequestBody ContactPerson contactPerson, @PathVariable Long id) {
        return contactPersonService.addContactPersonToExistingProject(contactPerson, id);
    }


    @PatchMapping("/person/{id}")
    public ContactPerson updateContactPersonById(@PathVariable Long id, @RequestBody Map<Object, Object> fields) throws ParseException, ResourceNotFoundException {
        ContactPerson contactPerson = contactPersonService.getContactPersonById(id);
        return contactPersonService.updateContactPersonById(contactPerson, fields);
    }

    @DeleteMapping("/{id}")
    public String deleteContactPersonById(@PathVariable("id") Long personId) throws ResourceNotFoundException {
        return contactPersonService.deleteContactPersonById(personId);
    }

    @PutMapping("/project/{projectId}/person/{personId}")
    public Projects addExistingContactPersonToExistingProject(@PathVariable("projectId") Long projectId, @PathVariable("personId") Long personId) {
        return contactPersonService.addExistingContactPersonToExistingProject(projectId, personId);
    }

}
*/
