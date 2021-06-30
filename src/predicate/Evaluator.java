package predicate;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluator {
public	List<Estudiantes> evaluar(List<Estudiantes> students, Predicate<Estudiantes> predicate){
	
	
	List<Estudiantes> studentMoreWage= new LinkedList<Estudiantes>();
	for(Estudiantes st: students)
	{
		if(predicate.test(st))
			studentMoreWage.add(st);
		
	}
		
		return studentMoreWage;
		
	
}
}
