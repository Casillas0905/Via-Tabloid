package com.example.viatabloid2.Controller;

import com.example.viatabloid2.Model.Department;
import com.example.viatabloid2.Service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/departments")
public class DptController {
    @Autowired
    private DepService depService;

    @GetMapping("/{id}")
    public Department findById(@PathVariable int id) {
        return depService.findById(id);
    }

    @PostMapping
    public void saveDep(@RequestBody Department department) {
        depService.saveDep(department);
    }
}

