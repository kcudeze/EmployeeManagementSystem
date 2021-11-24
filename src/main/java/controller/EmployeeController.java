package controller;

import entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.EmployeeRepository;
import service.EmployeeService;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity employee) {
        return ResponseEntity.ok(employee);
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    ResponseEntity<EmployeeEntity> getEmployee(@PathVariable int id) {
        EmployeeEntity employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    ResponseEntity<Iterable<EmployeeEntity>> getAll() {
        Iterable<EmployeeEntity> employee = employeeService.getAllEmployees();
        return ResponseEntity.ok(employee);
    }

}
