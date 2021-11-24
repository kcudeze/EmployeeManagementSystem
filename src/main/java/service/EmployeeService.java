package service;


import entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void createEmployee(EmployeeEntity employeeEntity){
        employeeRepository.save(employeeEntity);
    }

    public Iterable<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(int id) {
        return (EmployeeEntity) employeeRepository.findById(id).get();
    }
}
