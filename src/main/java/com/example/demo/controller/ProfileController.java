package com.example.demo.controller;

import com.example.demo.Employee;
import com.example.demo.EmployeeDaoImpl;
import com.example.demo.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProfileController {

    @Autowired
    private EmployeeDaoImpl employeeDao;

    @GetMapping(value = "users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUser() {
        employeeDao.saveEmployee(new Employee(1, "teste", 2.0));

        return List.of(new User("John", "Doe", "john.doe@baeldung.com"),
            new User("Bruno", "Araujo", "teste@baeldung.com"));
    }
}