package us.thefr33.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class PythonTasklet implements Tasklet {

    private static PythonTaskletFactory factory = null;

    public static PythonTaskletFactory getInstance() {
        if (factory == null) {
            factory = new PythonTaskletFactory();
        }
        return factory;
    }

	private Tasklet task;

    public PythonTasklet( ) {
        this.task = getInstance().create();
    }

    @Override
    public RepeatStatus execute( StepContribution aArg0, ChunkContext aArg1 ) throws Exception {
        return this.task.execute( aArg0,  aArg1 );
    }

}
