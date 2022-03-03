/*
package com.example.demo.service_me;

import com.example.demo.pojos_entity_data_me.Customer;
import com.example.demo.repo_me.CustomerDaoJpa;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import se.hexastudio.craftson.exception.ResourceNotFoundException;
import se.hexastudio.craftson.pojos_entity_data_me.Customer;
import se.hexastudio.craftson.repo_me.CustomerDaoJpa;

import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@Service
public class CustomerService {

    private CustomerDaoJpa customerDaoJpa;


    public List<Customer> getAllCustomer() {
        return (List<Customer>) customerDaoJpa.findAll();
    }

    public Customer createCustomer(Customer customer) {
        return customerDaoJpa.save(customer);
    }

    public Customer getCustomerById(Long customerId) throws ResourceNotFoundException {
        return customerDaoJpa.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Customer ID '"+customerId+"' does not exit. Try with valid ID"));
    }

*/
/*    public Customer updateCustomer(Customer customer, Map<String, Object> fields) throws ParseException {
        fields.forEach((key, value)->{
            Field field = ReflectionUtils.findField(Projects.class,(String) key);

            field.setAccessible(true);
            ReflectionUtils.setField(field, customer, value);
        });

        customer.setUpdatedDate();
        return customerDaoJpa.save(customer);
    }*//*

 public Customer updateCustomerById(Customer customer, Map<String, Object> fields)
         throws ParseException {

        fields.forEach((key, value)->{
            if (key.equals("orgNumber"))
                customer.setOrgNumber((String) value);
            if (key.equals("customerName"))
                customer.setCustomerName((String) value);
            if (key.equals( "socialSecurityNumber"))
                customer.setSocialSecurityNumber((String) value);

        });

        customer.setUpdatedDate();
        return customerDaoJpa.save(customer);
    }

    public String removeACustomerById(Long id, HttpServletResponse response) throws ResourceNotFoundException {
        customerDaoJpa.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Customer not found"));

        customerDaoJpa.deleteById(id);
        String deleteCustomer = "Customer with id "+id+" has been removed successfully";
        return deleteCustomer;
    }
}
*/
