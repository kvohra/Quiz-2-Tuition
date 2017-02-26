import java.util.Scanner;


public class Calc {

	public static void main(String[] args) {
		
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.println("How much tuition will you be paying your first year in college?:");
		double tuition = input.nextDouble();
		
		System.out.println("By what percent will your tuition increase per year(ie: 27 = 27%):");
		double rate = 1 + ((input.nextDouble()) / 100);
		
		double tot = 0;
		for (int i = 0; i < 4; i++){
			
			double yearlytot = tuition * Math.pow(rate, i);
			tuition = yearlytot;
			tot += yearlytot;
			input.close();
		}
		
		System.out.printf("The total tuition to complete a degree is $%4.2f\n" , tot);
	}

}