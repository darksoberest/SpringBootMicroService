package com.jag.department.controller;


import com.jag.department.entity.Department;
import com.jag.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("inside save department method ");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long depLong) {
        log.info("inside get department by id method ");
        return departmentService.findDepartmentById(depLong);
    }
}
