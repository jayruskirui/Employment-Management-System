package com.project1.ems_backend.mapper;

import com.project1.ems_backend.dto.EmployeeDto;
import com.project1.ems_backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirst_name(),
                employeeDto.getLast_name(),
                employeeDto.getEmail_id()
        );
    }

}
