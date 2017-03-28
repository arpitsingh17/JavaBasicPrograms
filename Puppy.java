public class Puppy{
	int puppyAge;

	public Puppy(String name){
		System.out.println("Name chosen is " + name );
	}

	public void setAge(int age){
		puppyAge = age;
	}

	public void getAge(){
		System.out.println("Pupp's age is " + puppyAge);
		
	}

	public static void main(String []args){
		Puppy myPuppy = new Puppy("tommy");
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("Variable value" +myPuppy.puppyAge);
	}
}