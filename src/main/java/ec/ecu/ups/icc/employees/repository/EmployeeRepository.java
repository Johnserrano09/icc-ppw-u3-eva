package ec.ecu.ups.icc.employees.repository;

import ec.ecu.ups.icc.employees.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    Optional<Employee> findByIdAndActive(Long id, String active);
    
    @Query("SELECT e FROM Employee e WHERE e.department.id = :departmentId AND e.active = 'S' ORDER BY e.salary ASC")
    List<Employee> findActiveByDepartmentIdOrderBySalaryAsc(@Param("departmentId") Long departmentId);
    
    @Query("SELECT e FROM Employee e WHERE e.department.id = :departmentId AND e.active = 'S' ORDER BY e.salary DESC")
    List<Employee> findActiveByDepartmentIdOrderBySalaryDesc(@Param("departmentId") Long departmentId);
    
    @Query("SELECT COUNT(e) FROM Employee e WHERE e.department.id = :departmentId AND e.active = 'S'")
    long countActiveByDepartmentId(@Param("departmentId") Long departmentId);
    
    @Query("SELECT e FROM Employee e JOIN e.department d WHERE d.company.id = :companyId AND e.active = 'S' AND d.active = 'S' AND e.salary >= :minSalary ORDER BY e.salary DESC")
    List<Employee> findActiveByCompanyIdAndMinSalary(@Param("companyId") Long companyId, @Param("minSalary") BigDecimal minSalary);
}
