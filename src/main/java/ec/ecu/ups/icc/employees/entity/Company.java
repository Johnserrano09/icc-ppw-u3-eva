package ec.ecu.ups.icc.employees.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companies")
public class Company {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    
    @Column(name = "country", nullable = false, length = 50)
    private String country;
    
    @Column(name = "active", nullable = false, length = 1)
    private String active = "S";
    
    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private List<Department> departments = new ArrayList<>();
    
    // Constructors
    public Company() {
    }
    
    public Company(String name, String country) {
        this.name = name;
        this.country = country;
        this.active = "S";
    }
    
    // Getters and Setters
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
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getActive() {
        return active;
    }
    
    public void setActive(String active) {
        this.active = active;
    }
    
    public List<Department> getDepartments() {
        return departments;
    }
    
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
    
    public boolean isActive() {
        return "S".equals(this.active);
    }
}
