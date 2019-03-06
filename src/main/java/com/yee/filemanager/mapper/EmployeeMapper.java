package com.yee.filemanager.mapper;

import com.yee.filemanager.bean.Employee;
import org.springframework.stereotype.Repository;


public interface EmployeeMapper {
    public Employee getEmployeeById(int id);

    public void addEmployee(Employee employee);

    public void updateEmp(Employee employee);

    public void deleteEmpById(int id);
}
