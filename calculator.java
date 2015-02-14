class Calculator{
	public static void main(String[] args) {
		System.out.println("Enter number1 : ");
		int num1 = Integer.parseInt(System.console().readLine());
		System.out.println("Enter number2 : ");
		int num2 = Integer.parseInt(System.console().readLine());
		System.out.println("Enter 1 for add, 2 for subtract, 3 for mul, 4 for division : ");
		int op = Integer.parseInt(System.console().readLine());
		if(op==1) System.out.println("sum of "+num1+" and "+num2+" : "+add(num1, num2));	
		if(op==2) System.out.println("subtraction of "+num1+" and "+num2+" : "+sub(num1, num2));
		if(op==3) System.out.println("multiplication of "+num1+" and "+num2+" : "+mul(num1, num2));
		if(op==4) System.out.println("dividation of "+num1+" and "+num2+" : "+div(num1, num2));
	}
	public static int add (int num1, int num2){
		return num1+num2;
	}
	public static int sub (int num1, int num2){
		return num1-num2;
	}
	public static int mul (int num1, int num2){
		return num1*num2;
	}
	public static int div (int num1, int num2){
		return num1/num2;
	}
}