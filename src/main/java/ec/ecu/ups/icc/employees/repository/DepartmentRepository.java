package ec.ecu.ups.icc.employees.repository;

import ec.ecu.ups.icc.employees.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
    Optional<Department> findByIdAndActive(Long id, String active);
    
    @Query("SELECT d FROM Department d WHERE d.company.id = :companyId AND d.active = 'S'")
    List<Department> findActiveByCompanyId(@Param("companyId") Long companyId);
}
