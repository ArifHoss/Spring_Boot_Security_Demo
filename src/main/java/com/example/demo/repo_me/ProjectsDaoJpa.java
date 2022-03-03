/*
package com.example.demo.repo_me;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.hexastudio.craftson.pojos_entity_data_me.Projects;

import java.util.Optional;

@Repository("projectsDaoJpa")
public interface ProjectsDaoJpa extends CrudRepository<Projects, Long> {

    @Query("SELECT id, title, location, customer.customerName, customer.orgNumber, materials.size FROM Projects WHERE title = ?1 ")
    Optional<Object[]> findOrderByTitle(String title);

//    @Query("SELECT p.id, p.title, p.location, p.customer.customerName, p.customer.orgNumber, m.name, m.sku, m.count, m.unitAmount, m.price FROM Projects p, Materials m WHERE m.projects = p AND p.title = ?1 ")
//    Optional<Object[]> findOrderByTitle(String title);

}
*/
