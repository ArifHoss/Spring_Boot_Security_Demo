/*
package com.example.demo.service_me;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import se.hexastudio.craftson.exception.ResourceNotFoundException;
import se.hexastudio.craftson.pojos_entity_data_me.ContactPerson;
import se.hexastudio.craftson.pojos_entity_data_me.Projects;
import se.hexastudio.craftson.repo_me.ContactPersonDaoJpa;
import se.hexastudio.craftson.repo_me.CustomerDaoJpa;
import se.hexastudio.craftson.repo_me.ProjectsDaoJpa;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@Service
public class ContactPersonService {

    private ContactPersonDaoJpa contactPersonDaoJpa;
    private ProjectsDaoJpa projectsDaoJpa;
    private CustomerDaoJpa customerDaoJpa;

    public List<ContactPerson> getAllContactPerson() {
        return (List<ContactPerson>) contactPersonDaoJpa.findAll();
    }

    public ContactPerson createContactPerson(ContactPerson contactPerson) {
        return contactPersonDaoJpa.save(contactPerson);
    }

    public ContactPerson getContactPersonById(Long personId) throws ResourceNotFoundException {
        return contactPersonDaoJpa.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("ContactPerson not found!"));
    }

    public String deleteContactPersonById(Long personId) throws ResourceNotFoundException {
        contactPersonDaoJpa.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("ContactPerson not found!"));
        contactPersonDaoJpa.deleteById(personId);
        return "ContactPerson deleted.";
    }

    public ContactPerson updateContactPersonById(ContactPerson contactPerson, Map<Object, Object> fields) throws ParseException {
        fields.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(ContactPerson.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, contactPerson, value);
        });
        contactPerson.setUpdatedDate();
        return contactPersonDaoJpa.save(contactPerson);
    }

    public Projects addContactPersonToExistingProject(ContactPerson contactPerson, Long id) {

        Projects projects = projectsDaoJpa.findById(id).get();
        contactPerson.setProjects(projects);
        contactPersonDaoJpa.save(contactPerson);

        return projects;

    }

    public Projects addExistingContactPersonToExistingProject(Long projectId, Long personId) {

        Projects p = projectsDaoJpa.findById(projectId).get();
        ContactPerson person = contactPersonDaoJpa.findById(personId).get();
        person.setProjects(p);
        contactPersonDaoJpa.save(person);
        return p;
    }

}
*/
