
package:
	~/.local/apache-maven-3.2.5/bin/mvn package

deps:
	~/.local/apache-maven-3.2.5/bin/mvn dependency:copy-dependencies

test:
	CLASSPATH=target/batch-jython-1.0-SNAPSHOT.jar:src/main/resources/log4j.xml:src/main/resources/ /mnt/data/home/mdupont/experiments/java/jython/dist/bin/jython ./src/main/python/test_import.py
