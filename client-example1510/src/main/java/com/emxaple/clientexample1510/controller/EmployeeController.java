package com.emxaple.clientexample1510.controller;

import com.emxaple.clientexample1510.service.Employee;
import com.emxaple.clientexample1510.service.HelloWorld;
import com.emxaple.clientexample1510.service.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    HelloWorld helloWorld;
    @GetMapping(value = "/list")
    public String listEmployee(Model model) throws RemoteException {
        model.addAttribute("list",helloWorld.getEmployees());
        return "list";
    }
    @GetMapping(value = "/add")
    public String showForm(Model model){
        model.addAttribute("employee",new Employee());
        return "form";
    }
    @PostMapping(value = "/add")
    public String addEmployee(Employee employee) throws RemoteException {
        helloWorld.addEmployees(employee);
        return "redirect:/employees/list";
    }
    @GetMapping(value = "/edit/{id}")
    public String showupdateForm(@PathVariable("id") long id,Model model) throws RemoteException {
        Employee employee = helloWorld.findById(id);
        model.addAttribute("employee",employee);
        return "edit";
    }
   @PostMapping(value = "/update")
    public String updateEmp(Employee employee) throws RemoteException {
        helloWorld.updateEmployee(employee);
       return "redirect:/employees/list";
   }
}
