package com.common;

class ComplexNumber{
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real,int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void setReal(int real) {
		this.real=real;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary=imaginary;
	}
	
	public int getReal(){
		return this.real;
	}
	
	public int getImaginary(){
		return this.imaginary;
	}
	
	public ComplexNumber add(ComplexNumber c2){
		int real=this.real+c2.getReal();
		int imaginary=this.imaginary+c2.getImaginary();
		return new ComplexNumber(real,imaginary);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		ComplexNumber c=(ComplexNumber)obj;
		if(c.getImaginary()==this.getImaginary() &&  c.getReal()==this.getReal()) {
			return true;
		}
		else
			return false;
	}

	public String toString(){
		return "Result ="+this.getReal()+"+"+this.getImaginary()+"i";
	}
}