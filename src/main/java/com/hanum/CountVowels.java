package com.hanum;

public class CountVowels {

	public static void main(String[] args) {
		
		String str="aaeiou1 ";
		int vowel=0;
		int digit=0;
		int blanks=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowel++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				digit++;
			}
			else if(Character.isWhitespace(str.charAt(i)))
			{
				blanks++;
			}
		}
		System.out.println("vowel is "+vowel);
        System.out.println("digit is "+digit);
        System.out.println("blanks is "+blanks);
	}

}
