package com.yee.filemanager.controller;


import com.yee.filemanager.bean.Employee;
import com.yee.filemanager.serviceImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @ResponseBody
    @RequestMapping("/getEmployeeById")
    public Employee getEmployeeById(@PathVariable("id")int id){
        return  employeeService.getEmployeeById(id);
    }
}
