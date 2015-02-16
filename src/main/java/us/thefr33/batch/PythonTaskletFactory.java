package us.thefr33.batch;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.springframework.batch.core.step.tasklet.Tasklet;
public class PythonTaskletFactory {

    public PythonTaskletFactory() {
        interpreter = new PythonInterpreter();
        interpreter.exec("from tasks import Tasklet");
        jyTaskClass = interpreter.get("Tasklet");
    }

    public Tasklet create() {
        PyObject taskObj = jyTaskClass.__call__();
        return (Tasklet)taskObj.__tojava__(Tasklet.class);
    }

    private PyObject jyTaskClass;
	private PythonInterpreter interpreter;
}
