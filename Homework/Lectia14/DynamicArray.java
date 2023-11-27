import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

    String[] array = new String[5];

    int size = 0;

    public void add(String val) {
         if(size >= array.length) {
             upSize();
         }

         array[size] = val;

         size++;
    }

    public String get(int index) {
        return array[index];
    }

    public boolean remove(int index) {
        if (index > array.length -1 || index < 0) {
            return false;
        }

        for (int i = index; i < size-2; i++) {
            array[index] = array[index + 1];
        }

        size--;

        return true;
    }

    public void upSize() {
        String[] array2 = new String[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        array = array2;
    }

    public int size() {
        int couter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                couter++;
            }
        }
        size = couter;
        return couter;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(String val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                return true;
            }
        }

        return false;
    }
    
    public void clear() {
        String[] array2 = new String[array.length];
        array = array2;
    }

    public int indexOf(String str) {
        for (int i = 0; i < size; i++) {
            if (array[i] == str)
                return i;
        }

        return -1;
    }
    
    public List toArrayList() {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < size; i++) {
            list.add(array[i]);
        }

        return list;
    }

}
