public class StringManager {
    public StringManager(){

    }

    public static String tabToString(String[] tab, char separator){
        String result="";
        for(int i=0; i<tab.length; i++){
            result = result.concat(tab[i]);
            if(i<tab.length-1){
                result += separator;
            }
        }
        return result;
    }

}
