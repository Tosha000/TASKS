package Tasks.Level_4;

public class Task10 {
    static void countUniqueBooks(String stringSequence, String bookEnd){
        int y=stringSequence.length(),a = 0,s=0,d=0;
        String x=stringSequence.substring(y-1,y),bla,bla1,bla2;
        if(bookEnd.equals(x)==true){
            for (int i = 0,j=1;j<y; i++,j++) {
                bla=stringSequence.substring(i,j);
                if(bookEnd.equals(bla)==true){
                    for (int k = i+1,l=j+1;bookEnd.equals(stringSequence.substring(k,l))==false; k++,l++) {
                        bla1=stringSequence.substring(k,l);
                        a++;
                        bla2=stringSequence.substring(i+1,j+1);
                        if(bla2.equals(bla1)==true){s++;}
                    }
                    s--;
                    System.out.print("a:"+a+"  ");
                    System.out.print("s:"+s+"  ");
                    a=0;
                    s=0;
                }
            }
        }
        System.out.println("");
    }

    public static void main(String[] args){
        countUniqueBooks("AZYWABBCATTTA","A");
        countUniqueBooks("$AA$BBCATT$C$$B$","$");
        countUniqueBooks("ZZABCDE","Z");
        countUniqueBooks("urhftfjvofjvitdjndofcndtfijvnefcincidsddddhhtouyyt","t");
    }
}

