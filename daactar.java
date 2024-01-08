
public class daactar {

}
import java.io.*;
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		System.out.println("Enter Your Choices: \n1: Receptionist. \n2: Patient. \n3: Doctor");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		do {
			switch(choice) {
			case 1: 
				Receptionist R = new Receptionist();
				R.choice();
				break;
			
			case 2:
				Patient P = new Patient();
				P.choice();
				break;
				
			case 3:
				Doctor D = new Doctor();
				D.choice();
				break;
				
			}
		}
		while(choice!= 4);
	}
}
