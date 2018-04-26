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
		/*
		 * ofNullable(); : null이나 null이 아닌 값 모두 받아올 수 있는 함수입니다. nullpointException이 발생하지 않습니다.
		 * 여기에서 이 함수를 사용한 이유는  주석처리된 코드를 사용할 경우, null값만 반환하여 null값을 받을 경우를 보여 주기 위해서 사용하였습니다. 
		 */
		Optional<List<Dumbbell>> dumbbellListOptional = Optional.ofNullable(dumbbellList);	
		/*
		 * ifPresent(); : 이 함수는 값이 있을 경우에만 값을 받아오는 함수입니다. null이 올 경우 무시하고 다음을 진행합니다.
		 */
		dumbbellListOptional.ifPresent(dumbbells -> {												
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

/*
 * 결과 값 : value
----- [ 카테고리(1)의 덤벨 목록 조회 ] ----
java7vsjava8.Dumbbell{name = '덤벨-10kg', weight = 10}
java7vsjava8.Dumbbell{name = '덤벨-3kg', weight = 3}
java7vsjava8.Dumbbell{name = '덤벨-7kg', weight = 7}
java7vsjava8.Dumbbell{name = '덤벨-5kg', weight = 5}
----- [ 카테고리(1)의 필터 결과 목록 조회 ] ----
java7vsjava8.Dumbbell{name = '덤벨-10kg', weight = 10}
java7vsjava8.Dumbbell{name = '덤벨-7kg', weight = 7}
 */

/*
 * 결과 값 : null
----- [ 카테고리(1)의 덤벨 목록 조회 ] ----
조회 결과가 없음!
 */

