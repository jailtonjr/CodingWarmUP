package com.jailton.louzada;

import java.util.Arrays;

public class CodingBat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(last2("axxxaaxx"));
		int vector[] = {1, 2, 7, 1};
//		System.out.println(array123(vector));
//		System.out.println(stringMatch("xxcaazz", "xxbaaz"));
//		System.out.println(altPairs("Chocolate"));
//		stringYak("yakpak");
//		System.out.println(array667(vector));
//		System.out.println(countXX("abcxx"));
//		System.out.println(stringX("xxHxix"));	
//		System.out.println(has271(vector));
		System.out.println(middleThree("solving"));
		
		
	}


	public static String backAround(String str) {

		char back = str.charAt(str.length()-1);

		return back + str + back;

	}

	public static String front22(String str) {

		if(str.length() <= 2)  {
			return str+str+str;
		}

		return str.substring(0,2)+str+str.substring(0,2);

	}

	public boolean in1020(int a, int b) {
		if (a >= 10 ||  a <= 20){
			return true;
		}else if(b >= 10 || b <= 20){
			return true;
		}

		return false;
	}

	public static String delDel(String str) {

		//		System.out.println(str.substring(1,4));

		if(str.length() <=3){
			return str;
		}
		if(str.substring(1,4).equals("del")){
			String buf = str.charAt(0) + str.substring(4,str.length());
			return buf;
		}
		return str;
	}

	public static String startOz(String str) {
		if(str.length()<= 2){
			return "";
		}

		if(str.charAt(0) == 'o'){
			if(str.charAt(1) == 'z'){
				return str.substring(0,2);
			}else return String.valueOf(str.charAt(0));
		}

		if(str.charAt(1) == 'z'){
			if(str.charAt(0) == 'o'){
				return str.substring(0,2);
			}else return String.valueOf(str.charAt(1));
		}

		return "";
	}

	public int close10(int a, int b) {

		if(Math.abs(a-10) < Math.abs(b-10)) {
			return a;
		}
		if (Math.abs(a-10) == Math.abs(b-10)) {
			return 0;
		}
		return b;
	}

	public boolean stringE(String str) {
		int count = 0;

		for (char ch: str.toCharArray()) {
			if (ch == 'e') {
				count++;
			}
		}

		if (count <= 3) {
			return true;
		}

		return false;
	}


	public static String everyNth(String str, int n) {

		if (str.length() <= 1) {
			return str;
		}
		
		System.out.println(str.length());

		char [] arrayChar = new char[str.length()];
		
		arrayChar[0] = str.charAt(0);

		int j = 1;
		int tem = n;

		for (int i = 0; i < str.length(); i++,j++) {

			if (n <= str.length()-1) {
				arrayChar[j] = str.charAt(n);
				n = n+tem;
			}

		}
		String buf = new String(arrayChar);

		return buf.trim();
	}

	public boolean lastDigit(int a, int b) {
		
		System.out.println();
		
		return true;
	}

	public static String endUp(String str) {

		if(str.length() <=3){
			return str.toUpperCase();
		}

		String buf = str.substring(str.length()-3,str.length()).toUpperCase();
		String buf2 = str.substring(0,str.length()-3);

		return buf2 + buf;

	}
	
	public static String stringTimes(String str, int n) {

		if (n >= 1){
			return str + stringTimes(str,n-1);
		}

		return "";
	}
	

	public static String frontTimes(String str, int n) {

		if (n >= 1) {
			if (str.length()<3) {
				return str + frontTimes(str, n - 1);
			}

			String sub = str.substring(0,3);
			return sub + frontTimes(str, n - 1);
		}

		return "";

	}
	

