class ReverseString{
	public static void main(String [] args){
		String str = "arpit";
		
		char[] chararray = str.toCharArray();
		for(int i = chararray.length -1; i>=0; i--){
			System.out.print(chararray[i]);
		}

		}
	}
