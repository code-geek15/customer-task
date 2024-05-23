package za.co.rmb.customertask.customer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.Thymeleaf;


import java.util.List;

@RestController
@RequestMapping("/customers")
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


//  Methods for  Thymeleaf
    @GetMapping("/create-customer")
    public String showCreateCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "create-customer";
    }

    @PostMapping("/create-customer")
    public String createCustomer(@ModelAttribute Customer customer, Model model) {
        customerRepository.save(customer);
        model.addAttribute("customers", customerRepository.findAll());
        return "redirect:/customers";
    }

    @GetMapping("/customers")
    public String listCustomers(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "customers";
    }
//    End of Methods for  Thymeleaf









}
