/**
 * This file was generated by the Jeddict
 */
package test;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author rupak
 */
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String name;

    @OneToMany(targetEntity = Employee.class, mappedBy = "department")
    private List<Employee> employees;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}