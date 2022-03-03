/*
package com.example.demo.pojos_entity_data_me;

import lombok.*;
import lombok.experimental.FieldDefaults;
import se.hexastudio.craftson.pojos_entity_data.SharedClass;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AttributeOverride(name = "id", column = @Column(name = "customerId"))
public class Customer extends SharedClass {

    private String orgNumber;
    private String customerName;
    private String socialSecurityNumber;


    @OneToMany(mappedBy = "customer",cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Projects> projects = new ArrayList<>();

//
//    @OneToMany(mappedBy = "customer",cascade = CascadeType.MERGE, orphanRemoval = true)
//    private List<ContactPerson> contactPerson = new ArrayList<>();
//

}
*/
