package com.payroll.PaymentProject;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    List<Employee> findByIdEmployeeId(List<Integer> id);

}
