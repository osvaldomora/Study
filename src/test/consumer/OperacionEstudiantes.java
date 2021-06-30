package test.consumer;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantes {

	public void aceptaTodos(List<Estudiantes> estudiantes, Consumer<Estudiantes> cons) {

		for (Estudiantes est : estudiantes)

		{
			cons.accept(est);
		}
	}

}
