package epam4;
import java.lang.Math;
import java.util.Scanner;

public class Interest {
		double principleAmount,interestRate,interestTime,finalAmount;
		int noOfTimesCompoundInterest;
		
	    void findSimpleInterest()
	    {
	    	Scanner sc=new Scanner (System.in);
	    	System.out.println("\t\t\t\tSimple Interest");
	    	System.out.println("\t\t\t-----------------------------");
	    	System.out.println("Enter Principle Amount");
	    	principleAmount=sc.nextDouble();
	    	System.out.println("Enter Rate of Interest");
	    	interestRate=sc.nextDouble();
	    	System.out.println("Enter Time");
	    	interestTime=sc.nextDouble();
	    	finalAmount = principleAmount * (1+ (interestRate*interestTime) );
	        System.out.println("The Simple Interest of given Principle : "+ finalAmount);
	    }
	    
	    
	    void findCompoundInterest()
	    {
	    	double powerRate;
	    	boolean y=false;;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("\t\t\t\tCompound Interest");
	    	System.out.println("\t\t\t-----------------------------");
	    	System.out.println("\n1.Daily\n2.Monthly\n3.Quatarly\n4.Half Yearly\n5.Yearly\n6.Exit");
	    	int n=sc.nextInt();
	    	System.out.println("Enter Principle Amount");
	    	principleAmount=sc.nextDouble();
	    	System.out.println("Enter Rate of Interest");
	    	interestRate=sc.nextDouble();
	    	System.out.println("Enter Time");
	    	interestTime=sc.nextDouble();
	    	System.out.println("Enter Number of Times the amount to be compounded");
	    	noOfTimesCompoundInterest=sc.nextInt();
	
	    	switch (n)
	    	{
	    	
	    		case 1: powerRate=Math.pow((1+ (interestRate/365)), noOfTimesCompoundInterest/365 );
	    		finalAmount=principleAmount*powerRate;
	    		break;
	    			
	    		case 2: powerRate=Math.pow((1+ (interestRate/12)/100),  noOfTimesCompoundInterest*12);
    			finalAmount=principleAmount*powerRate;
    			break;
    			
	    		case 3: powerRate=Math.pow((1+ (interestRate/4)/100),  noOfTimesCompoundInterest*4);
    			finalAmount=principleAmount*powerRate;
    			break;
    			
	    		case 4: powerRate=Math.pow((1+ (interestRate/2)/100),  noOfTimesCompoundInterest*2);
    			finalAmount=principleAmount*powerRate;
    			break;
    			
	    		case 5: powerRate=Math.pow((1+ (interestRate)/100),  noOfTimesCompoundInterest);
    			finalAmount=principleAmount*powerRate;
    			break;
	    		
	    		case 6:exit(0);
	    		System.out.println("Successfully Exited...!!!");
	    		break;
	    		default:
	    			System.out.println("Select from the given choice 1-6 only");
	    		
	    	}
	    	System.out.println("The Compound Interest of given Principle Amount is: "+finalAmount);
	    } 
	    


		private void exit(int i) {
			// TODO Auto-generated method stu		
		}
	
}
