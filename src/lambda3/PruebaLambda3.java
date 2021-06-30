package lambda3;

public class PruebaLambda3 {

	public static void main(String[] args) {
		
		PruebaLambda3 pl3 = new PruebaLambda3();
		Calculadora suma= (a,b)-> a+b;
//		{
//			System.out.println("la suma es:"); 
//			return a+b; 
//		};
		Calculadora mult= (a,b)-> {
			System.out.println("la mult es:");
			return a*b;
		};
		System.out.println(pl3.opera(suma, 1, 9));
		System.out.println(pl3.opera(mult, 1, 2));
		
		

	}
	
	
	public  int opera(Calculadora c,int a,int b)
	{
		return c.operacion(a, b);
	}

}
