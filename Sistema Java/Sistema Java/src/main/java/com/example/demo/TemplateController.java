package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import java.util.Arrays;
import java.util.List;

@Controller
public class TemplateController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "John Doe");
        List<Customer> customers =  customerService.getAllUsers();
        model.addAttribute("customers", customers);
        return "pages/home";
    }

    @PostMapping("/save-user")
    public String saveUser(Customer customer) {
        customerService.saveUser(customer);
        return "redirect:/";
    }

    @PostMapping("/delete-user")
    public String deleteCustomer(@RequestParam Long id) {
        customerService.deleteCustomer(id);
        return "redirect:/";
    }
}