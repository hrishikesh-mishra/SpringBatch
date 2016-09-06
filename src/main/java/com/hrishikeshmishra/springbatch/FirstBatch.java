package com.hrishikeshmishra.springbatch;

import org.apache.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created by hrishikesh.mishra on 08/09/16.
 */
public class FirstBatch implements Tasklet {

    static Logger logger = Logger.getLogger("FirstBatch");

    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {

        logger.info("** First Batch Job is Executing! **");
        return RepeatStatus.FINISHED;

    }
}
