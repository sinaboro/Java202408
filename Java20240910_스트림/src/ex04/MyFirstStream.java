package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MyFirstStream {

	public static void main(String[] args) {
		
		List<ToyPriceInfo> list = new ArrayList<ToyPriceInfo>();
		
		list.add(new ToyPriceInfo("GUN", 2000));
		list.add(new ToyPriceInfo("CAR", 5000));
		list.add(new ToyPriceInfo("TEDDy", 3000));
		list.add(new ToyPriceInfo("SHIP", 7000));
		
		//가격 합 출력
		int sum = list.stream()
				.mapToInt(price->price.getPrice())
				.sum();
		System.out.println(sum);
		
		
		//가격 5000이상만 출력
		int total = list.stream()
					.filter(price-> price.getPrice()>=5000)
					.mapToInt(price->price.getPrice())
					.sum();
		
		System.out.println(total);
		
		
		
		
	}

}
