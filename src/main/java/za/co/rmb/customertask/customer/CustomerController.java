package za.co.rmb.customertask.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/create")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return  ResponseEntity.ok(savedCustomer);
    }

    @GetMapping("/view-all")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }








}
