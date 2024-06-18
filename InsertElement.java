public class InsertElement{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6};
        int element = 4;
        int position = 3;
        System.out.println("Original array:");
        printArray(array);
        int[] newArray = insertElement(array, element, position);        
        System.out.println("Array after insertion:");
        printArray(newArray);
    }
     public static int[] insertElement(int[] array, int element, int position) {
        if (position < 0 || position > array.length) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        newArray[position] = element;
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        
        return newArray;
    }
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
