package ec.ecu.ups.icc.employees.dto;

public class EmployeeTransferResponseDto {
    
    private Long employeeId;
    private String employeeName;
    private DepartmentInfoDto oldDepartment;
    private DepartmentInfoDto newDepartment;
    private String message;
    
    
    public EmployeeTransferResponseDto() {
    }
    
    public EmployeeTransferResponseDto(Long employeeId, String employeeName, 
                                        DepartmentInfoDto oldDepartment, 
                                        DepartmentInfoDto newDepartment, 
                                        String message) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.oldDepartment = oldDepartment;
        this.newDepartment = newDepartment;
        this.message = message;
    }
  
    public Long getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public DepartmentInfoDto getOldDepartment() {
        return oldDepartment;
    }
    
    public void setOldDepartment(DepartmentInfoDto oldDepartment) {
        this.oldDepartment = oldDepartment;
    }
    
    public DepartmentInfoDto getNewDepartment() {
        return newDepartment;
    }
    
    public void setNewDepartment(DepartmentInfoDto newDepartment) {
        this.newDepartment = newDepartment;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
