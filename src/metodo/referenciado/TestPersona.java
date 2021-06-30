package metodo.referenciado;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class TestPersona {

	public static void main(String[] args) {


//		Consumer<String> cons = x -> System.out.println(x.toUpperCase());
//		cons.accept("hola mundo");
		
		
		List<Persona> studentsl=  Arrays.asList(new Persona("kagel", 10),
												new Persona("valdo", 20),
												new Persona("mora", 5)
												
				);
		
		System.out.println("personas sin ordenar");
		studentsl.forEach(person->System.out.println(person));
		
		
		System.out.println("person  sort");
		Collections.sort(studentsl, (per1,per2)-> Persona.comparePorEdad(per1, per2));//per1.getEdad().compareTo(per2.getEdad())
		studentsl.forEach(person->System.out.println(person));
		System.out.println("Using referenced method by method static");
		Collections.sort(studentsl, Persona::comparePorEdad);//Type_data::method
		studentsl.forEach(person->System.out.println(person));
		
		System.out.println("Using referenced method by instance");
		Persona per = new Persona();
		Collections.sort(studentsl, per::comparePorNombre);//Type_data::method
		studentsl.forEach(person->System.out.println(person));
		
		System.out.println("Using referenced method by instance arbitraty type i don´t understand");
//		Persona person2 = new Persona();
		Collections.sort(studentsl,Persona::comparePorEdad2);// (per1,per2)->per1.comparePorEdad2(per2)
		studentsl.forEach(person->System.out.println(person));
		
	}

}
