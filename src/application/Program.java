package application;

import java.util.Locale;

import entities.MonthlyBilling;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double others = 19849.53;
		
		MonthlyBilling monthlyBilling = new MonthlyBilling(SP, RJ, MG, ES, others);
		monthlyBilling.total();
		
		System.out.println("Porgentagem de cada estado: ");
		System.out.printf("São Paulo: %.2f%n", monthlyBilling.percentage(SP));
		System.out.printf("Rio de Janeiro: %.2f%n", monthlyBilling.percentage(RJ));
		System.out.printf("Minas Gerais: %.2f%n", monthlyBilling.percentage(MG));
		System.out.printf("Espírito Santo: %.2f%n", monthlyBilling.percentage(ES));
		System.out.printf("Outros: %.2f%n", monthlyBilling.percentage(others));
	}
}
