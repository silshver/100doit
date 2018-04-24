package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 파일명	 	: Java8의 Optional 예제
 * 설명		: main함수에서 ofnullable() 메소드로 null과 value값을 모두 받아들인후, ifPresent()로 value값만 뽑아서 출력하는 형태의 예제입니다.
 * @author 100doit
 *
 */


public class Java8Optional {
	public static void main(String[] args) {

		Long categoryId = 1L;
		int limitWeightCondition = 5;

		//List<Dumbbell> dumbbellList = findByCategoryIdNull(categoryId);
		List<Dumbbell> dumbbellList = findByCategoryId(categoryId);	
		Optional<List<Dumbbell>> dumbbellListOptional = Optional.ofNullable(dumbbellList);			//ofNullable();
		dumbbellListOptional.ifPresent(dumbbells -> {												//ifPresent();
				System.out.println("----- [ 카테고리(" + categoryId + ")의 필터 결과 목록 조회 ] ----");
				dumbbells
					.stream()
					.filter(dumbbell -> dumbbell.getWeight() > limitWeightCondition)
					.collect(Collectors.toList())
					.forEach(System.out::println);
			}
		);
	}

	public static List<Dumbbell> findByCategoryId(Long categoryId) {

		System.out.println("----- [ 카테고리(" + categoryId + ")의 덤벨 목록 조회 ] ----");
		List<Dumbbell> dumbbellList = new ArrayList<>();

		dumbbellList.add(new Dumbbell.Builder().setName("덤벨-10kg").setWeight(10).build());
		dumbbellList.add(new Dumbbell.Builder().setName("덤벨-3kg").setWeight(3).build());
		dumbbellList.add(new Dumbbell.Builder().setName("덤벨-7kg").setWeight(7).build());
		dumbbellList.add(new Dumbbell.Builder().setName("덤벨-5kg").setWeight(5).build());

		dumbbellList.forEach(System.out::println);

		return dumbbellList;
	}

	public static List<Dumbbell> findByCategoryIdNull(Long categoryId) {
		System.out.println("----- [ 카테고리(" + categoryId + ")의 덤벨 목록 조회 ] ----");
		System.out.println("조회 결과가 없음!");
		return null;
	}
}