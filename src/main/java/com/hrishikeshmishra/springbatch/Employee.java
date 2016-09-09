package com.hrishikeshmishra.springbatch;

/**
 * Created by hrishikesh.mishra on 09/09/16.
 */
public class Employee {

    private int ID;
    private String lastName;
    private String firstName;
    private String position;
    private int birthYear;
    private int debutYear;

    public Employee() {
    }

    public Employee(int ID, String lastName, String firstName, String position, int birthYear, int debutYear) {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.birthYear = birthYear;
        this.debutYear = debutYear;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", position='" + position + '\'' +
                ", birthYear=" + birthYear +
                ", debutYear=" + debutYear +
                '}';
    }
}
