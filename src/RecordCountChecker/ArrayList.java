package RecordCountChecker;

public class ArrayList {
    private String[] array;
    private int size;

    public int size(){
        return size;
    }

    public void ArrayList() {
        array = new String[1];
        size = 0;
    }

    public void add (String element) {
        while (size == array.length) {
            String[] newarray = new String[array.length +1];
            System.arraycopy(array, 0, newarray, 0, array.length);
            //copying elements from array to newarray starting from index 0
            array = newarray;
        }
        array[size] = element;
        size++;
    }

    public String get (int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public void sort(){
        for (int i=0; i <array.length - 1;i++){
            for (int j = i+1; j <array.length; j++){
                if (array[i].compareTo(array[j])>0){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public boolean contains(String element) {
        for (String s : array) {
            if (s.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
