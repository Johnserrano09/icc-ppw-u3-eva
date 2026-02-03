package ec.ecu.ups.icc.employees.controller;

import ec.ecu.ups.icc.employees.dto.EmployeeTransferRequestDto;
import ec.ecu.ups.icc.employees.dto.EmployeeTransferResponseDto;
import ec.ecu.ups.icc.employees.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    
    private final EmployeeService employeeService;
    
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    /**
     * ENDPOINT 4: Transfer employee to another department
     * PATCH /api/employees/{employeeId}/transfer
     */
    @PatchMapping("/{employeeId}/transfer")
    public ResponseEntity<EmployeeTransferResponseDto> transferEmployee(
            @PathVariable Long employeeId,
            @RequestBody EmployeeTransferRequestDto request) {
        
        EmployeeTransferResponseDto response = employeeService.transferEmployee(
                employeeId, 
                request.getNewDepartmentId()
        );
        return ResponseEntity.ok(response);
    }
}
