package Massiv;

/**
 * Создайте переменную для массива из 10 элементов другим способом,
 * заполните его произвольными значениями целочисленного типа и выведите на экран
 * элементы , стоящие на четных позициях.
 */
public class Massiv2 {
    public static void main(String[] args) {
        int [] massiv={1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<massiv.length; i++){
            if ((i+1)%2==0){
                System.out.println(massiv[i]);
            }

            }
        }
    }