/*Count the number of "xx" in the given string. 
 * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3*/
	
	static int countXX(String str) {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length()-1 ) {
				if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
					count++;
				}
			}
		}
		
		return count;
	}
	

	static boolean doubleX(String str) {

		if(str.length()<=1) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'x') {
				if (str.length()-1 != i && str.charAt(i+1) == 'x') {
					return true;
				}else return false;

			}

		}
		return false;
	}
	
	static public String stringSplosion(String str) {
		

		if(str.isEmpty()) {
			return str;
		}
		
		String temp = "";
		
		for (int i = 0; i <= str.length(); i++) {
			
			temp = temp + str.substring(0,i);
		}
		
		return temp;
	}	

	static public int last2(String str) {
		int count = 0;  
		
		for (int i = 0; i < str.length()-3; i++) {
			if (i < str.length()-1) {
				if (str.charAt(i) == str.charAt(i+1)) {
					i++;
					count++;
				}
			}
		}
		return count;
	}
	
	public int arrayCount9(int[] nums) {
		
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		
		return count;
	}

	
	public boolean arrayFront9(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9 && i <= 4) {
				return true;
			}
		}

		return false;  
	}

	
	static public boolean array123(int[] nums) {
		  
		String arrayInt = Arrays.toString(nums);
		  System.out.println(nums + arrayInt);
		  if(arrayInt.contains("123")) {
			  return true;
		  }
		  return false;
		}

	
	static public int stringMatch(String a, String b) {

		if (a.length() == 2 && b.length() == 2) {
			if (a.contentEquals(b)) {
				return 1;
			}
		}

		if (a.isEmpty() || b.isEmpty()) {
			return 0;
		}

		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if ((i < a.length()-1) && (i < b.length()-1)) {
				if (a.substring(i,i+2).equals(b.substring(i,i+2))) {
					count++;
				}

			}
		}


		return count;

	}
	

/*	Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
			altPairs("kitten") → "kien"
			altPairs("Chocolate") → "Chole"
			altPairs("CodingHorror") → "Congrr"*/
		
	static public String altPairs(String str) {

		
		if (str.length()<=1) {
			return str;
		}
		
		String temp = "";		
		for (int i = 0; i < str.length(); i=i+4) {
			
			int tail = i+2;
			if (tail > str.length()) {
				tail = str.length();
			}
			temp = temp + str.substring(i,tail);
			
		}
		return temp;
	}


/*Suppose the string "yak" is unlucky. Given a string, return a 
 * version where all the "yak" are removed, but the "a" can be any char. 
 * The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"*/
	
	static public String stringYak(String str) {
		
		return str.replaceAll("yak","");
		  
	}


/*Given an array of ints, return the number of times that two 6's are next to each other in the array. 
Also count instances where the second "6" is actually a 7.


array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1*/

	static public int array667(int[] nums) {
		int count = 0,tail = 0;
		for (int i = 0; i < nums.length; i++) {
			tail+=1;
			if (tail <= nums.length-1) {
				if (nums[i] == 6 && (nums[tail] == 6 || nums[tail] == 7)) {
					count++;
				}
			}
		}

		return count;
	}
	
	

/*Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. 
Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false*/
	
	public boolean noTriples(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					
				}
			}
		}
		
		return false;

	}
	
/*	Given a string, return a version where all the "x" have been removed. 
	Except an "x" at the very start or end should not be removed.


			stringX("xxHxix") → "xHix"
			stringX("abxxxcd") → "abcd"
			stringX("xabxxxcdx") → "xabcdx"*/
	
	static public String stringX(String str) {
		if (str.length() <= 1) {
			return str;
		}
		
		String regex = "[x]";
		String middle = str.substring(1,str.length()-1);
		String changed = str.charAt(0) + middle.replaceAll(regex, "") + str.charAt(str.length()-1);
		return changed.trim();
	}
	
	
/*	Given an array of ints, return true if it contains a 2, 7, 1 
	pattern: a value, followed by the value plus 5, followed by the value minus 1. 
	Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


			has271([1, 2, 7, 1]) → true
			has271([1, 2, 8, 1]) → false
			has271([2, 7, 1]) → true*/
	
	static public boolean has271(int[] nums) {
		
		String buf = Arrays.toString(nums).trim();
		if (buf.contains("2,7,1")) {
			return true;
		}
		
		return false;

	}
	
	// Easy shit

	int returnNthEvenNum(int num) {
		
		int result = 0;
		
		for (int i = 0; i < num; i++) {
			if (num % 2 == 0) {
				result += 2;
			}
		}
		return result;
	}
	

