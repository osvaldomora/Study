package function;

import java.util.function.*;
public class TestFunction {

	public static void main(String[] args) {

		
		Function<Integer, String> convertidor= x->Integer.toString(x);
		System.out.println(convertidor.apply(5).length());
		
		
		Function<Integer, Integer> abc= new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
	
		
	}

}
