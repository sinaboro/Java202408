package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		
		int[] nArr = {1,2,3,4,5};
		
		nArr[3] = 30;
		for(int i=0; i<nArr.length; i++)
			System.out.print(nArr[i] + ", ");
		
		System.out.println();
		
		String str1 = "korea";  //변경불가 객체 imputable
		String str2 = new String("801020-2079145");
		
		Scanner sc = new Scanner(System.in);
		
		char ch = str1.charAt(4);
		System.out.println(ch);
		
		char ch2 = str2.charAt(7);
		String s = (ch2 == '1') ? "남" : "여";
		
		System.out.println(s);
		
		int len = str1.length();
		System.out.println("len : " + len);
		
		String oldStr = "java programing";
		//               0123456789    
		String newStr = oldStr.replace("java", "Spring");
		
		System.out.println(newStr);
		System.out.println(oldStr);
		
		String sub1 = oldStr.substring(3);
		System.out.println(sub1);
			
		
		String sub2 = oldStr.substring(5,9);
		System.out.println(sub2);
		
		
		int len2 = oldStr.indexOf("java");
		System.out.println(len2);
		
		String board = "국어,영어,수학,컴퓨터";
		
		String[] sArr = board.split(",");
		
		for(int i=0; i<sArr.length; i++)
			System.out.println(sArr[i]);
		
		String phone = "010-3380-6423";
		
		String[] phone2 = phone.split("-");
		for(int i=0; i<phone2.length; i++)
			System.out.println(phone2[i]);
		
		String str3 = "com";
		String str4 = "com";		
		System.out.println(str3 == str4);
		
		String str5 = new String("com");
		String str6 = new String("com");
		System.out.println(str5 == str6);
		
		
		boolean  b = str3.equals(str4);
		System.out.println(b);
		
		boolean b2 = str5.equals(str6);
		System.out.println(b2);
		
		//String oldStr = "java programing";
		System.out.println( oldStr.startsWith("Spring") );
		
		String str7 = "     Java Spring    ";
		System.out.println(str7.length());
		
		String str8 =str7.trim();
		System.out.print(str8);
		System.out.println(str7);
		
		System.out.println(str8.toUpperCase());
		System.out.println(str8.toLowerCase());
		
	}

}









