package arraydatastructure;

import java.util.Scanner;

import arraydatastructure.Utils;

public class ArrayDataStructure {

	public static void main(String[] args) {

		ArrayProblems arrayProblems = new ArrayProblems();
		Scanner scanner = new Scanner(System.in);
		int[] sampleArray = new int[] { 1, 2, 3, 4, 2, 5, 4, 5, 2, 4, 5, 2, 4, 5, 6, 6 };
		Utils.println("Enter your choice");
		Utils.println("1 :=>How do you find the missing number in a given integer array of 1 to 10?");
		Utils.println("2 :=>How do you find the duplicate number on a given integer array?");
		Utils.println("3 :=>How do you find the largest and smallest number in an unsorted integer array?");
		Utils.println("4 :=>How do you find all pairs of an integer array whose sum is equal to a given number?");
		Utils.println("5 :=>How do you find duplicate numbers in an array if it contains multiple duplicates?");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			Utils.println("------ Solution 1 ------");
			arrayProblems.arrayProblem1_Solution1();
			Utils.println("------ Solution 2 ------");
			arrayProblems.arrayProblem1_Solution2();
			break;
		case 2:
			arrayProblems.arrayProblem2_Solution1(sampleArray);
			break;
		case 3:
			arrayProblems.arrayProblem3_Solution1(sampleArray);
			break;
		case 4:
			int givenNumber = 6;
			Utils.println("------ Solution 1 ------");
			arrayProblems.arrayProblem4_Solution1(sampleArray, givenNumber);
			Utils.println("------ Solution 2 ------");
			arrayProblems.arrayProblem4_solution2(sampleArray, givenNumber);
			Utils.println("------ Solution 3 ------");
			arrayProblems.arrayProblem4_solution3(sampleArray, givenNumber);
			break;
		case 5:
			Utils.println("------ Solution 2 ------");
			arrayProblems.arrayProblem1_Solution2();
			break;
		}
		scanner.close();
	}
}
