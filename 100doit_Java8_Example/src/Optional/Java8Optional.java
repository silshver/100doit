package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Java8 - Optional Example
 *
 * @author Kayla
 * @since 2017-04-09
 */
public class Java8Optional {
	public static void main(String[] args) {

		Long categoryId = 1L;
		int limitWeightCondition = 5;

		// List<Dumbbell> dumbbellList = findByCategoryIdNull(categoryId);
		List<Dumbbell> dumbbellList = findByCategoryId(categoryId);
		Optional<List<Dumbbell>> dumbbellListOptional = Optional.ofNullable(dumbbellList);
		dumbbellListOptional.ifPresent(dumbbells -> {
				System.out.println("----- [ ī�װ�(" + categoryId + ")�� ���� ��� ��� ��ȸ ] ----");
				dumbbells
					.stream()
					.filter(dumbbell -> dumbbell.getWeight() > limitWeightCondition)
					.collect(Collectors.toList())
					.forEach(System.out::println);
			}
		);
	}

	public static List<Dumbbell> findByCategoryId(Long categoryId) {

		System.out.println("----- [ ī�װ�(" + categoryId + ")�� ���� ��� ��ȸ ] ----");
		List<Dumbbell> dumbbellList = new ArrayList<>();

		dumbbellList.add(new Dumbbell.Builder().setName("����-10kg").setWeight(10).build());
		dumbbellList.add(new Dumbbell.Builder().setName("����-3kg").setWeight(3).build());
		dumbbellList.add(new Dumbbell.Builder().setName("����-7kg").setWeight(7).build());
		dumbbellList.add(new Dumbbell.Builder().setName("����-5kg").setWeight(5).build());

		dumbbellList.forEach(System.out::println);

		return dumbbellList;
	}

	public static List<Dumbbell> findByCategoryIdNull(Long categoryId) {
		System.out.println("----- [ ī�װ�(" + categoryId + ")�� ���� ��� ��ȸ ] ----");
		System.out.println("��ȸ ����� ����!");
		return null;
	}
}