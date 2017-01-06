package com.f1;

/**
 * Created by User on 26.08.2015.
 */
public class Employee{
    private String name;
    private int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return " {NAME: "+this.name+", AGE: "+this.age+"} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        return !(name != null ? !name.equals(employee.name) : employee.name != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
