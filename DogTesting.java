class Dog{
	int size;
	String name;
	public Dog(int size, String name){
	this.size = size;
	this.name = name;
}
	void bark(){
		if (size > 10)
			System.out.println("Bhow bhow");
		else{
			System.out.println("Bhew bhew");
		}
	}
}

class DogTesting{
	public static void main(String[] args){
	Dog var1 = new Dog(5,"Bruno");
	Dog var2 = new Dog(12,"Remo");

	var1.bark();
	var2.bark();
}
}