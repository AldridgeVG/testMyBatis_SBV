package com.example.demo.mapper;

import com.example.demo.bean.Employee;

//MapperScan of mapper package annotation set, no need of Mapper annotation
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public Employee insertEmp(Employee employee);
}