/*Given two strings, a and b, return the result of putting them together in the order abba,
e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"*/
	
	public String makeAbba(String a, String b) {

		return a + b + b + a;
	}
	

/*Given an "out" string length 4, such as "<<>>", and a word, 
return a new string where the word is in the middle of the out string, e.g. "<<word>>". 
Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"*/

	
	public String makeOutWord(String out, String word) {

		if (word.isEmpty()) {
			return word;
		}

		return out.substring(0,2) + word + out.substring(2,4);

	}
	

/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
*/

	public String extraEnd(String str) {
		
		if (str.isEmpty()) {
			return str;
		} 
		
		return str.substring(str.length()-2,str.length()) + 
				str.substring(str.length()-2,str.length()) + 
				str.substring(str.length()-2,str.length()) ; 
	}
	

/*Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
		Note that str.length() returns the length of a string.


firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"*/
	
	public String firstTwo(String str) {
		  if (str.length() <= 1) {
			return str;
		}
		  
		  return str.substring(0,2);
	}
	

/*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"*/
	
	public String firstHalf(String str) {
		if (str.length() % 2 == 0) {
			int halfSize = str.length()/ 2;
			return str.substring(0,halfSize);
		}

		return str;
	}

/*Given a string, return a version without the first and last char, so "Hello" yields "ell". 
The string length will be at least 2.

			withoutEnd("Hello") → "ell"
			withoutEnd("java") → "av"
			withoutEnd("coding") → "odin"*/
	public String withoutEnd(String str) {
		
		if (str.length() <= 2) {
			return "";
		}
		
		return str.substring(1,str.length()-1);
		
	}


/*Given 2 strings, a and b, return a string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside. 
The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"*/
	
	public String comboString(String a, String b) {
		
		if (a.isEmpty() && b.isEmpty()) {
			return "";
		}
		
		if (a.length() < b.length()) {
			return a + b + a;
		}else return b + a + b;
	}


/*Given 2 strings, return their concatenation, 
except omit the first char of each. The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"*/
	
	public String nonStart(String a, String b) {
		if (a.length() <= 1) {
			if (b.length() <= 1 ) {
			}else return b.substring(1,b.length());
		}
		return a.substring(1,a.length()) + b.substring(1,b.length());
	}


/*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
 * The string length will be at least 2.


left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"*/

	public String left2(String str) {
		if (str.length() == 2) {
			return str;
		}
		return str.substring(2,str.length()) + str.substring(0,2);
	}

/*	Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
The string length will be at least 2.


			right2("Hello") → "loHel"
			right2("java") → "vaja"
			right2("Hi") → "Hi"	*/
	
	public String right2(String str) {
		if (str.length() == 2) {
			return str;
		}
		return str.substring(str.length()-2,str.length()) + str.substring(0,str.length()-2);
	}
	
	

/*Given a string, return a string length 1 from its front, unless front is false, 
in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"*/
	
	public String theEnd(String str, boolean front) {
		
		if (str.length() == 1) {
			return str;
		}
		
		if (front) {
			return str.substring(0,1);
		}return str.substring(str.length()-1,str.length());		
	}


/*Given a string, return a version without both the first and last char of the string. 
The string may be any length, including 0.


withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""*/
	
	public String withouEnd2(String str) {

		if (str.length() <= 2 || str == null) {
			return "";
		}

		return str.substring(1,str.length()-1);
	}

	

/*Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". 
The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"*/
	
	public String middleTwo(String str) {
		
		if (str.length() == 2) {
			return str;
		}
		
		int half = str.length() / 2;
		
		return str.substring(half-1,half+1);
		  
	}


/*Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false*/
	
	public boolean endsLy(String str) {

		if (str.length() <= 1) {
			return false;
		}

		if (str.endsWith("ly")) {
			return true;
		}
		return false;

	}
	
	
