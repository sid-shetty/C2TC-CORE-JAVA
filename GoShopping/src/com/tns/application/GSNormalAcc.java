package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);	
	}
	
	public GSNormalAcc() {
		super(accNo, accNm, deliveryCharge, deliveryCharge);
	}

	public void bookProduct(float charges)
	{
		System.out.println("The Charges for Normal User Are: "+charges+" with Delivery Charges is: "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + getAccNo() + ", charges=" + getCharges() + ", toString()=" + super.toString()
				+ ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}