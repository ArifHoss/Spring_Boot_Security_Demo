/*
package com.example.demo.pojos_entity_data_me;

import lombok.*;
import lombok.experimental.FieldDefaults;
import se.hexastudio.craftson.pojos_entity_data.SharedClass;

import javax.persistence.*;

@Entity
@Table(name = "materials")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AttributeOverride(name = "id", column = @Column(name = "materialsId"))
public class Materials extends SharedClass {
    private String sku;
    private String name;
    private int unitAmount;
    private String unit;
    private double price;
    private int count;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "projects_id", referencedColumnName = "projectsId")
    private Projects projects;


}
*/
