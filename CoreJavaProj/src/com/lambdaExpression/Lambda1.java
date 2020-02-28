package com.lambdaExpression;

public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functional<Integer> functionalAddition=(Integer i,Integer j)-> i+j;
		Functional<Integer> functionalSubtraction=(Integer i,Integer j)-> i-j;
		Functional<Integer> functionalDivision=(Integer i,Integer j)-> i/j;
		Functional<Integer> functionalMultiplication=(Integer i,Integer j)-> i*j;
		
		int add=functionalAddition.operations(10,5);
		int subtract=functionalSubtraction.operations(10,5);
		int divide=functionalDivision.operations(10,5);
		int multiply=functionalMultiplication.operations(10,5);
		System.out.println("Addition : "+add+", Subtraction : "+subtract+", Division : "+divide+", Multiplication : "+multiply);
	}

}
