// This program counts the number of inputs
// char, digit, space

class Inputcounter{
	public static void  main(String args[]){
		String str = "My name is Arpit Singh, I am 24 years old, my username @arpit";
		char [] chararray = str.toCharArray();
		int letter = 0;
		int space = 0;
		int digit = 0;
		int other = 0;

		for(int i =0; i<str.length(); i++){
			if (Character.isLetter(chararray[i])){
				letter++;
			}
			else if (Character.isDigit(chararray[i])){
				digit++;
			}
			else if(Character.isSpaceChar(chararray[i])){
				space++;
			}
			else{
				other++;
			}
		}

		System.out.println("letter: " + letter );
		System.out.println("space: "+ space);
		System.out.println("Digit: "+ digit);
		System.out.println("Other chars: "+ other);	
	}
}