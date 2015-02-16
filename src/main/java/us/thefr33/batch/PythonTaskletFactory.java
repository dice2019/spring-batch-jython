package us.thefr33.batch;
import org.python.core.PyObject;
import org.python.core.Options;
import org.python.util.PythonInterpreter;
import org.springframework.batch.core.step.tasklet.Tasklet;
public class PythonTaskletFactory {

    public PythonTaskletFactory() {
    	Options.importSite=false;
        interpreter = new PythonInterpreter();
        interpreter.exec("from tasks import PrintTasklet");
        jyTaskClass = interpreter.get("PrintTasklet");
    }

    public Tasklet create() {
        PyObject taskObj = jyTaskClass.__call__();
        return (Tasklet)taskObj.__tojava__(Tasklet.class);
    }

    private PyObject jyTaskClass;
	private PythonInterpreter interpreter;
	
}
