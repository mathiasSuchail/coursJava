import java.util.Scanner;

public class Exercice {
    public void Exercice(){

    }
    public void doExercices(){
/*
        //Exo 1
        System.out.println("Exo 1 : ");
        this.exo1(new int[] {1, 3, 6, 7});
        System.out.println();
*/
/*
        //Exo2
        System.out.println("Exo 2 : ");
        this.exo2();
        System.out.println();
*/
/*
        //Exo3
        System.out.println("Exo 3 : ");
        this.exo3(new char[] {'a', 'b', 'c', 'x'}, new int[] {1, 2, 3});
        System.out.println();
*/
/*
        //Exo4
        System.out.println("Exo 4 : ");
        this.exo4("mot1 mot2 mot3");
        System.out.println();
*/
/*
        //Exo5
        System.out.println("Exo 5 : ");
        this.exo5(new String[] {"il était une foi", "la vie"}, '*');
        System.out.println();
*/
        //Exo6
        System.out.println("Exo 6 : ");
        this.exo6();
        System.out.println();

    }

    private void exo1(int[] serie){
        int sum=0;
        double avg;
        for(int number: serie){
            sum+=number;
        }
        avg= (double) sum /serie.length;
        System.out.println("Sommes : "+sum);
        System.out.println("avg : "+avg);
    }
    private void exo2(){
        int[] numberList = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Nombre "+(i+1)+" :");
            numberList[i] = scanner.nextInt();
        }
        exo1(numberList);
    }

    private void exo3(char[] charTab, int[] intTab){
        Utils utils = new Utils(charTab, intTab);
        System.out.println("lettre max : "+utils.returnGreaterLetter());
        System.out.println("int max : "+utils.returnMaxInt());
        System.out.println("int min :"+utils.returnMinInt());
        System.out.println("contient un X : "+utils.containX());
    }

    private void exo4(String text){
        String[] split = text.split(" ");
        String revert="";
        for(String word: split){
            revert = word.concat(" ").concat(revert);
        }
        System.out.println(revert);
    }
    private void exo5(String [] tab, char separator){
        System.out.println(StringManager.tabToString(tab, separator));
    }

    private void exo6(){
        System.out.println(StaticExperimentation.getDoubleNameNumberOfLetters());
        System.out.println(new StaticExperimentation("Mathias").getTriplePersonalNameNumberOfLetters());
    }


}