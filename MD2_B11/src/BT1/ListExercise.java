package BT1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 100));
        }


        System.out.println("Danh sách ban đầu: " + list1);


        int maxElement = Collections.max(list1);
        System.out.println("Phần tử lớn nhất: " + maxElement);


        Collections.reverse(list1);
        System.out.println("Danh sách sau khi đảo ngược: " + list1);


        Collections.sort(list1);
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + list1);


        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add((int) (Math.random() * 100));
        }
        System.out.println("Danh sách 2: " + list2);


        list1.addAll(list2);
        System.out.println("Danh sách 1 sau khi sao chép từ danh sách 2: " + list1);
    }
}
