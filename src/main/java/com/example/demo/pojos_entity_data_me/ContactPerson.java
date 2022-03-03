/*
package com.example.demo.pojos_entity_data_me;

import lombok.*;
import lombok.experimental.FieldDefaults;
import se.hexastudio.craftson.pojos_entity_data.SharedClass;

import javax.persistence.*;

@Entity
@Table(name = "contact_person")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AttributeOverride(name = "id", column = @Column(name = "contactpersonId"))
public class ContactPerson extends SharedClass {

    private String socialSecurity;
    private String name;
    private String email;
    private String phone;

//    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Customer.class)
//    @JoinColumn(name = "customer_id", referencedColumnName = "customerId")
//    private Customer customer;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "projects_id", referencedColumnName = "projectsId")
    private Projects projects;

}
*/
