package BT7;


public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(1, 4);

        System.out.println("Danh sách sau khi thêm: " + myList.get(0) + ", " + myList.get(1) + ", " + myList.get(2) + ", " + myList.get(3));

        myList.remove(2);
        System.out.println("Danh sách sau khi xóa phần tử tại index 2: " + myList.get(0) + ", " + myList.get(1) + ", " + myList.get(2));

        System.out.println("Danh sách có chứa phần tử 4: " + myList.contains(4));
        System.out.println("Vị trí của phần tử 4: " + myList.indexOf(4));

        MyList<Integer> clonedList = myList;
        System.out.println("Danh sách sau khi sao chép: " + clonedList.get(0) + ", " + clonedList.get(1) + ", " + clonedList.get(2));

        myList.clear();
        System.out.println("Danh sách sau khi xóa hết phần tử: " + myList.size());
    }
}
