package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;

                                                  //POJO,Id - type
public interface EmployeeRepo extends JpaRepository<Employee,Integer > {

}
