package edu.bekthedev.restmvcspring.controller;

import edu.bekthedev.restmvcspring.model.Customer;
import edu.bekthedev.restmvcspring.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;



@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
@RestController
public class CustomerController {

    private final CustomerService customerService;


    @PatchMapping({"{customerId}"})
    public ResponseEntity<Void> updateCustomerPatchById(@PathVariable("customerId") UUID customerId,
                                                        @RequestBody Customer customer){
        customerService.patchCustomerById(customerId, customer);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("{customerId}")
    public ResponseEntity<Void> deleteById(@PathVariable("customerId") UUID customerId) {
        customerService.deleteCustomerById(customerId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



    @PutMapping("{customerId}")
    public ResponseEntity<Void> updateCustomerById(@PathVariable("customerId") UUID customerId,
                                                   @RequestBody Customer customer){
        customerService.updateCustomerById(customerId, customer);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



    @PostMapping
    public ResponseEntity<Void> handlePost(@RequestBody Customer customer){
        Customer savedCustomer = customerService.saveNewCustomer(customer);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Location", "/api/v1/customer/" + savedCustomer.getId())
                .build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> listAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "{customerId}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable("customerId") UUID id){
        return customerService.getCustomerById(id);
    }
}