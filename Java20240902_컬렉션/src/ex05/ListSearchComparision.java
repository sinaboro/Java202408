package ex05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class ListSearchComparision {

	public static void main(String[] args) {
		
		// 리스트에 저장할 요소 수
        int size = 10_000_000; // 10 million
        int iterations = 1000; // 검색 반복 횟수
        
        // ArrayList와 LinkedList 생성
        List<Integer> arrayList = new ArrayList<>(size);
        List<Integer> linkedList = new Vector<>();
        
        // 난수 생성기
        Random random = new Random();
        
        // ArrayList와 LinkedList에 랜덤한 정수 추가
        for (int i = 0; i < size; i++) {
            int value = random.nextInt();
            arrayList.add(value);
            linkedList.add(value);
        }
        
        // ArrayList 검색 테스트
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int index = size / 2; // 중간 인덱스 검색
            arrayList.get(index);
        }
        long endTime = System.nanoTime();
        long arrayListDuration = endTime - startTime;
        
        // LinkedList 검색 테스트
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int index = size / 2; // 중간 인덱스 검색
            linkedList.get(index);
        }
        endTime = System.nanoTime();
        long linkedListDuration = endTime - startTime;
        
        // 결과 출력
        System.out.println("ArrayList 검색 시간: " + 
        		arrayListDuration + " ns");
        System.out.println("LinkedList 검색 시간: " + 
        		linkedListDuration + " ns");
	}

}
