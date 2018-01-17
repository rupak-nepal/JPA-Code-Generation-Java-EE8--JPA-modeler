/**
 * This file was generated by the Jeddict
 */
package test;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * @author rupak
 */
@Entity
public class Employee extends Person {

    @ManyToOne(targetEntity = Department.class)
    private Department department;

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}