package BT6;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(4);
        numberList.add(1);
        numberList.add(5);
        numberList.add(3);

        System.out.println("Danh sách ban đầu: " + numberList);


        List<Integer> uniqueList = new ArrayList<>();


        for (Integer number : numberList) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }


        System.out.println("Danh sách sau khi xóa các phần tử trùng lặp: " + uniqueList);
    }
}
