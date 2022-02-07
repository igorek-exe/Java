/**написать метод, принимающий на вход 2 целых числа, который делает их суммирование и складывает
результат с произведением этих двух чисел, и возвращает полученный результат из метода. Вывести
полученный результат на экран.**/
package Method2hchisel;
import java.util.Scanner;
public class Metod {
 public static int sumproizvedenie(int x1, int y1){
        int sum = x1 + y1;
        int proizved = x1 * y1;
        return sum + proizved;}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please x=");
        int x = in.nextInt();
        System.out.print("Please y=");
        int y = in.nextInt();
        System.out.println("sum= "+(x+y)+" proizvedenie="+x*y);
        System.out.println("rezultmetod="+sumproizvedenie(x,y));
        }

}



