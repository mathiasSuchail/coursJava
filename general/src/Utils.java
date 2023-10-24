public class Utils {
    private final char[] charTab;
    private final int[] intTab;

    public Utils(char[] charTab, int[] intTab){
        this.charTab=charTab;
        this.intTab=intTab;
    };

    public char returnGreaterLetter(){
        char greaterLetter='a';
        for(char letter: this.charTab){
            if(letter>greaterLetter) greaterLetter = letter;
        }
        return greaterLetter;
    }
    public int returnMaxInt(){
        int maxInt=0;
        for(int number: this.intTab){
            if(number>maxInt) maxInt=number;
        }
        return maxInt;
    }
    public int returnMinInt(){
        int minInt=returnMaxInt();
        for(int number: this.intTab){
            if(number<minInt) minInt=number;
        }
        return minInt;
    }

    public boolean containX(){
        for(char letter: this.charTab){
            if (letter=='x') return true;
        }
        return false;
    }


}