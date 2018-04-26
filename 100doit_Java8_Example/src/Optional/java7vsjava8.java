package Optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ���ϸ�	 	: �ڹ�7�� �ڹ�8�� ���ǹ��.
 * ����		: �ڹ�7�� Collections�� ����Ʈ�� ���ǿ� �ڹ�8�� ����ȭ�� ���� ����� ���Դϴ�. 
 * @author 100doit
 *
 */


public class java7vsjava8 {

    public static void main(String[] args) {

        List<Dumbbell> dumbbellList = new ArrayList<>();
        dumbbellList.add(new Dumbbell.Builder().setName("����Ű").setWeight(10).build());
        dumbbellList.add(new Dumbbell.Builder().setName("�Ƶ�ٽ�").setWeight(15).build());
        dumbbellList.add(new Dumbbell.Builder().setName("�����̴�").setWeight(5).build());

        // ���� ����Ʈ �� �� ����
        Collections.sort(dumbbellList, new Comparator<Dumbbell>() {
            public int compare(Dumbbell d1, Dumbbell d2) {
                return d1.getWeight().compareTo(d2.getWeight());
            }
        });

        // java8 ����Ʈ �� �� ����
        // FuncionalInterface�� Comparator�� comparing�� ����Ͽ� ������ ���Ը� �޾ƿ´�.
        dumbbellList.sort(Comparator.comparing(Dumbbell::getWeight));

        for ( Dumbbell dumbbell : dumbbellList ) {
            System.out.println(dumbbell.toString());
        }
    }
}

/*
 * ��� ��
java7vsjava8.Dumbbell{name = '�����̴�', weight = 5}
java7vsjava8.Dumbbell{name = '����Ű', weight = 10}
java7vsjava8.Dumbbell{name = '�Ƶ�ٽ�', weight = 15}
 */