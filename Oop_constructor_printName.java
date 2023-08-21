
import java.util.* ;
import java.io.*; 
// this whole method is printing names and ages with constructor class and private methods.
	

	public class Oop_constructor_printName {
	private String name;
	private int age;

	// setting values
	public void setValue(String name, int age){
        this.name = name;
		this.age = age;
	}

	// printing values 
	public void getValues(){
		System.out.println("The name of the person is "+ this.name + " and the age is " + this.age + ".");
	}



	
	public static void main(String args[]) {
		Oop_constructor_printName p = new Oop_constructor_printName();
		Scanner sc = new Scanner(System.in);
       
		String name = sc.nextLine();
		int age = sc.nextInt();
		p.setValue(name, age);
		p.getValues();

	}

    }
		
    