/*	Given a string and an int n, return a string made of the first and last n chars from the string. 
	The string length will be at least n.


			nTwice("Hello", 2) → "Helo"
			nTwice("Chocolate", 3) → "Choate"
			nTwice("Chocolate", 1) → "Ce"*/

	public String nTwice(String str, int n) {
		
		if (str == null || str.length() < n) {
			return str;
		}
		
		return str.substring(0,n) + str.substring(str.length()-n, str.length());
	}
	

/*Given a string and an index, return a string length 2 starting at the given index. 
If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.


twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"*/

	public String twoChar(String str, int index) {
		
		if (str== null || str.length() == 2) {
			return str;
		}
		
		if (index >= str.length()) {
			return str.substring(0,2);
		}
		
		if (index <= 0) {
			return str.substring(0,2);
		}
		
		if ((index + 2) > str.length() ) {
			return str.substring(0,2);

		}
		
		return str.substring(index,index+2);

	}
	

/*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"*/
	
	static public String middleThree(String str) {

		if (str == null || str.length() <= 3) {
			return str;
		}
		int half = str.length()/2 + 1;
		
		return str.substring(half-2,half+1);
	}
	

/*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". 
The string may be any length, including 0. Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
*/

	public boolean hasBad(String str) {
		if (str == null || str.length() < 3) {
			return false;
		}

		if (str.substring(0,3).equals("bad")) {
			return true;
		}
		
		if (str.length() > 3) {
			if (str.substring(1,4).equals("bad")) {
				return true;
			}
		}

		return false;
	}
	

/*Given a string, return a string length 2 made of its first 2 chars. 
If the string length is less than 2, use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"*/
	
	public String atFirst(String str) {

		if (str == null || str.length() == 2) {
			return str;
		}

		if (str.length() <= 1) {
			if (str.isEmpty()) {
				return "@@";
			}
			return str + '@';
		}

		return str.substring(0,2);
	}

	

/*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". 
If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"*/
	
	public String lastChars(String a, String b) {
		if (a == null || b == null) {
			return "";
		}
		
		if (a.isEmpty()) {
			if (b.isEmpty()) {
				return "@@";
			} else return "@" + b.charAt(b.length()-1);
		}
		
		if (b.isEmpty()) {
			if (a.isEmpty()) {
				return "@@";
			} else return  a.charAt(0) + "@";
		}
		
		return a.substring(0,1) + b.charAt(b.length()-1);
	}
	
/*Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


			conCat("abc", "cat") → "abcat"
			conCat("dog", "cat") → "dogcat"
			conCat("abc", "") → "abc"
*/
	
	public String conCat(String a, String b) {
		
		if (a == null || b == null) {
			return "";
		}
		
		if (a.isEmpty()) {
			if (b.isEmpty()) {
				return "";
			} else return b;
		}
		
		if (b.isEmpty()) {
			if (a.isEmpty()) {
				return "";
			} else return a;
		}
		
		if (a.charAt(a.length()-1) == b.charAt(0)) {
			return a.substring(0,a.length()-1) + b;
		}
		
		return a.concat(b);
		  
	}
	
	
/*	Given a string of any length, return a new string where the last 2 chars,
	if present, are swapped, so "coding" yields "codign".


			lastTwo("coding") → "codign"
			lastTwo("cat") → "cta"
			lastTwo("ab") → "ba"*/
	
	public String lastTwo(String str) {
		
		if (str.isEmpty() || str == null) {
			return "";
		}
		
		if (str.length() == 1) {
			return str;
		}
		
		String sufix = str.substring(str.length()-2, str.length());
		StringBuilder buf = new StringBuilder(sufix);
		buf.reverse();
		
		if (str.length() == 2) {
			return buf.toString();
		}
		
		return str.substring(0,str.length()-2) + buf;
	}
	

/*Given a string, if the string begins with "red" or "blue" return that color string, 
otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"*/

	public String seeColor(String str) {
		
		if (str == null || str.length() < 3) {
			return "";
		}
		
		if (str.startsWith("blue")) {
			return "blue";
		}
		if (str.startsWith("red")) {
			return "red";
		}
		
		return "";
		  
	}
	


