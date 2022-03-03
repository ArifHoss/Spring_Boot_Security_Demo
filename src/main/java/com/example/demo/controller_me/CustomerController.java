/*
package com.example.demo.controller_me;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import se.hexastudio.craftson.exception.ResourceNotFoundException;
import se.hexastudio.craftson.pojos_entity_data_me.Customer;
import se.hexastudio.craftson.service_me.CustomerService;

import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("customer")
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomer();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Long customerId) throws ResourceNotFoundException {
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }


    @PatchMapping("/{id}")
    public Customer updateACustomerById(@PathVariable Long id,
                                        @RequestBody Map<String, Object> fields)
            throws ResourceNotFoundException, ParseException {

        Customer customer = customerService.getCustomerById(id);
        return customerService.updateCustomerById(customer, fields);
    }

    @DeleteMapping("/{id}")
    public String removeACustomerById(@PathVariable Long id, HttpServletResponse response) throws ResourceNotFoundException {
        return customerService.removeACustomerById(id, response);
    }



}
*/
