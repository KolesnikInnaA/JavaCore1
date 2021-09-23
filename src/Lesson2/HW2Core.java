package Lesson2;

public class HW2Core {

    public static void main(String[] args) {
        String[][] arr = new String[5][5];
        myArraySize(new String[][]{{"1","2", "3", "d", "5"},{"1","2", "3", "d", "5"},{"1","2", "3", "d", "5"},{"1","2", "3", "d", "5"}});
    }
    public static void myArraySize (String[][] array) {
        String[][] tempArr = new String[4][4];
        tempArr = array;
        int temp;
        temp = Integer.parseInt(array[3][3]);
        System.out.println(temp);

    }
}
    //1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    //3. В методе main() вызвать полученный метод, обработать возможные исключения
    // MyArraySizeException и MyArrayDataException и вывести результат расчета.




