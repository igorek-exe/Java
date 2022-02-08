
package program;
/**Прямоугольное отверстие размерами a и b (целые числа), можно ли его полностью закрыть круглой
 *картонкой радиусом r(целое число) **/

public class OtverstieZakritoeKrugloyKartonkoy {
 public static boolean pifagor (int a,int b,int r) {
     int c, a1,b1;
     a1 = (int) Math.pow(a, 2);
     b1 = (int) Math.pow(b, 2);
     c = (int) Math.sqrt((a1 + b1));
     if (c <= (r+r)) return true;// idea подсказала сделать проще "return c<=r"
     else return false;
 }

    public static void main(String [] Args){
    int a=12;
    int b=12;
    int r=32;
    System.out.println("Можно ли закрыть круглой картонкой радиусом r="+r+" " +
            "\nПрямоугольное отверстие размерами a="+a+" и b="+b+" Ответ:"+pifagor(a,b,r));
 }
 }


