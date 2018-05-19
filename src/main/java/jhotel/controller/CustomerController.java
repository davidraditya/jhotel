package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value = "name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value = "name") String name,
                            @RequestParam(value = "email") String email,
                            //@RequestParam(value = "tahun", required = false, defaultValue = "2000") int tahun,
                            @RequestParam(value = "password") String password)
    {
        Customer customer = new Customer(name, 10, 10, 2000, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch(PelangganSudahAdaException ex) {
            ex.getMessage();
            return null;
        }

        return customer;
    }

    @RequestMapping(value = "/logincust", method = RequestMethod.POST)
    public Customer loginCust(@RequestParam String email, @RequestParam String password)
    {
        return DatabaseCustomer.getCustomerLogin(email,password);
    }

    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        return DatabaseCustomer.getCustomer(id);
    }
}