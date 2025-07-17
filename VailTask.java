package InterviewChallenges.VailSystem;

import java.util.Arrays;

public class VailTask {

	public static void main(String[] args) {
		
		int[] original = {1, 2, 3, 4, 5, 6, 7};
		
		 try {
	            int[] rotatedBy2 = rotateLeft(original, 2);
	            System.out.println("Rotate by 2: " + Arrays.toString(rotatedBy2));

	            int[] rotatedBy8  = rotateLeft(original, 8);
	            System.out.println("Rotate by 8: " + Arrays.toString(rotatedBy8));

	            int[] rotatedByNeg1  = rotateLeft(original, -1); // This will throw an error
	            System.out.println("Rotate by -1: " + Arrays.toString(rotatedByNeg1));
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }	    
	}

	public static int[] rotateLeft(int[] numArray, int rotateBy) {
		
        int arrLength = numArray.length;

        // Throw a custom error if rotation is negative
        if (rotateBy < 0) {
            throw new IllegalArgumentException("Rotation value cannot be negative.");
        }

        // In case the rotation is more than the array length
        rotateBy = rotateBy % arrLength;

        // Create a new array to store result
        int[] rotated = new int[arrLength];

        // Shift elements to the left by rotateBy positions
        for (int i = 0; i < arrLength; i++) {
            int newIndex = (i + arrLength - rotateBy) % arrLength;
            rotated[newIndex] = numArray[i];
        }

        return rotated;
	}	
	
}
