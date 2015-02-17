import glob
import sys
for j in glob.glob('target/dependency/*.jar'):
    print 'j', j
    sys.path.append(j)

print ":".join(sys.path)

from tasks import PrintTasklet

t = PrintTasklet()
t.execute(1,2)

from org.springframework.batch.core.launch.support import CommandLineJobRunner
print 'before main'

CommandLineJobRunner.main(["simple.xml",'simpleJob'])

print 'after main'
