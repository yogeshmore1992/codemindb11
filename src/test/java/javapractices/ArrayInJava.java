package javapractices;

public class ArrayInJava {

	public static void main(String[] args) {
		int a;

		// array declaration
		int rollno[];

		// array declaration and initialization
		int rollNo[] = new int[6];

		// Value storing inside array
		rollNo[0] = 51;
		rollNo[1] = 52;
		rollNo[2] = 53;
		rollNo[3] = 54;
		rollNo[4] = 55;
		rollNo[5] = 56;

		// Accessing elements from array.
		System.out.println("Accessing elements from array:");
		System.out.println(rollNo[0]);
		System.out.println(rollNo[1]);
		System.out.println(rollNo[3]);
		System.out.println(rollNo[4]);
		System.out.println(rollNo[5]);

		System.out.println("length of array is:" + rollNo.length);
	}
}
