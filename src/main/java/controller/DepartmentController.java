package controller;


import entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.DepartmentRepository;
import service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/department", method = RequestMethod.POST)
    ResponseEntity<DepartmentEntity> createDepartment(@RequestBody DepartmentEntity department) {
        return ResponseEntity.ok(department);
    }

    @RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
    ResponseEntity<DepartmentEntity> getDepartment(@PathVariable int id) {
        DepartmentEntity department = departmentService.getDepartmentById(id);
        return ResponseEntity.ok(department);
    }

    @RequestMapping(value = "/department", method = RequestMethod.GET)
    ResponseEntity<Iterable<DepartmentEntity>> getAll() {
        Iterable<DepartmentEntity> department = departmentService.getAllDepartment();
        return ResponseEntity.ok(department);
    }





}
