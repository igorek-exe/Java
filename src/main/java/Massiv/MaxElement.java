package Massiv;

/**
 *Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного
 * типа. Найдите максимальный элемент и выведите его индекс на экран.
 */

public class MaxElement {
    public static void main(String[] args) {
        int[] massive =new int[10];
        int max=0;
        for(int i=0; i< massive.length; i++){
            if ((i+1)%2==0){
                massive[i]=12+i;
            }else {massive[i]=i*5;}
            if(massive[i]>max){max=i;}
            System.out.print("\t"+massive[i]);
            }System.out.print("\nИиндекс максимального элемента ="+max);
    }
}
