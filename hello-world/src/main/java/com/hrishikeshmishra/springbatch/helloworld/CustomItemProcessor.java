package com.hrishikeshmishra.springbatch.helloworld;

/**
 * Created by hrishikesh.mishra on 09/09/16.
 */

import com.hrishikeshmishra.springbatch.helloworld.models.Report;
import org.springframework.batch.item.ItemProcessor;


public class CustomItemProcessor implements ItemProcessor<Report, Report> {

    @Override
    public Report process(Report item) throws Exception {

        System.out.println("Processing..." + item);
        return item;
    }

}