/*Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true*/

	public boolean frontAgain(String str) {
		if (str == null || str.length() <= 1) {
			return false;
		}
		if (str.length() <= 2) {
			return true;
		}

		String text = str.substring(0,2);

		if (str.endsWith(text)) {
			return true;
		}
		return false;
	}

	

/*Given two strings, append them together (known as "concatenation") and return the result. 
However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. 
So "Hello" and "Hi" yield "loHi". The strings may be any length.*/
/*
	minCat("Hello", "Hi") → "loHi"
	minCat("Hello", "java") → "ellojava"
	minCat("java", "Hello") → "javaello"*/
	
	public String minCat(String a, String b) {
		if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
			return "";
		}
		
		if (a.length() < b.length()) {
			int tam = b.length() - a.length();
			return a.concat(b.substring(tam,b.length()));
		}
		
		if (a.length() > b.length()) {
			int tam = a.length() - b.length();
			return a.substring(tam,a.length()) + b;
		}
		
		return a+b;
		
	}


/*Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
The string may be any length. If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
	*/
	
	public String extraFront(String str) {
		  if (str == null || str.isEmpty()) {
			return "";
		}
		  
		if (str.length() == 1) {
			return str + str + str;
		}
		
		return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
	}
	

/*Given a string, if a length 2 substring appears at both its beginning and end, return 
a string without the substring at the beginning, so "HelloHe" yields "lloHe". 
The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""*/

	public String without2(String str) {

		if (str == null || str.isEmpty() || str.length() < 2) {
			return str;
		}

		if (str.endsWith(str.substring(0,2))) {
			return str.substring(2,str.length());
		}

		return str;
	}


/*Given a string, return a version without the first 2 chars. 
Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"*/
	
	public String deFront(String str) {    
		if (str == null || str.isEmpty() || ( str.length() <= 2 && str.equals("ab")) ) {
			return str;
		}

		if (str.length() == 2  && str.equals("ab")) {
			return "";
		}

		if (str.charAt(0) == 'a') {
			if (str.charAt(1) == 'b') {
				return str;
			}else return str.charAt(0)+ str.substring(2,str.length());
		}

		if (str.charAt(1) == 'b') {
			return str.charAt(1)+ str.substring(2,str.length());
		}

		return str.substring(2,str.length());

	}
	

/*Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, 
except its first char does not need to match exactly. On a match, 
return the front of the string, or otherwise return the empty string. 
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"*/

	public String startWord(String str, String word) {
		
		if (str == null || str.isEmpty() || str.length() < word.length()) {
			return "";
		}
		
		if (str.startsWith(word)) {
			return word;
		}
		
		if (word.substring(1,word.length()).equals(str.substring(1,word.length()))) {
			return str.substring(0,word.length());
		}

		
		return "";
		
	}


/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"*/
	
	public String withoutX(String str) {
		
		if (str == null || str.isEmpty()) {
			return "";
		}
		
		if (str.length() == 1 && str.startsWith("x")) {
			return "";
		}
		
		if (str.startsWith("x")) {
			if (str.endsWith("x")) {
				return str.substring(1,str.length()-1);
			}else return str.substring(1,str.length());
		}
		
		if (str.endsWith("x")) {
			return str.substring(0,str.length()-1);
		}
		
		return str;
		  
	}
	

/*Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, 
and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
*/
	
	public String withoutX2(String str) {

		if (str == null || str.isEmpty()) {
			return "";
		}

		if (str.length() == 1 && str.startsWith("x")) {
			return "";
		}
		
		if (str.length() == 2) {
			return str.replace("x", " ").trim();
		}

		String prefx = str.substring(0,2);
		String post = str.substring(2,str.length());
		if (prefx.contains("x")) {
			return  prefx.replace("x", " ").trim() + post;
		}

		return str;
	}
	

/*When squirrels get together for a party, they like to have cigars. 
A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
Unless it is the weekend, in which case there is no upper bound on the number of cigars.
Return true if the party with the given values is successful, or false otherwise.


cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
*/
	
	public boolean cigarParty(int cigars, boolean isWeekend) {

		if (isWeekend) {
			if (cigars >= 40 ) {
				return true;
			}
		}else if (cigars >= 40 && cigars <= 60) {
			return true;
		}
		return false;
	}
	

