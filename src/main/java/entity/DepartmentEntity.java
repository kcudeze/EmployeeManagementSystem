package entity;

import lombok.Data;

import javax.persistence.*;

public class DepartmentEntity {

    @Entity
    @Table(name = "student")
    @Data
    public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        @Column(name = "departmentName")
        private String departmentName;

        @Column(name = "departmentLocation")
        private String departmentLocation;

        @OneToMany
        @JoinColumn(name = "id")
        private Integer Employee;
    }

}