package com.song;

import java.util.Scanner;

public class Calulator {
		private double loanAmount;
		private double totalInterestRate;
		private int year;
		public double getLoanAmount() {
			return loanAmount;
		}
		public void setLoanAmount(double loanAmount) {
			this.loanAmount = loanAmount;
		}
		public double getTotalInterestRate() {
			return totalInterestRate;
		}
		public void setTotalInterestRate(double totalInterestRate) {
			this.totalInterestRate = totalInterestRate;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public double getInterest() {
			return loanAmount*totalInterestRate;
		}
		public double getRepaymentAmount() {
			return (loanAmount+getInterest())/year;
		}
		public void operation() {
			Scanner input=new Scanner(System.in);
			System.out.print("�����������:");
			loanAmount=input.nextDouble();
			System.out.print("����������:");
			totalInterestRate=input.nextDouble();
			System.out.print("�������������:");
			year=input.nextInt();
			System.out.println("����ϢΪ:"+getInterest());
			System.out.println("�»�����Ϊ:"+getRepaymentAmount());
		}
		public static void main(String[] args) {
			Calulator calulator=new Calulator();
			calulator.operation();
		}
}
