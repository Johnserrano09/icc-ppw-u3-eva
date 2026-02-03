package ec.ecu.ups.icc.employees.controller;

import ec.ecu.ups.icc.employees.dto.CompanyDepartmentsDto;
import ec.ecu.ups.icc.employees.dto.EmployeesResponseDto;
import ec.ecu.ups.icc.employees.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
    
    private final EmployeeService employeeService;
    
    public CompanyController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    
    @GetMapping("/{id}/departments")
    public ResponseEntity<CompanyDepartmentsDto> getCompanyDepartments(@PathVariable Long id) {
        CompanyDepartmentsDto response = employeeService.getCompanyDepartments(id);
        return ResponseEntity.ok(response);
    }
    
    
    @GetMapping("/{id}/high-salary-employees")
    public ResponseEntity<EmployeesResponseDto> getHighSalaryEmployees(
            @PathVariable Long id,
            @RequestParam(defaultValue = "5000.00") Double minSalary) {
        
        EmployeesResponseDto response = employeeService.getHighSalaryEmployees(id, minSalary);
        return ResponseEntity.ok(response);
    }
}
