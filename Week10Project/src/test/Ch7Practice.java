package test;

public class Ch7Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "Happy";
		//StringBuilder strB1 = new StringBuilder(input.nextLine());
		StringBuilder strB1 = new StringBuilder(ss);
		StringBuilder strB2 = new StringBuilder("AAA");
		System.out.println(strB1);
		strB1.append(" Birthday");
		System.out.println(strB1);
		strB1.insert(6, " 20th ");
		System.out.println(strB1);
		if(strB1.toString().equals(strB2.toString()))
			System.out.println("equal");
		
		
		
		String st1 = "tydf";
		String st2 = "abcTydf";
		if(st1.regionMatches(true,0, st2, 3, 4))
			System.out.println("region matches");
		else
			System.out.println("does not match");
		
		int iVal = 45;
		String sVal = Integer.toString(iVal); //int to string
		
		String s = "45";
		int val =  Integer.parseInt(s); // string to int
		
		//double // primitive type
		//Double // class
		
		String str1 = "canada is a beautiful country";
		String[] strArr = str1.split(" ");
		for(int i=0;i<strArr.length;i++)
			System.out.println(strArr[i]);
		
		System.out.println(str1.replace(' ', '_'));
		
		System.out.println(str1.indexOf('B'));
		
		int count = 1;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i) == ' ')
				count++;
		}
		System.out.println("number of words " + count);
		
		//System.out.print(str1.charAt(i)+ " ");
		System.out.println();
		System.out.println(str1);
		
		
		String str3;
		String str4 = null;
		
		String str2 = new String("cdffg");
		//str2 = "yui";
		if(str1.compareTo(str2) == 0)
			System.out.println("same");
		else if(str1.compareTo(str2)<0)
			System.out.println("first string is smaller");
		else if(str1.compareTo(str2)>0)
			System.out.println("first string is bigger");
		
		if(str1.equals(str2)) {
			System.out.println("same strings");
		}
		else
			System.out.println("different string");
		
		char ch = 'a';
		System.out.println(Character.toUpperCase(ch));
		
		Character ch1 = '&';
	}

}
