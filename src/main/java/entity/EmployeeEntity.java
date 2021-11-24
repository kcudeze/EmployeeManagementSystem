package entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
public class EmployeeEntity<Employee> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "JobDescription")
    private String JobDescription;

    @Column(name = "HireDate")
    private LocalDate HireDate;

    @Column(name = "salary")
    private String salary;

    @Column(name = "Departmentid")
    private int Departmentid;


    @ManyToOne
    @JoinColumn(name="departments", nullable=false)
    private Employee employee;
    private String employees;
}
