package maps.practice;

import java.util.Objects;

/**
 *
 * @author dvandenberge
 */
public class Employee implements Comparable{
    private int empID;
    private String name;
    private String ssn;

    public Employee(int empID, String name, String ssn) {
        this.empID = empID;
        this.name = name;
        this.ssn = ssn;
    }

    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;

        if (!ssn.equals(other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", name=" + name + ", ssn=" + ssn + '}';
    }
    
    @Override
    public int compareTo(Object o) {
        final int BEFORE=1;
        final int EQUAL=0;
        final int AFTER=-1;
        
        Employee e=null;
        if(o instanceof Employee) 
            e=(Employee)o;
        if(empID<e.getEmpID())return AFTER;
        else if(empID>e.getEmpID())return BEFORE;
        return EQUAL;
    }
    
    
}
