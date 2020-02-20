package epam4;

import java.io.IOException;

public class MainHouseClass 
	{
		    public static void main(String args[]) throws IOException 
		    {
		    	HouseConstruction c = new HouseConstruction();
		    	System.out.println("Cost of Construction of House");
		    	System.out.println("-----------------------------");
		    	c.costEstimation();
		    }
	}
