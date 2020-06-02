package Tasks.Level_4;

public class Task3 {
    static void toCamelCase(String stroka){
        int n,n1;
        String strokanew;
        n=stroka.indexOf("_");//индекс _
        n1=n+2;
        String vichet = stroka.substring(n,n1);//подстрока которую мы будем менять
        String vichetnew=vichet.replace("_","");//то на что мы будем менять
        String vichetnewnew=vichetnew.toUpperCase(); // делаем букву после _ заглавной
        strokanew=stroka.replace(vichet,vichetnewnew);//меняем
        n=strokanew.indexOf("_");
        if(n>0){toCamelCase(strokanew);}else{System.out.println(strokanew);}
    }
    static void toSnakeCase (String stroka){
        int x=stroka.length();
        char[]mas =new char[stroka.length()];
        String stroka1;
        String stroka2;
        for (int i = 1; i <x ; i++) {
            stroka1=stroka.charAt(i)+"";
            if(stroka1!=stroka1.toLowerCase()){
                stroka1=stroka.charAt(i-1)+"_"+stroka1.toLowerCase();
                stroka2=stroka.charAt(i-1)+""+stroka.charAt(i);
                stroka=stroka.replace(stroka2,stroka1);
            }
        }
        for (int i = 0; i <x ; i++) {
            stroka1=stroka.charAt(i)+"";
            if(stroka1!=stroka1.toLowerCase()){toSnakeCase(stroka);}
        }
        System.out.println(stroka);
    }
    public static void main(String[] args){
        toCamelCase("hello_edabit");
        toSnakeCase("helloEdabit");
        toCamelCase("is_modal_open"); 
        toSnakeCase("getColor");
    }
}
