/*
package com.example.demo.service_me;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import se.hexastudio.craftson.exception.ResourceNotFoundException;
import se.hexastudio.craftson.pojos_entity_data_me.Customer;
import se.hexastudio.craftson.pojos_entity_data_me.Projects;
import se.hexastudio.craftson.repo_me.CustomerDaoJpa;
import se.hexastudio.craftson.repo_me.ProjectsDaoJpa;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@AllArgsConstructor
@Service("ProjectsService")
public class ProjectsService {

    private final ProjectsDaoJpa projectsDaoJpa;
    private final CustomerDaoJpa customerDaoJpa;


    public List<Projects> getAllProjects() {
        return (List<Projects>) projectsDaoJpa.findAll();
    }

    public Projects createProject(Projects projects) {
        return projectsDaoJpa.save(projects);
    }

    public Projects getProjectsById(Long projectsId) throws ResourceNotFoundException {
        return projectsDaoJpa.findById(projectsId)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found, Please try with valid project Id"));
    }

    public Optional<Object[]> getProjectByTitle(String title) {
        return projectsDaoJpa.findOrderByTitle(title);
    }


    public Projects updateProject(Projects project, Map<Object, Object> fields) throws ParseException {
        fields.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(Projects.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, project, value);
        });
        project.setUpdatedDate();
        return projectsDaoJpa.save(project);
    }

    public String deleteProjectById(Long id) throws ResourceNotFoundException {
        projectsDaoJpa.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not exit! "));
        projectsDaoJpa.deleteById(id);

        return "Projects with ID '" + id + "' has been deleted successfully!";
    }

    public Customer addNewProjectToExistingCustomer(Projects projects, Long id) {
        Customer customer = customerDaoJpa.findById(id).get();

        projects.setCustomer(customer);
        projectsDaoJpa.save(projects);

        return customer;
    }

    public Customer addExistingCustomerToExistingProject(Long customerId, Long projectId) {
        Customer c = customerDaoJpa.findById(customerId).get();
        Projects p = projectsDaoJpa.findById(projectId).get();
        p.setCustomer(c);
        projectsDaoJpa.save(p);
        return c;

    }
}
*/
