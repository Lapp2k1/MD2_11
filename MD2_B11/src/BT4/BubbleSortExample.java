package BT4;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortExample {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();


        numberList.add(64);
        numberList.add(34);
        numberList.add(25);
        numberList.add(12);
        numberList.add(22);
        numberList.add(11);
        numberList.add(90);

        System.out.println("Danh sách ban đầu: " + numberList);


        int n = numberList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numberList.get(j) > numberList.get(j + 1)) {
                    // Hoán đổi các phần tử
                    int temp = numberList.get(j);
                    numberList.set(j, numberList.get(j + 1));
                    numberList.set(j + 1, temp);
                }
            }
        }


        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + numberList);
    }
}
