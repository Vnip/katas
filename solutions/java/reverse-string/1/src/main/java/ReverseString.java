class ReverseString {

    String reverse(String inputString) {
        String reversedString = "";
		char[] inputStringArray = inputString.toCharArray();
		for (int i = inputStringArray.length - 1; i >= 0 ; i--) {
			reversedString += inputStringArray[i]; 
		}
		 return reversedString;    
    }
  
}
