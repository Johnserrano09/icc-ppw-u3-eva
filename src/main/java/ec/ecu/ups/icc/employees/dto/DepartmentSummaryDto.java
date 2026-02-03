package ec.ecu.ups.icc.employees.dto;

import java.math.BigDecimal;

public class DepartmentSummaryDto {
    
    private Long id;
    private String name;
    private BigDecimal budget;
    private int employeeCount;
    
    
    public DepartmentSummaryDto() {
    }
    
    public DepartmentSummaryDto(Long id, String name, BigDecimal budget, int employeeCount) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.employeeCount = employeeCount;
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
    
    public int getEmployeeCount() {
        return employeeCount;
    }
    
    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
}
