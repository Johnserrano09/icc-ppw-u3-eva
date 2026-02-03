package ec.ecu.ups.icc.employees.dto;

import java.util.List;

public class EmployeesResponseDto {
    
    private String companyName;
    private Double minSalary;
    private int count;
    private List<EmployeeWithDepartmentDto> employees;
    
    
    public EmployeesResponseDto() {
    }
    
    public EmployeesResponseDto(String companyName, Double minSalary, int count, 
                                 List<EmployeeWithDepartmentDto> employees) {
        this.companyName = companyName;
        this.minSalary = minSalary;
        this.count = count;
        this.employees = employees;
    }
    
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public Double getMinSalary() {
        return minSalary;
    }
    
    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    
    public List<EmployeeWithDepartmentDto> getEmployees() {
        return employees;
    }
    
    public void setEmployees(List<EmployeeWithDepartmentDto> employees) {
        this.employees = employees;
    }
}
