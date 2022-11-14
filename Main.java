package sort;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vector = new double[n];

		for (int i = 0; i < vector.length; i++) {
			double number = sc.nextDouble();
			vector[i] = number;
		}

		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
		
		System.out.println("-----------------------");
		
		double[] newVector = sort(vector);
		for (int i = 0; i < newVector.length; i++) {
			System.out.println(newVector[i]);
		}
		
		sc.close();
	}

	public static double[] sort(double[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = 0; j < numbers.length; j++) {
				
				int current = j;
				int next = j + 1;
				double tmp = 0;
				
				if (next == numbers.length) {
					break;
				}
				
				if (numbers[current] < numbers[next]) {
					tmp = numbers[current];
					numbers[current] = numbers[next];
					numbers[next] = tmp;
				}
			}

		}
		return numbers;
	}
}
