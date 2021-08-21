package com.jag.department.service;

import com.jag.department.entity.Department;
import com.jag.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside the service for saving the department");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long depLong) {
        log.info("inside get department by id method iun service");
        return departmentRepository.findByDepartmentId(depLong);
    }
}
