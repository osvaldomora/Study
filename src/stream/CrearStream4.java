package stream;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CrearStream4 {
	public static void main(String[] args)
	   {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		IntStream streamChars = input.chars();
		streamChars.filter(n-> !Character.isDigit((char)n) && !Character.isWhitespace((char)n))
		.forEach(data->System.out.print((char)data));
		
		sc.close();
	   }
}
