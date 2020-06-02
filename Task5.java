package Tasks.Level_1;

import static java.lang.Math.abs;
public class Task5 {
    static void operation(int N, int a, int b){
        int sum = a+b;
        int raz= abs(a-b);
        int proz = a*b;
        int del = a/b;
        if(N==sum){
            System.out.println("Нужно суммировать");
        }else if(N==raz){
            System.out.println("Нужно вычитать");
        } else if(N==proz){
            System.out.println("Нужно умножать");
        } else if(N==del){
            System.out.println("Нужно делить");
        } else {
            System.out.println("none");
        }
    }
    public static void main(String[] args){
        operation(24,15,9);
        operation(24,26,2);
        operation(15,11,11);
    }
}
