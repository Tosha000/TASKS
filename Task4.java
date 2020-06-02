package Tasks.Level_4;

public class Task4 {
    static void overTime(double q, double w, double e, double r){
        double zarplata=0;
        if(w<=17){ zarplata=(w-q)*e; }
        if(w>17&&q<17){zarplata=(17-q)*e+(w-17)*e*r;}
        if(w>17&&q>=17){zarplata=(w-17)*e*r;}
        System.out.println("$"+Math.floor(zarplata));
    }
    public static void main(String[] args){
        overTime(9,17,30,1.5);
        overTime(16,18,30,1.8);
        overTime(13.25,15,30,1.5);
    }
}
