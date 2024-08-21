package BT7;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    // Constructor mặc định với dung lượng mặc định
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Constructor với dung lượng khởi tạo tùy chỉnh
    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity phải lớn hơn 0");
        }
    }

    // Phương thức tăng dung lượng của mảng nếu cần thiết
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            Object newElements[] = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    // Thêm phần tử vào vị trí index
    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    // Xóa phần tử tại vị trí index và trả về phần tử đó
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        E removedElement = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return removedElement;
    }

    // Trả về số phần tử trong danh sách
    public int size() {
        return size;
    }

    // Tạo một bản sao của danh sách
    public E clone() {
        try {
            MyList<E> cloned = (MyList<E>) super.clone();
            cloned.elements = new Object[size];
            System.arraycopy(elements, 0, cloned.elements, 0, size);
            return (E) cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone không được hỗ trợ", e);
        }
    }

    // Kiểm tra xem danh sách có chứa phần tử không
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    // Trả về vị trí đầu tiên của phần tử trong danh sách, -1 nếu không tồn tại
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    // Thêm phần tử vào cuối danh sách
    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    // Lấy phần tử tại vị trí i
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + size);
        }
        return (E) elements[i];
    }

    // Xóa tất cả các phần tử trong danh sách
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
