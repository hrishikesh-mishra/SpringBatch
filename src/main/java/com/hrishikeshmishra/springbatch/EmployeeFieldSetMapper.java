package com.hrishikeshmishra.springbatch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;


/**
 * Created by hrishikesh.mishra on 09/09/16.
 */
class EmployeeFieldSetMapper implements FieldSetMapper<Employee> {

    public Employee mapFieldSet(FieldSet fieldSet) {
        if (fieldSet == null) return null;

        Employee emp = new Employee();
        emp.setID(fieldSet.readInt("ID"));
        emp.setLastName(fieldSet.readString("lastName"));
        emp.setFirstName(fieldSet.readString("firstName"));
        emp.setPosition(fieldSet.readString("position"));
        emp.setBirthYear(fieldSet.readInt("birthYear"));
        emp.setDebutYear(fieldSet.readInt("debutYear"));
        return emp;
    } }