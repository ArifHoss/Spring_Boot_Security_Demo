/*
package com.example.demo.pojos_entity_data_me;

import lombok.*;
import lombok.experimental.FieldDefaults;
import se.hexastudio.craftson.pojos_entity_data.SharedClass;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AttributeOverride(name = "id", column = @Column(name = "projectsId"))
public class Projects extends SharedClass {

    private String title;
    private String location;
    private int status;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToMany(mappedBy = "projects",cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Materials> materials = new ArrayList<>();


    @OneToMany(mappedBy = "projects",cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<ContactPerson> contactPerson = new ArrayList<>();

}
*/
