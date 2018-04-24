package StreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 파일명	 	: Stream API
 * 설명		: Stream API의 선언과 각 메소드의 사용 방법에 대한 예제입니다.
 * @author 100doit
 *
 */


public class Streamapi {
	public static void main(String[] args) {
		
		/*
		 * getStream
		 */
		Arrays.asList(1,2,3).stream(); // (1)
		Arrays.asList(1,2,3).parallelStream(); // (2)
		
		/*
		 * foreach
		 */
		Arrays.asList(1,2,3).stream()
							.forEach(System.out::println); // 1,2,3
		
		
		/*
		 * map
		 */
		Arrays.asList(1,2,3).stream()
							.map(i -> i*i)
							.forEach(System.out::println); // 1,4,9
		
		/*
		 * limit
		 */
		Arrays.asList(1,2,3).stream()
							.limit(1)
							.forEach(System.out::println); // 1
		
		/*
		 * skip
		 */
		Arrays.asList(1,2,3).stream()
							.skip(1)
							.forEach(System.out::println); // 2,3
		
		/*
		 * filter
		 */
		Arrays.asList(1,2,3).stream()
							.filter(i-> 2>=i)
							.forEach(System.out::println); // 1,2
		
		/*
		 * flatMap
		 */
		Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4,5),Arrays.asList(6,7,8,9)).stream()
							.flatMap(i -> i.stream())
							.forEach(System.out::println); // 1,2,3,4,5,6,7,8,9
		
		/*
		 * reduce
		 */
		Arrays.asList(1,2,3).stream()
							.reduce((a,b)-> a-b)
							.get(); // -4
		
		/*
		 * collection
		 */
		Arrays.asList(1,2,3).stream()
							.collect(Collectors.toList());
		Arrays.asList(1,2,3).stream()
							.iterator();
	}

}
