package com.yee.filemanager.serviceImpl;

import com.yee.filemanager.bean.Employee;
import com.yee.filemanager.mapper.EmployeeMapper;
import com.yee.filemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public Employee getEmployeeById(int id) {
        return employeeMapper.getEmployeeById(id);
    }
}
