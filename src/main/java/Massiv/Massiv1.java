package Massiv;
/**
 * Создайте переменную для массива из 10 элементов, заполните его произвольными значениями целочисленного типа
 * и выведите последний элемент массива на экран.
 */
public class Massiv1 {

    public static void main(String[] Args) {
        int[] massive = new int[10];
        int last=massive[0];
        for(int i=0; i<massive.length;i++){
            massive[i]=i+23;
            last=massive[i];
            System.out.print(massive[i]+" ");
        }System.out.println("\nПоследний элемент массива это "+last);
            }
    }



