/*
package com.example.demo.controller_me;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import se.hexastudio.craftson.exception.ResourceNotFoundException;
import se.hexastudio.craftson.pojos_entity_data_me.Materials;
import se.hexastudio.craftson.pojos_entity_data_me.Projects;
import se.hexastudio.craftson.service_me.MaterialsService;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("materials")
public class MaterialsController {

    private MaterialsService materialsService;

    @GetMapping("")
    public List<Materials> getAllMaterials() {
        return materialsService.getAllMaterials();
    }

    @GetMapping("/{id}")
    public  Materials getMaterialsByID(@PathVariable Long id) throws ResourceNotFoundException{
        return materialsService.getMaterialById(id);
    }


    @PostMapping("")
    public Materials createMaterial(@RequestBody Materials materials) {
        return materialsService.createMaterial(materials);
    }

    @PostMapping("/project/{id}")
    public Projects addNewMaterialsToExistingProject(@RequestBody Materials materials, @PathVariable Long id){
        return  materialsService.addMaterialsToProject(materials, id);
    }


    @PatchMapping("/{id}")
    public Materials updateMaterial(@PathVariable Long id, @RequestBody Map<Object, Object> fields)
            throws ResourceNotFoundException, ParseException {
        Materials material = materialsService.getMaterialById(id);
        return materialsService.updateMaterial(material, fields);
    }


    @DeleteMapping("/{id}")
    public String deleteMaterialById(@PathVariable("id") Long id) throws ResourceNotFoundException {
        return materialsService.deleteMaterialById(id);
    }

    @PutMapping("/project/{projectId}/material/{materialId}")
    public Projects addExistingMaterialToExistingProject(@PathVariable("projectId") Long projectId , @PathVariable("materialId") Long materialId){

        return materialsService.addExistingMaterialToExistingProject(projectId, materialId);
    }

}
*/