/*You and your date are trying to get a table at a restaurant. 
The parameter "you" is the stylishness of your clothes, in the range 0..10, 
and "date" is the stylishness of your date's clothes. 
The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. 
If either of you is very stylish, 8 or more, then the result is 2 (yes). 
With the exception that if either of you has style of 2 or less, then the result is 0 (no). 
Otherwise the result is 1 (maybe).


dateFashion(5, 10) → 2
dateFashion(5, 2) → 0
dateFashion(5, 5) → 1*/
	
	public int dateFashion(int you, int date) {

		if (you >= 8) {
			if (date > 2 ) {
				return 2;	
			}return 0;
		}

		if (date >= 8) {
			if (you > 2 ) {
				return 2;	
			}return 0;
		}
		
		if (you <= 2 || date <= 2) {
			return 0;
		}
		
		return 1;
	}

	

/*The squirrels in Palo Alto spend most of the day playing. 
In particular, they play if the temperature is between 60 and 90 (inclusive). 
Unless it is summer, then the upper limit is 100 instead of 90. 
Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.


squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true*/

	public boolean squirrelPlay(int temp, boolean isSummer) {
		
		if (isSummer) {
			if (temp >= 60 && temp <= 100) {
				return true;
			}
		}else if (temp >= 60 && temp <= 90) {
			return true;
		}
		 
		return false;
	}
	

/*You are driving a little too fast, and a police officer stops you. 
Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
If speed is 60 or less, the result is 0. 
If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. 
Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.


caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0*/
	
	public int caughtSpeeding(int speed, boolean isBirthday) {

		if (isBirthday) {
			if ((speed-5)>= 81) {
				return 2;
			}
			
			if ((speed-5) >= 61 && (speed-5) <= 80) {
				return 1;
			}
			
			if ((speed-5) <= 60) {
				return 0;
			}
			
		}

		if (speed <= 60) {
			return 0;
		}

		if (speed >= 61 && speed <= 80) {
			return 1;
		}

		return 2;
	}

/*	Given 2 ints, a and b, return their sum. However, sums in the range 10..19 
 * inclusive, are forbidden, so in that case just return 20.


sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21*/

	public int sortaSum(int a, int b) {
		
		if ((a + b) >= 10 && (a + b) <= 19) {
			return 20;
		}
		
		return a+b;
		  
	}


/*Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a 
boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. 
Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". 
Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".


alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"*/

	public String alarmClock(int day, boolean vacation) {
		
		if (vacation) {
			if (day >= 1 && day <= 5) {
				return "10:00";
			}
			if (day == 0 || day == 6) {
				return "off";
			}
			
		}
		
		if (day >= 1 && day <= 5) {
			return "7:00";
		}
		
		return "10:00";
		  
	}

	

/*The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. 
Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.


love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true*/
	
	public boolean love6(int a, int b) {

		if (a == 6 || b == 6) {
			return true;
		}

		if ((a+b) == 6 || Math.abs((a-b)) == 6) {
			return true;
		}
		return false; 
	}
	

/*Return true if the given non-negative number is 1 or 2 more than a multiple of 20. 
See also: Introduction to Mod


more20(20) → false
more20(21) → true
more20(22) → true*/

	
	public boolean more20(int n) {
		if (n % 20 == 1 || n % 20 == 2) {
			return true;
		}

		return false;
	}
	
/*Given a number n, return true if n is in the range 1..10, inclusive.
Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.


			in1To10(5, false) → true
			in1To10(11, false) → false
			in1To10(11, true) → true*/
	
	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode) {
			if (n <= 1 || n >= 10) {
				return true;
			}

		}
		

		if ((n >= 1 && n <= 10) && !outsideMode) {
			return true;
		}

		return false;

	}

