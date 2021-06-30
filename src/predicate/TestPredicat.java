package predicate;

import java.util.Arrays;
import java.util.List;

public class TestPredicat {

	public static void main(String[] args) {
	
		List<Estudiantes> studentsl=  Arrays.asList(
				new Estudiantes("kagel", 10),
				new Estudiantes("valdo", 20),
				new Estudiantes("valdo2", 40));
		
		System.out.println("Students withs wages >15");
		Evaluator evalua = new  Evaluator();
		
		List<Estudiantes> goodWage= evalua.evaluar(studentsl,(Estudiantes estudiante)->
//		{
			estudiante.getAverage()>10);
//			if(estudiante.getAverage()>10)
//			{System.out.println(estudiante.getName());
//				return true;
//			}
//			else return false;
//		});
		
		for(Estudiantes em:goodWage)
		{
			System.out.println(em.toString());
			
		}
		
		
		System.out.println("Employees with start with k");
		
		List<Estudiantes> startK= evalua.evaluar(studentsl,(Estudiantes estudiante)->{
			if(estudiante.getName().startsWith("k"))
			{
				return true;
			}
			else return false;
		});
		for(Estudiantes em:startK)
		{
			System.out.println(em.toString());
			
		}
		

	}
	

	

}
