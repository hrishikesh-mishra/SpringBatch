package com.hrishikeshmishra.springbatch;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;

import org.springframework.core.io.FileSystemResource;

/**
 * Created by hrishikesh.mishra on 09/09/16.
 */
public class ReaderTest {

    public static void main(String[] args) throws Exception {

        FlatFileItemReader<Employee> itemReader = new  FlatFileItemReader<Employee>();
        itemReader.setResource(new FileSystemResource("batch/employee.csv"));

        // DelimitedLineTokenizer defaults to comma as its delimiter
        DefaultLineMapper<Employee> lineMapper = new DefaultLineMapper<Employee>();

        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setNames(new String[] { "ID", "lastName", "firstName", "position", "birthYear", "debutYear" });

        lineMapper.setLineTokenizer(lineTokenizer);
        lineMapper.setFieldSetMapper(new EmployeeFieldSetMapper());

        itemReader.setLineMapper(lineMapper);
        itemReader.open(new ExecutionContext());
        Employee employee = itemReader.read();

        if (employee == null) {

        }
        System.out.println(employee.toString());
    }


}
