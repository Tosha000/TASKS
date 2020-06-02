package Tasks.Level_2;

public class Task24 {
    static int g ;
    static int[] mas;
    static void method( int dlina){
        mas = new int[dlina];
    }
    static void massiv( int chislo) {
        mas[g]=chislo;
        g++;
        if (g==mas.length){
            for (int i = 1; i <mas.length; i++) {
                mas[i]=mas[i-1]+mas[i];
            }
        }
    }
    static void cumulativeSum(int dlina,int chislo1,int chislo2,int chislo3){
        method(dlina);
        massiv(chislo1);
        massiv(chislo2);
        massiv(chislo3);
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
            System.out.print(" ");
        }
    }
    static void cumulativeSum(int dlina,int chislo1,int chislo2,int chislo3,int chislo4,int chislo5,int chislo6){
        method(dlina);
        massiv(chislo1);
        massiv(chislo2);
        massiv(chislo3);
        massiv(chislo4);
        massiv(chislo5);
        massiv(chislo6);
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
            System.out.print(" ");
        }
    }
    public static void main(String [] args){
        cumulativeSum(3,1,2,3);
        method(0);
        g=0;
        System.out.println("");
        cumulativeSum(3,1,-2,3);
        method(0);
        g=0;
        System.out.println("");
        cumulativeSum(6,3,3,-2,408,3,3);
    }
}
