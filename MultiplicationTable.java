import java.util.Scanner;
class MultiplicationTable{
	public static void main(String [] args){
		int num;
		System.out.println("Enter any number");
		Scanner inp = new Scanner(System.in);
		num = inp.nextInt();
		for(int i=1; i<= 10; i++){
			System.out.println(num + " X " + i + " = " + (num*i));
		}
	}
}