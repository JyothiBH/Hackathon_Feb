
package Hackathon;

import java.util.Scanner;

public class Q1 {
		
		public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		boolean Arr[] = new boolean[3];
		int NoofTrue=0, NoofFalse =0;
		System.out.println("Enter the Boolean variables");
		
		for (int i=0;i<3;i++)
		{
			Arr[i]=S.nextBoolean()	;				
		}
		
		for (int j=0;j<3;j++)
		{
		if(Arr[j]==true)
		{
			NoofTrue = NoofTrue+ 1;
		}
		else
		{
			NoofFalse =NoofFalse+ 1;
		}
		}
		if (NoofTrue>=2)
		System.out.println("There are at least 2 booleans true out of three");
		S.close();
	}
	
	
	}


