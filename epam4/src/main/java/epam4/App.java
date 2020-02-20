package epam4;

import java.io.IOException;
/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException 
    {
    	Scanner sc=new Scanner(System.in);
    	Interest in=new Interest();
    	System.out.println("Select your choice");
    	System.out.println("1.SimpleInterest\n2.Compound Interest\n3.Exit");
    	int choice=sc.nextInt();
    	switch(choice) {
    	case 1: 
               in.findSimpleInterest();
               break;
    	case 2:
    		   in.findCompoundInterest();
    		   break;
    	case 3:
    		exit(0);
    		System.out.println("Exited...!");
    		break;
    		default:
    			System.out.println("Select from 1-3");
    }
    	sc.close();
    	
}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}
}
    	





