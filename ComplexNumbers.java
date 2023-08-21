import java.util.Scanner;

public class ComplexNumbers {
	int real;
	int imaginary;

	public ComplexNumbers(int r, int i) {
		this.real = r;
		this.imaginary = i;
	}

	public void plus(ComplexNumbers c) {
		int real = this.real + c.real;
		int imaginary = this.imaginary + c.imaginary;
		this.real = real;
		this.imaginary = imaginary;
	}

	public void multiply(ComplexNumbers c) {
		int real = (this.real * c.real) - (this.imaginary * c.imaginary);
		int imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
		this.real = real;
		this.imaginary = imaginary;
	}

	public void print() {
		System.out.print(this.real + " + " + "i" + this.imaginary);
	}

}

class Solution {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int real1, imaginary1, real2, imaginary2;
		real1 = sc.nextInt();
		imaginary1 = sc.nextInt();
		real2 = sc.nextInt();
		imaginary2 = sc.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = sc.nextInt();
		if (choice == 1) {
			c1.plus(c2);
			c1.print();
		} else if (choice == 2) {
			c1.multiply(c2);
			c1.print();
		}

	}
}
    

