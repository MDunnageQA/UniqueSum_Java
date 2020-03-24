package com.qa.main;

public class UniqueSum 
{
	public int calculateUniqueSum (int sumFirstNumber, int sumSecondNumber, int sumThirdNumber)
	{
		int sumTotal;
		int numberOneCheck = sumFirstNumber;
		int numberTwoCheck = sumSecondNumber;
		int numberThreeCheck = sumThirdNumber;
		
		if (sumFirstNumber == numberTwoCheck || sumFirstNumber == numberThreeCheck)
		{
			sumFirstNumber = 0;
		}
		
		if (sumSecondNumber == numberOneCheck || sumSecondNumber == numberThreeCheck)
		{
			sumSecondNumber = 0;
		}
		
		if (sumThirdNumber == numberOneCheck || sumThirdNumber == numberTwoCheck)
		{
			sumThirdNumber = 0;
		}
		
		sumTotal = sumFirstNumber + sumSecondNumber + sumThirdNumber;
		return sumTotal;
	}

}
