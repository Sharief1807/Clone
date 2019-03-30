package org.maven.programs.ProjectsForGIT;

import java.util.Scanner;

public class Sharief {
	
	
	public static void main(String[] args) {
		
		
		
		Scanner str1=new Scanner(System.in);
		System.out.println("enter a string");
		String str2=str1.nextLine();
		int c=0;
		char[] stringArray = str2.toCharArray();
		
		for(int i=0;i<stringArray.length;i++)
		{
			for(int j=0;j<stringArray.length;j++)
			{
				if(stringArray[i]==stringArray[j])
				{
					c++;
				}
			}
			System.out.print(stringArray[i]);
			System.out.println(":  "+c);
			c=0;
		}
		
	}
	

}
