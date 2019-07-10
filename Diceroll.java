import java.util.*;
class Diceroll{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		int a=0,b=0,total=0,sw=0;
		a=rand.nextInt(6)+1;
		b=rand.nextInt(6)+1;
		total=a+b;
		String name;
		System.out.println("What is your name?");
		name=sc.next();
		System.out.println("Hello, "+name+"!");
		while(sw==0){
			System.out.println("Die 1: "+a);
			System.out.println("Die 2: "+b);
			System.out.println("Total value: "+total);
			if(total>7) System.out.println(name+" won");
			else System.out.println(name+" lose");
			System.out.println("Do you try again?(Yes: 0,No: 1)");
			sw=sc.nextInt();
		}
	}
}
