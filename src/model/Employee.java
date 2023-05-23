/*
 * File: Employee.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.05.23
 * Github: 
 * Licence: GNU GPL
 */


package model;

import java.time.LocalDate;

public class Employee {

    String name;
    String city;
    String address;
    LocalDate birthday;
    Double salary;
    
    public Employee(String name, String city, String address, LocalDate birthday, Double salary) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.birthday = birthday;
        this.salary = salary;
    }
    
    public Employee() {
    }
   
    public String getName() {
        return name;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getAddress() {
        return address;
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }
    
    public Double getSalary() {
        return salary;
    }
}
