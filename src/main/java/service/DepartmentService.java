package service;

import entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public void createDepartment(DepartmentEntity department){
        departmentRepository.save(department);
    }

    public Iterable<DepartmentEntity> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public DepartmentEntity getDepartmentById(int id) {
        return departmentRepository.findById(id).get();
    }

}



