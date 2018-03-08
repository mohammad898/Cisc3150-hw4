package h4444;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;

	public class Combination
	{
	  

	  public static void main(String[] args) 
	  {	
		  
		  int Rows;
		  int leng;
		  List<String[]> array = new ArrayList<String[]>();
		  Scanner keyboad = new Scanner(System.in);
		  System.out.printf("How many rows do you want: ");
		  Rows = keyboad.nextInt();
		  
		  if(Rows < 2)
			  System.out.println("Rows can not have less then 2");
		  for(int a = 0; a< Rows; a++)
		  {
			 System.out.printf("Enter Number of Length [%d]: ", a);
			 leng = keyboad.nextInt();
			 String[] t = new String[leng];
			 for(int j = 0; j < leng; j++)
			 {
				 System.out.printf("Enter Character what ever   %d element  you like [%d]: ", j, a);
				 t[j] = keyboad.next();
			 }
			 array.add(t);
		  }

	    List<String> arraylist1 = Arrays.asList(array.get(0));
	    for(int i = 1; i < array.size(); i++) 
	    	arraylist1 = maches(arraylist1,Arrays.asList(array.get(i)));
	    
	    System.out.println("Letters formet: ");
	    
	    System.out.println(arraylist1+ "\n");
	    }
	    
	  
	  
	  public static List<String> maches(List<String> left, List<String> right) 
	  {
	   	 List<String> arraylist2 = new ArrayList<String>();
	   	 for (int m = 0; m < left.size(); m++) 
	   	 	for (int n = 0; n < right.size(); n++) 
	   	 	arraylist2.add(left.get(m) + right.get(n));
	   	 return arraylist2;
	  }
	}