package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc 
{

	private static final float charges=0; 
	
	
	public float getCharges() {
		return charges;
	}

	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("The Charges for Prime User Are "+charges+" without Delivery Charges");
	}	
	
	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}
	

}