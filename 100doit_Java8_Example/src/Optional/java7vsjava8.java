package Optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class java7vsjava8 {

    public static void main(String[] args) {

        List<Dumbbell> dumbbellList = new ArrayList<>();
        dumbbellList.add(new Dumbbell.Builder().setName("나이키").setWeight(10).build());
        dumbbellList.add(new Dumbbell.Builder().setName("아디다스").setWeight(15).build());
        dumbbellList.add(new Dumbbell.Builder().setName("스파이더").setWeight(5).build());

        // 기존 리스트 값 비교 정렬
        Collections.sort(dumbbellList, new Comparator<Dumbbell>() {
            public int compare(Dumbbell d1, Dumbbell d2) {
                return d1.getWeight().compareTo(d2.getWeight());
            }
        });

        // java8 리스트 값 비교 정렬
        dumbbellList.sort(Comparator.comparing(Dumbbell::getWeight));

        for ( Dumbbell dumbbell : dumbbellList ) {
            System.out.println(dumbbell.toString());
        }
    }
}