/*	Return true if the given non-negative number is a multiple of 3 or 5, but not both. 
 * Use the % "mod" operator -- see Introduction to Mod


	old35(3) → true
	old35(10) → true
	old35(15) → false
	*/
	public boolean old35(int n) {
		if ((n % 3 == 0)) {
			if ((n % 5 == 0)) {
				return false;
			}
			return true;
		}

		if ((n % 5 == 0)) {
			return true;
		}
		return false;
	}


/*Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod


less20(18) → true
less20(19) → true
less20(20) → false*/
	
	public boolean less20(int n) {
		int rest = n % 20;
		if (rest >= 18 && rest <= 22) {
			return true;
		}
		return false;
	}


/*Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod


nearTen(12) → true
nearTen(17) → false
nearTen(19) → true*/

	public boolean nearTen(int num) {
		int rest = num % 10;
		if (rest <=2  || rest >=8) {
			return true;
		}
		return false;
	}


/*Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. 
So if either value is a teen, just return 19.


teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19*/

	public int teenSum(int a, int b) {
		if (a >= 13 && a <= 19) {
			return 19;
		}
		
		if (b >= 13 && b <= 19) {
			return 19;
		}
		return a+b;
	}

	

/*Your cell phone rings. Return true if you should answer it. 
Normally you answer, except in the morning you only answer if it is your mom calling. 
In all cases, if you are asleep, you do not answer.


answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false*/
	
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			return false;
		}
		
		if (isMorning) {
			if (isMom) {
				return true;
			}else return false;
		}
		
		return true;
	}

	

/*We are having a party with amounts of tea and candy. 
Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. 
However, if either tea or candy is at least double the amount of the other one, the party is great (2). 
However, in all cases, if either tea or candy is less than 5, the party is always bad (0).


teaParty(6, 8) → 1
teaParty(3, 8) → 0
teaParty(20, 6) → 2*/
	
	public int teaParty(int tea, int candy) {
		int candyD = candy *2;
		int teaD = tea * 2;
		
		if (candy < 5 || tea < 5) {
			return 0;
		}
		
		if (candyD <= tea || teaD <= candy) {
			return 2;
		}

		  
//		  if (candy >= 5 && tea >= 5) {
//			return 1;
//		}
		
		return 1;
	}

/*Given a string str, if the string starts with "f" return "Fizz". 
If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". 
In all other cases, return the string unchanged. (See also: FizzBuzz Code)


			fizzString("fig") → "Fizz"
			fizzString("dib") → "Buzz"
			fizzString("fib") → "FizzBuzz"*/
	
	public String fizzString(String str) {
		if (str.startsWith("f")) {
			if (str.endsWith("b")) {
				return "FizzBuzz";
			}else return "Fizz";
		}

		if (str.endsWith("b")) {
			return "Buzz";
		}

		return str;
	}

	
/*
Given an int n, return the string form of the number followed by "!". 
So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, 
and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". 
Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. 
What will the remainder be when one number divides evenly into another? (See also: FizzBuzz Code and Introduction to Mod)


fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"*/
	
	public String fizzString2(int n) {

		if (n % 3 == 0) {
			if (n% 5 == 0) {
				return "FizzBuzz!";
			}else return "Fizz!";
		}

		if (n% 5 == 0) {
			return "Buzz!";
		}
		return n + "!";
	}


/*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false*/
	
	public boolean twoAsOne(int a, int b, int c) {

		if ((a + b) == c) {
			return true;
		}

		if ((a + c) == b) {
			return true;
		}

		if ((b + c) == a) {
			return true;
		}

		return false;
	}

/*Given three ints, a b c, return true if b is greater than a, and c is greater than b. 
However, with the exception that if "bOk" is true, b does not need to be greater than a.


			inOrder(1, 2, 4, false) → true
			inOrder(1, 2, 1, false) → false
			inOrder(1, 1, 2, true) → true*/
	
	public boolean inOrder(int a, int b, int c, boolean bOk) {

		if (bOk) {
			if (b < c) {
				return true;
			}
		}

		if (a < b && b < c) {
			return true;
		}
		return false;
	}
	
