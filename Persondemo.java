
package persondemo;

import java.util.Scanner;

public class Persondemo {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		Person p1=new Person(System.in);
		String name,city;
		int age;
		System.out.println("Enter person name:");
		name=sn.nextLine();
		System.out.println("Enter person age:");
		age=sn.nextInt();
		System.out.println("Enter person city:");
		city=sn.nextLine();
		P1.setpersonName(name);
		P1.setpersonAge(age);
		P1.setcityName(city);
		System.out.println("\nPerson name:"+getpersonName()+"\nPerson age:"+getpersonAge()+"\nPerson city:"\n+getcityName);
		System.out.println("Enter person name:");
		name=sn.nextLine();
		System.out.println("Enter person age:");
		age=sn.nextInt();
		System.out.println("Enter person city:");
		city=sn.nextLine();
		P1=new Person(name,age,city);
		System.out.println();
		System.out.println("\nPerson name:"+getpersonName()+"\nPerson age:"+getpersonAge()+"\nPerson city:"\n+getcityName);
		
		
	}

}
