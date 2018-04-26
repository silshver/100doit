package Optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 파일명	 	: 자바7과 자바8의 정의방식.
 * 설명		: 자바7의 Collections의 리스트값 정의와 자바8의 간소화된 정의 방식의 비교입니다. 
 * @author 100doit
 *
 */


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
        // FuncionalInterface인 Comparator의 comparing을 사용하여 덤벨의 무게를 받아온다.
        dumbbellList.sort(Comparator.comparing(Dumbbell::getWeight));

        for ( Dumbbell dumbbell : dumbbellList ) {
            System.out.println(dumbbell.toString());
        }
    }
}

/*
 * 결과 값
java7vsjava8.Dumbbell{name = '스파이더', weight = 5}
java7vsjava8.Dumbbell{name = '나이키', weight = 10}
java7vsjava8.Dumbbell{name = '아디다스', weight = 15}
 */