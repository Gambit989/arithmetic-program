import java.util.Scanner;

public class console_DRV {

	public static void main(String[] args) {
		
		
		System.out.print("\n\tEvan's Arithmetic Program\n\t-------------------------\n");
		
		System.out.println("Instructions are as follows: \n"
				+"Use 1 command, followed by 2 numbers (seperated by commas, ex: \n"
				+"SUBTRACT 10 5 \nADD 55 120\nCommands are: \nADD SUBTRACT MULTIPLY DIVIDE SQUARE CUBE\n"
				+"Other commands: to create a variable, ex: \n"
				+"Variable a 15 (creates a variable named a and sets value to integer 15)\nVariable g 77\n"
				+"PRINT VARIABLE a (prints that variable to console)\n"
				+"PRINT ALL VARIABLES (prints all variables)\n"
				+"Also you can do all arithmetic funtions on variables, for ex:\n"
				+"a * b (needs spaces in between) or a / g or b + d, etc\n"
				+"Use integers for your numbers, also the program is not case sensitive\n"
				+"Type 'end' at any time to end the program and dump all the code to console\n");
				
				
				
		
		
				
		
		
		Scanner input = new Scanner(System.in);
		String code;
		do
		{
		System.out.print(" $~ ");
		code = input.nextLine();
		}
		while (CodeHolder.getLine(code.split("\\s")));
		System.out.println(CodeHolder.codeDump());
		
		
		
		

	}

}
