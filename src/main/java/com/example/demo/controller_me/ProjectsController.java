/*
package com.example.demo.controller_me;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import se.hexastudio.craftson.exception.ResourceNotFoundException;
import se.hexastudio.craftson.pojos_entity_data_me.Customer;
import se.hexastudio.craftson.pojos_entity_data_me.Projects;
import se.hexastudio.craftson.service_me.ProjectsService;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("projects")
public class ProjectsController {
    private final ProjectsService projectsService;

    @GetMapping("")
    public List<Projects> getAllProjects() {
        return projectsService.getAllProjects();
    }


    @GetMapping("/{id}")
    public Projects getProjectById(@PathVariable Long id) throws ResourceNotFoundException {
        return projectsService.getProjectsById(id);
    }

    @GetMapping("getproject/{title}")
    public Optional<Object[]> getProjectByTitle(@PathVariable String title) throws ResourceNotFoundException {
        return projectsService.getProjectByTitle(title);
    }

    @PostMapping("")
    public Projects createProject(@RequestBody Projects projects) {
        return projectsService.createProject(projects);
    }

    @PatchMapping("/{id}")
    public Projects updateProject(@PathVariable Long id, @RequestBody Map<Object, Object> fields) throws ResourceNotFoundException, ParseException {
        Projects project = projectsService.getProjectsById(id);
        return projectsService.updateProject(project, fields);
    }

    @DeleteMapping("/{id}")
    public String deleteProjectById(@PathVariable Long id) throws ResourceNotFoundException {
        return projectsService.deleteProjectById(id);
    }

    @PostMapping("/customer/{id}")
    public Customer addNewProjectToExistingCustomer(@RequestBody Projects projects, @PathVariable Long id) {
        return projectsService.addNewProjectToExistingCustomer(projects, id);
    }

    @PutMapping("/customer/{customerId}/project/{projectId}")
    public Customer addExistingCustomerToExistingProject(@PathVariable("customerId") Long customerId, @PathVariable("projectId") Long projectId) {
        return projectsService.addExistingCustomerToExistingProject(customerId, projectId);
    }


}
*/
