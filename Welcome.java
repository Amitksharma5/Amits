
public class Welcome {
public static void main (String args[]) {
	System.out.println("HelloWorld");
	System.out.println("Welcome Everyone");

	//type name_of_var = value;
	
	//type age = 24;
	
	byte age = 24;
	short DOB = 1997;
	int pincode = 400104;
	long phoneNum = 9004654245L;
	
	char section = 'A';
	String name = "Amit sharma";
	
	int myInt = 9;
	double myDouble = myInt;
	//widening/automatic
	System.out.println(myDouble);
	
	
	//explict type
	double myDoubleVar = 9.78d;
	int myIntVar = (int) myDoubleVar;
	System.out.println(myIntVar);
	
	
	int myNum = 209;
	if (myNum % 2 == 0) {
		System.out.println("even");
	
	}else {
		System.out.println("odd");
	
	}
	
	
	int myNum2 =0;
	if (myNum2 == 0) {
		System.out.println("zero");
	}else if (myNum2 % 2 ==0) {
		System.out.println("even");
	}else {
		System.out.println("odd");
	}
	
	int num1 = 50;
	if (num1 > 0 && num1 % 2 == 0) {
		System.out.println("even positive");
	}else if (num1 < 0 && num1 % 2 == 0) {
		System.out.println("odd negative");
	}else if (num1 == 0) {
		System.out.println("zero");
	}else if (num1 > 0 && num1 % 2 != 0) {
		System.out.println("odd negative");
	}
	
	int num2 = 40;
	if (num2 > 0 || num2 < 0) {
		System.out.println("not zero");
	}else {
		System.out.println("zero");
	}
	



	
	
	
	
	
	
}

}
