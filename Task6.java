package Tasks.Level_3;

public class Task6 {
    static int arr1[],arr2[];
    static int x,y;
    static int k;
    static int index1,index2=0;
    static void mas(int dlina1,int dlina2){
        arr1= new int[dlina1];
        arr2= new int[dlina2];
    }
    static void zapoln(int chislo){
        int dlina1=arr1.length,dlina2=arr2.length;
        if(index1!=dlina1){arr1[index1]= chislo;}
        if(index1==dlina1){
            arr2[index2]=chislo;
            index2++;
        }else{index1++;}
        if(index1==dlina1&&index2==dlina2){
            index1=0;
            index2=0;
        }
    }
    static void delete1(int i){ arr1[i]=0; }
    static void delete2(int i){ arr2[i]=0; }
    static void kolvonulei(int mas[],int mas1[]){
        for (int i = 0; i <mas.length ; i++) {
            if (mas[i]==0){
                x++;
            }
        }
        for (int i = 0; i <mas1.length ; i++) {
            if(mas1[i]==0){y++;}
        }
        System.out.println(mas.length-x==mas1.length-y);
    }
    static void same(){
        int dlina1=arr1.length,dlina2=arr2.length;
        k=1;
        if(dlina1!=1){
            for (int i = 0; i <dlina1 ; i++) {
                for (int l = k; l <dlina1 ; l++) {
                    if(arr1[i]==arr1[l]){
                      delete1(l);
                    }
                }
                k++;
            }
        }
        k=1;
        if(dlina2!=1){
            for (int i = 0; i <dlina2 ; i++) {
                for (int l = k; l <dlina2 ; l++) {
                    if(arr2[i]==arr2[l]){
                      delete2(l);
                    }
                }
                k++;
            }
        }
        kolvonulei(arr1,arr2);
        x=0;
        y=0;
    }
    public static void main(String[] args) {
        mas(5,3);
        zapoln(1);
        zapoln(3);
        zapoln(4);
        zapoln(4);
        zapoln(4);
        zapoln(2);
        zapoln(5);
        zapoln(7);
        same();


        mas(4,4);
        zapoln(9);
        zapoln(8);
        zapoln(7);
        zapoln(6);
        zapoln(4);
        zapoln(4);
        zapoln(3);
        zapoln(1);
        same();
        mas(1,5);
        zapoln(2);
        zapoln(3);
        zapoln(3);
        zapoln(3);
        zapoln(3);
        zapoln(3);
        same();
    }
}

