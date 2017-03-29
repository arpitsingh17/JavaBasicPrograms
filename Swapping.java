class Swapping{
	public static void main(String args[]){
		int a = 3;
		int b = 5;

		a = a+b;
		b = a - b;
		a = a - b;

		System.out.println("New value of a and b :"+ a + ", " + b);
	}
}