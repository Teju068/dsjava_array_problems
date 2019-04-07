package arraydatastructure;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;

public class ArrayProblems {

	public void arrayProblem1_Solution1() {
		/**
		 * Creating an Array with 1 to 10 values
		 */
		int actualLength = 10;
		int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		int lengthOfArray = array.length;
		/**
		 * calculating actual sum of 1 to 10
		 */
		int expectedSum = actualLength * (actualLength + 1) / 2;

		/**
		 * calculating sum of number in the array
		 */
		int actualArraySum = 0;
		for (int i = 0; i < lengthOfArray; i++) {
			actualArraySum = actualArraySum + array[i];
		}

		/**
		 * difference is the missing number
		 */
		int missingNumber = expectedSum - actualArraySum;

		/**
		 * print missing number
		 */
		Utils.println("Missing number: " + missingNumber);
	}

	public void arrayProblem1_Solution2() {
		/**
		 * Creating an Array with 1 to 10 values
		 */
		int actualLength = 10;
		int array[] = new int[] { 1, 2, 3, 4, 5, 7, 9, 10 };
		int lengthOfArray = array.length;

		/**
		 * Creating a BitSet set function set the specified index to true
		 */
		BitSet bitSet = new BitSet(actualLength);
		for (int number : array)
			bitSet.set(number - 1);

		/**
		 * Find number of missing number finds the next Bit set as false, for e.g. first
		 * it will get the false index from 0, you get first false position as 5 and
		 * next from 6 next false index is 7 Note: BitSet index starts from 0
		 */
		int missingNumber = 0;
		int numberOfMissingNumbers = actualLength - lengthOfArray;
		for (int i = 0; i < numberOfMissingNumbers; i++) {
			missingNumber = bitSet.nextClearBit(missingNumber);
			Utils.println("Missing numbers using Bit Set: " + ++missingNumber);
		}
	}

	public void arrayProblem2_Solution1(int[] array) {
		/**
		 * Sort the array either using inbuilt function or write your own algorithm
		 */
		Arrays.sort(array);

		/**
		 * Now write the actual logic boolean variable is too find out, if same number
		 * exist more then once
		 */
		boolean isDuplicate = false;
		for (int i = 0; i < array.length; i++) {
			if (i + 1 < array.length && array[i] == array[i + 1]) {
				isDuplicate = true;
			} else {
				if (isDuplicate == true) {
					Utils.println("" + array[i]);
					isDuplicate = false;
				}
			}
		}
	}

	public void arrayProblem3_Solution1(int[] array) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			} else {
				min = array[i];
				max = array[i];
			}
		}
		Utils.println("Min Value " + min);
		Utils.println("Max Value " + max);
	}
	
	public void arrayProblem4_Solution1(int[] arrays, int givenNumber) {
		for (int i = 0; i < arrays.length; i++) {
			for (int j = i + 1; j < arrays.length; j++) {
				if (arrays[i] + arrays[j] == givenNumber) {
					Utils.println("(" + arrays[i] + "," + arrays[j] + ")");
				}
			}
		}
	}
	
	public void arrayProblem4_solution2(int[] arrays, int givenNumber) {
		HashSet<Integer> hash = new HashSet<Integer>(arrays.length);
		for (int i = 0; i < arrays.length; i++) {
			hash.add(arrays[i]);
		}

		for (int i = 0; i < arrays.length; i++) {
			int target = givenNumber - arrays[i];
			if (hash.contains(target)) {
				Utils.println("(" + arrays[i] + "," + target + ")");
			}
		}
	}
	
	public void arrayProblem4_solution3(int[] arrays, int givenNumber)
	{
		int left = 0;
		int right = arrays.length - 1;
		Arrays.sort(arrays);
		while (left < right) {
			int sum = arrays[left] + arrays[right];
			if (sum == givenNumber) {
				Utils.println("(" + arrays[left] + "," + arrays[right - 1] + ")");
				left = left + 1;
				right = right - 1;
			} else if (sum < givenNumber) {
				left = left + 1;
			} else if (sum > givenNumber) {
				right = right - 1;
			}
		}
	}
}
