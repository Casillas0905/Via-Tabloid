package com.example.viatabloid2.Service;

import com.example.viatabloid2.Model.Department;

public interface DepService {
    Department findById(int id);
    void saveDep(Department department);
}
