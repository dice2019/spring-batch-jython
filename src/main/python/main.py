import sys
import glob

#for j in glob.glob('build/libs/WEB-INF/lib/*.jar'):
#    print 'j', j
#    sys.path.append(j)

#print ":".join(sys.path)

import org.springframework.batch.core.BatchStatus
import org.springframework.batch.core.Job
import org.springframework.batch.core.JobExecution
import org.springframework.batch.core.JobParametersBuilder
import org.springframework.batch.core.StepExecution
import org.springframework.batch.core.launch.JobLauncher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.integration.annotation.Transformer
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.messaging.Message
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.io.Resource
import org.slf4j.impl.StaticLoggerBinder
import org.springframework.batch.core.job.SimpleJob
import org.springframework.batch.core.launch.support.CommandLineJobRunner

import org.springframework.batch.core.StepContribution
import org.springframework.batch.core.scope.context.ChunkContext
import org.springframework.batch.core.step.tasklet.Tasklet
import org.springframework.batch.repeat.RepeatStatus
import org.springframework.batch.core.launch.support.SimpleJobLauncher
import org.springframework.batch.core.repository.dao.MapJobInstanceDao
import org.springframework.batch.core.repository.dao.MapJobExecutionDao
import org.springframework.batch.core.repository.dao.MapStepExecutionDao
import org.springframework.batch.core.repository.dao.MapExecutionContextDao
import org.springframework.batch.support.transaction.ResourcelessTransactionManager
import org.springframework.batch.core.step.tasklet.TaskletStep
from org.springframework.batch.core.launch.support import CommandLineJobRunner

class PrintTasklet(org.springframework.batch.core.step.tasklet.Tasklet):
    pass

import pdb

print "main"

CommandLineJobRunner.main(["simple.xml",'simpleJob'])

pdb.set_trace()
