package VarBran;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class LoopMap {
	
	public static void main(String[] args) {
		int sum, product, largest, smallest;
		ArrayList<Integer> ints = new ArrayList<Integer>();
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("enter 5 numbers");
		
		ints.add(myScan.nextInt());
		ints.add(myScan.nextInt());
		ints.add(myScan.nextInt());
		ints.add(myScan.nextInt());
		ints.add(myScan.nextInt());
		myScan.nextLine();
		
		sum = 0;
		for(Integer i : ints) {
			sum = i + sum;
		}
		
		product = 1;
		for(Integer i : ints) {
			product = i * product;
		}
		
		largest = ints.get(0);
		for(Integer i : ints) {
			if(i > largest) {
				largest = i;
			}
		}
		
		smallest = ints.get(0);
		for(Integer i : ints) {
			if(i < smallest) {
				smallest = i;
			}
		}
		
		System.out.println("Sum: " + sum + "\nProduct: " + product
				+ "\nLargest: " + largest + "\nSmallest: " + smallest);
		
		HashMap<String, String> cars = new HashMap<>();
		cars.put("Camry", "Toyota");
		cars.put("Civic", "Honda");
		cars.put("Tahoe", "Chevrolet");
		cars.put("Ultima", "Nissan");
		
		String userCar;
		System.out.println("What car model are you looking for?");
		userCar = myScan.nextLine();
		
		System.out.println("Checking if we have it...");
		
		if(cars.get(userCar) != null) {
			System.out.println("Yes, we have it. This model is part of our " + cars.get(userCar) + " lineup.");
		}
		else {
			System.out.println("We don't have this car.");
		}
		
		
		
	}

}
