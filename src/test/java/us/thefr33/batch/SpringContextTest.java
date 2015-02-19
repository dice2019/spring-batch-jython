/**
 * 
 */
package us.thefr33.batch;

import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

/**
 * @author mdupont
 *
 */
public class SpringContextTest {
	class TxM implements PlatformTransactionManager {

		@Override
		public void commit(TransactionStatus arg0) throws TransactionException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public TransactionStatus getTransaction(TransactionDefinition arg0)
				throws TransactionException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void rollback(TransactionStatus arg0)
				throws TransactionException {
			// TODO Auto-generated method stub
			
		}
		
			
	};
	
	class JRep implements JobRepository {

		@Override
		public boolean isJobInstanceExists(String jobName,
				JobParameters jobParameters) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public JobInstance createJobInstance(String jobName,
				JobParameters jobParameters) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public JobExecution createJobExecution(JobInstance jobInstance,
				JobParameters jobParameters, String jobConfigurationLocation) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public JobExecution createJobExecution(String jobName,
				JobParameters jobParameters)
				throws JobExecutionAlreadyRunningException,
				JobRestartException, JobInstanceAlreadyCompleteException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void update(JobExecution jobExecution) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void add(StepExecution stepExecution) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void addAll(Collection<StepExecution> stepExecutions) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update(StepExecution stepExecution) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateExecutionContext(StepExecution stepExecution) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateExecutionContext(JobExecution jobExecution) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public StepExecution getLastStepExecution(JobInstance jobInstance,
				String stepName) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getStepExecutionCount(JobInstance jobInstance,
				String stepName) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public JobExecution getLastJobExecution(String jobName,
				JobParameters jobParameters) {
			// TODO Auto-generated method stub
			return null;
		}};
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	
	
	/**
	 * Test method for {@link us.thefr33.batch.SpringContext#SpringContext(org.springframework.batch.core.repository.JobRepository, org.springframework.transaction.PlatformTransactionManager)}.
	 */
	@Test
	public void testSpringContext() {
		PlatformTransactionManager b = new TxM();
		JobRepository a = new JRep();
		MySpringContext c =  new MySpringContext(a, b);	
		JobExecution execution = new JobExecution((long) 1);
		c.getBean_simpleJob().execute(execution);
	}

}
