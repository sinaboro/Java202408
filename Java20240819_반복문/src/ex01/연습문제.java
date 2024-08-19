package ex01;

public class 연습문제 {

	public static void main(String[] args) {
		
		//int 형 배열 참조변수 nArr설정
		int[] nArr = new int[5];

		
		//배열 초기화 -> 값 범위는 1~100 => 랜덤함수 이용해서
		for(int i=0; i<nArr.length; ++i)
			nArr[i] = (int)(Math.random()*100)+1;
		
		for(int i=0; i<nArr.length; i++)
			System.out.print(nArr[i] + ", ");
		
		//최대값 & 최소값 구하기
		int max, min;
		max = min = nArr[0];
		for(int i=0; i<nArr.length; i++) {
			if(max < nArr[i]) max = nArr[i];
			
			if(min> nArr[i]) min = nArr[i];
		}
		System.out.printf("\n최대값 : %d, 최소값: %d\n", max,min);
		
		//총점 & 평균
		int sum = 0;
		double avg = 0;
		for(int i=0; i<nArr.length; i++) 
			sum += nArr[i]; //sum = sum + nArr[i]
		
		//System.out.println(nArr.length);
		avg = (double)sum/nArr.length;  //55.44 ->55 -> 55.0
		
		System.out.printf("총점 : %d, 평균: %.2f\n", sum, avg);
		
//		System.out.println(nArr[0]);
//		System.out.println(nArr[1]);
//		System.out.println(nArr[2]);
//		System.out.println(nArr[3]);
//		System.out.println(nArr[4]);
//		System.out.println(nArr[5]); ArrayIndexOutOfBoundsException
		
		//오름차순 정렬(이중 for)
		for(int i=0; i<nArr.length; i++) {//1~5회전
			for(int j=0; j<nArr.length-1; j++) { //j -> 0~3
				if(nArr[j] > nArr[j+1]) {
					int tmp = nArr[j];
					nArr[j] = nArr[j+1];
					nArr[j+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<nArr.length; i++)
			System.out.print(nArr[i] + ", ");
		
	}

}