/*Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


			lastDigit(23, 19, 13) → true
			lastDigit(23, 19, 12) → false
			lastDigit(23, 19, 3) → true*/

	public boolean lastDigit(int a, int b, int c) {
		return (a%10 == b%10 || a%10 == c%10 || b%10 == c%10);
	}

/*Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


			lessBy10(1, 7, 11) → true
			lessBy10(1, 7, 10) → false
			lessBy10(11, 1, 7) → true*/
	
	public boolean lessBy10(int a, int b, int c) {
		return (a-b >= 10 || b-c >= 10 || a-c >= 10);
	}
	
/*	Return the sum of two 6-sided dice rolls, each in the range 1..6. 
	However, if noDoubles is true, if the two dice show the same value, increment one die to the next value,
	wrapping around to 1 if its value was 6.


	withoutDoubles(2, 3, true) → 5
	withoutDoubles(3, 3, true) → 7
	withoutDoubles(3, 3, false) → 6*/

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		
		if (noDoubles) {	
			if (die1 == die2) {
				if (die1 == 6) {
					return 1 + die2;
				}else return die1 + die2 + 1;
			}
		}
		return die1 + die2;
	}
	

/*Given three ints, a b c, return true if they are in strict increasing order,
such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.


inOrderEqual(2, 5, 11, false) → true
inOrderEqual(5, 7, 6, false) → false
inOrderEqual(5, 5, 7, true) → true*/

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (equalOk) {
			if (a <= b && b <= c) {
				return true;
			}

		}


		if (a < b && b < c) {
			return true;
		}
		
		return false;
	}
	
	

/*Given two int values, return whichever value is larger. 
However if the two values have the same remainder when divided by 5, then the return the smaller value. 
However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.


maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3*/
	
	public int maxMod5(int a, int b) {
		if (a == b) {
			return 0;
		}
		
		if (a%5 == b%5) {
			if (a<b) {
				return a;
			}else return b;
		}
		
		if (a>b) {
			return a;
		}
		
		return b;
	}


/*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. 
If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5.
Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.


redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5*/
	
	public int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c== 2) {
			return 10;
		}

		if (a == b &&  b == c) {
			return 5;
		}

		if (a != b && a!= c) {
			return 1;
		}
		return 0;
	}


/*You have a green lottery ticket, with ints a, b, and c on it. 
If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. 
If two of the numbers are the same, the result is 10.


greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
*/
	public int greenTicket(int a, int b, int c) {
		if (a != b && b != c && c!= a) {
			return 0;
		}

		if (a == b &&  b == c) {
			return 20;
		}

		if (a == b || b == c || a == c) {
			return 10;
		}
		return 0;

	}
	
/*	You have a blue lottery ticket, with ints a, b, and c on it. 
	This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. 
	If any pair sums to exactly 10, the result is 10. 
	Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.


	blueTicket(9, 1, 0) → 10
	blueTicket(9, 2, 0) → 0
	blueTicket(6, 1, 4) → 10*/
	
	public int blueTicket(int a, int b, int c) {
		if (a + b == 10 || b + c == 10 || c+a == 10) {
			return 10;
		}

		if ((a + b)  == (b + c + 10) || (a + b) == (c+a+10)) {
			return 5;
		}	

		return 0;
	}
	
/*Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, 
such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)


			shareDigit(12, 23) → true
			shareDigit(12, 43) → false
			shareDigit(12, 44) → false*/
	
	public boolean shareDigit(int a, int b) {

		int al = a / 10;
		int ar = a % 10;
		int bl = b / 10;
		int br = b % 10;

		return al == bl || al == br || ar == bl || ar == br;
	}

/*Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. 
If the sum has more digits than a, just return a without b. 
(Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)


			sumLimit(2, 3) → 5
			sumLimit(8, 3) → 8
			sumLimit(8, 1) → 9*/
	
	public int sumLimit(int a, int b) {
		if (String.valueOf(a+b).length() > String.valueOf(a).length()) {
			return a;
		}
		return a+b;
	}


/*We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod


specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false*/

	public boolean specialEleven(int n) {
		if (n % 11 == 0 || (n - 1) % 11 == 0) {
			return true;
		}
		return false;
	}
	




}
