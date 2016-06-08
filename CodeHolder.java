import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CodeHolder throws ArrayIndexOutOfBoundsException

{


	static private String [][] linesOfCode = new String[10][3];
	static int index = 0;
	static HashMap<String, Integer>hmap=new HashMap<String,Integer>();

	public static boolean getLine(String[] strLine)
	{
		
		
		String [][] var = new String[10][2];
		
		if(strLine[0].equalsIgnoreCase("end"))
		return false;

		linesOfCode[index][0]= strLine[0];
		linesOfCode[index][1]= strLine[1];
		
		
		/*
		if (linesOfCode[index][2]==null){
			strLine[2]=" ";
		}
		else
		
		
		*/
		
		linesOfCode[index][2]= strLine[2];
		index++;
		

		if (strLine[0].equalsIgnoreCase("MULTIPLY")){
			int a=Integer.parseInt(strLine[1]) ;
			
			 int b=Integer.parseInt(strLine[2]);
			 System.out.print("    ");
			 System.out.println(a*b);
		}
		
		else if(strLine[0].equalsIgnoreCase("DIVIDE")){
			int a=Integer.parseInt(strLine[1]) ;
			
			 int b=Integer.parseInt(strLine[2]);
			 System.out.print("    ");
			 System.out.println(a / b);
		} 
		
		else if(strLine[0].equalsIgnoreCase("ADD")){
			int a=Integer.parseInt(strLine[1]) ;
			
			 int b=Integer.parseInt(strLine[2]);
			 System.out.print("    ");
			 System.out.println(a+b);
		}
		
		else if(strLine[0].equalsIgnoreCase("SUBTRACT")){
			int a=Integer.parseInt(strLine[1]) ;
			
			 int b=Integer.parseInt(strLine[2]);
			 System.out.print("    ");
			 System.out.println(a-b);
		} 
			 
		else if(strLine[0].equalsIgnoreCase("SQUARE") && strLine[1].equalsIgnoreCase("NUM") ) {
			//int a=Integer.parseInt(strLine[1]) ;
		
			int b=Integer.parseInt(strLine[2]);
			System.out.print("    ");
			System.out.println(b*b);
		} 
		
		else if(strLine[0].equalsIgnoreCase("CUBE") && strLine[1].equalsIgnoreCase("NUM") ) {
			//int a=Integer.parseInt(strLine[1]) ;
		
			int b=Integer.parseInt(strLine[2]);
			System.out.print("    ");
			System.out.println(b*b*b);
		}
		
		else if(strLine[0].equalsIgnoreCase("VARIABLE") && strLine[1] != null && strLine[2] != null) {
			int counter=0;
			
			boolean correct;
			 correct= (strLine[0].matches("[a-zA-Z]*"));
			
			
			String a=strLine[1];
			int hash_int= Integer.parseInt(strLine[2]);
			hmap.put(a,hash_int);
		}
		
		else if(strLine[0].equalsIgnoreCase("PRINT") && strLine[1].equalsIgnoreCase("VARIABLE") && 
			strLine[2].matches("[a-zA-Z]*")) {
			int counter=0;
			
			System.out.println("\tVar " +strLine[2] + "=" +hmap.get(strLine[2]));
		}
		
		
		
		else if (strLine[0].matches("[a-zA-Z]*") && strLine[1].equals("+") && strLine[2].matches("[a-zA-Z]*")){
			
			System.out.print("\t"+ hmap.get(strLine[0])+"+" +hmap.get(strLine[2])+ "=");
			
			System.out.print(hmap.get(strLine[0])+hmap.get(strLine[2])+"\n");
		}
				
		
		else if (strLine[0].matches("[a-zA-Z]*") && strLine[1].equals("-") && strLine[2].matches("[a-zA-Z]*")){

			System.out.print("\t"+ hmap.get(strLine[0])+"-" +hmap.get(strLine[2])+ "=");
			
			System.out.print(hmap.get(strLine[0])-hmap.get(strLine[2])+"\n");
			
		}
		
		else if (strLine[0].matches("[a-zA-Z]*") && strLine[1].equals("*") && strLine[2].matches("[a-zA-Z]*")){
			
			System.out.print("\t"+ hmap.get(strLine[0])+"*" +hmap.get(strLine[2])+ "=");
			System.out.print(hmap.get(strLine[0])*hmap.get(strLine[2])+"\n");
			
		}
		
		else if (strLine[0].matches("[a-zA-Z]*") && strLine[1].equals("/") && strLine[2].matches("[a-zA-Z]*")){
			System.out.print("\t"+ hmap.get(strLine[0])+"/" +hmap.get(strLine[2])+ "=");
			
			System.out.print(hmap.get(strLine[0]) / hmap.get(strLine[2])+"\n");
			
		}
		
		
		
		
		else if(strLine[0].equalsIgnoreCase("PRINT") && strLine[1].equalsIgnoreCase("ALL") ){
			
			System.out.println("\t All variables\n\t--------------");
			Set set = hmap.entrySet();
			Iterator iterator = set.iterator();
	      		while(iterator.hasNext()) {
	      			Map.Entry mentry = (Map.Entry)iterator.next();
	      			System.out.print("\tVAR "+ mentry.getKey() + " = ");
	      			System.out.println(mentry.getValue());
		
	      }
		}
		
		
		return true;
		
	}

	public static String codeDump()
	{
		String dump="\n---CODE DUMP---\n";
		for(int r=0; r<index; ++r)
			for(int c=0; c<3; ++c)
		{
			dump+=linesOfCode[r][c] + " ";
			if(c==2)
				dump+="\n";
		}
		return dump;
	}
}
