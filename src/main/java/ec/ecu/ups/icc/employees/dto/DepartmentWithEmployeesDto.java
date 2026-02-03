package ec.ecu.ups.icc.employees.dto;

import java.math.BigDecimal;
import java.util.List;

public class DepartmentWithEmployeesDto {
    
    private Long id;
    private String name;
    private BigDecimal budget;
    private CompanyDto company;
    private List<EmployeeDto> employees;
    private int employeeCount;
    private BigDecimal totalSalaries;
    
   
    public DepartmentWithEmployeesDto() {
    }
    
    public DepartmentWithEmployeesDto(Long id, String name, BigDecimal budget, CompanyDto company, 
                                       List<EmployeeDto> employees, int employeeCount, BigDecimal totalSalaries) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.company = company;
        this.employees = employees;
        this.employeeCount = employeeCount;
        this.totalSalaries = totalSalaries;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public BigDecimal getBudget() {
        return budget;
    }
    
    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }
    
    public CompanyDto getCompany() {
        return company;
    }
    
    public void setCompany(CompanyDto company) {
        this.company = company;
    }
    
    public List<EmployeeDto> getEmployees() {
        return employees;
    }
    
    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }
    
    public int getEmployeeCount() {
        return employeeCount;
    }
    
    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
    
    public BigDecimal getTotalSalaries() {
        return totalSalaries;
    }
    
    public void setTotalSalaries(BigDecimal totalSalaries) {
        this.totalSalaries = totalSalaries;
    }
}
