package ec.ecu.ups.icc.employees.dto;

import java.math.BigDecimal;

public class EmployeeWithDepartmentDto {
    
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private BigDecimal salary;
    private DepartmentInfoDto department;
    
    // Con
    public EmployeeWithDepartmentDto() {
    }
    
    public EmployeeWithDepartmentDto(Long id, String firstName, String lastName, String email, 
                                      BigDecimal salary, DepartmentInfoDto department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }
    
    // Gett
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public BigDecimal getSalary() {
        return salary;
    }
    
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    
    public DepartmentInfoDto getDepartment() {
        return department;
    }
    
    public void setDepartment(DepartmentInfoDto department) {
        this.department = department;
    }
}
