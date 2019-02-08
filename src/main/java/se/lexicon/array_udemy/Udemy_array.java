package se.lexicon.array_udemy;


import java.util.Scanner;

public class Udemy_array {
	 Scanner sc1=new Scanner(System.in);
	 int count =0;
//1 in brackets means array can be extended;
	 int[] myarray=new int[3];
	 
	 public String  get2_input() {
		 Scanner sc2=new Scanner(System.in);
		 String in2 =sc2.nextLine();

     return in2; 
	 } 
	
	 public int  get_input() {
		 int in =sc1.nextInt();

     return in; 
	 }
	
	public   int input_array() {		
		for (int i=0;i<myarray.length;i++) {
			int maxnomber=0;
			System.out.println("input  element");
	int	nomber=get_input();
			myarray[i]=nomber;
			if (myarray[i]>maxnomber) {
				maxnomber=	myarray[i];
			}
			System.out.println(myarray[i]);
			count=count+1;
			System.out.println("nomber_of_elements :"+count);
			System.out.println("maximom nomber is :"+maxnomber);
		}
		
		System.out.print('[');
		for ( int i=0;i<myarray.length;i++) {
			System.out.print(myarray[i] + ", ");
		}
		System.out.println(']');
return count;
}
}