/*
package com.example.demo.service_me;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import se.hexastudio.craftson.exception.ResourceNotFoundException;
import se.hexastudio.craftson.pojos_entity_data_me.Materials;
import se.hexastudio.craftson.pojos_entity_data_me.Projects;
import se.hexastudio.craftson.repo_me.MaterialsDaoJpa;
import se.hexastudio.craftson.repo_me.ProjectsDaoJpa;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@Service
public class MaterialsService {

    private MaterialsDaoJpa materialsDaoJpa;
    private final ProjectsDaoJpa projectsDaoJpa;

    public List<Materials> getAllMaterials() {
        return (List<Materials>) materialsDaoJpa.findAll();
    }

    public Materials createMaterial(Materials materials) {
        return materialsDaoJpa.save(materials);
    }

    public Materials getMaterialById(Long materialId) throws ResourceNotFoundException {
        return materialsDaoJpa.findById(materialId)
                .orElseThrow(() -> new ResourceNotFoundException("Material not found, Please try with valid project Id"));
    }

    public Materials updateMaterial(Materials materials, Map<Object, Object> fields) throws ParseException {
        fields.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(Materials.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, materials, value);
        });
        materials.setUpdatedDate();
        return materialsDaoJpa.save(materials);
    }

    public String deleteMaterialById(Long materialsId) throws ResourceNotFoundException {
        materialsDaoJpa.findById(materialsId)
                .orElseThrow(() -> new ResourceNotFoundException("Material NOT FOUND"));
        materialsDaoJpa.deleteById(materialsId);
        return "Material deleted";
    }

    public Projects addMaterialsToProject(Materials materials, Long id) {

        Projects projects = projectsDaoJpa.findById(id).get();
        materials.setProjects(projects);
        materialsDaoJpa.save(materials);
        return projects;
    }

    public Projects addExistingMaterialToExistingProject(Long projectId, Long materialId) {
        Projects p = projectsDaoJpa.findById(projectId).get();
        Materials m = materialsDaoJpa.findById(materialId).get();
        m.setProjects(p);
        materialsDaoJpa.save(m);
        return p;
    }
}

*/
