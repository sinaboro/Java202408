package ex05;

import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
		
		String data = "홍길동&이수홍,박연수";
		
		String[] arr = data.split("&|,");
		
		System.out.println(data);
		
		for(String str : arr)
			System.out.println(str);
				
		System.out.println();
		
		String data2 = "홍길동&이수홍|박연수";
		
		StringTokenizer st = new StringTokenizer(data2, "/&|");
		
		while(st.hasMoreElements()) {
			String str = st.nextToken();
			System.out.println(str);
		}

		
		
	}

}
