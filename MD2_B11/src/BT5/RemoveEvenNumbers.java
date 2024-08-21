package BT5;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        // Bước 1: Tạo một danh sách chứa các số nguyên
        List<Integer> numberList = new ArrayList<>();

        // Bước 2: Thêm các phần tử vào danh sách
        numberList.add(10);
        numberList.add(21);
        numberList.add(32);
        numberList.add(43);
        numberList.add(54);
        numberList.add(65);

        System.out.println("Danh sách ban đầu: " + numberList);

        // Bước 3: Tạo danh sách mới để lưu những số nguyên không chia hết cho 2
        List<Integer> newList = new ArrayList<>();

        // Bước 4: Duyệt danh sách ban đầu và gán những số không chia hết cho 2 vào danh sách mới
        for (Integer number : numberList) {
            if (number % 2 != 0) {
                newList.add(number);
            }
        }

        // Hiển thị danh sách mới sau khi xóa các số chẵn
        System.out.println("Danh sách sau khi xóa các số chẵn: " + newList);
    }
}
