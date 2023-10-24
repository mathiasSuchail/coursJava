public class StaticExperimentation {
    private static String name;
    private String personalName;

    static {
        name = "NOM COMMUN";
    }

    public StaticExperimentation(String personalName){
        this.personalName = personalName;
    }
    public static int getDoubleNameNumberOfLetters(){
        return name.length()*2;
    }
    public int getTriplePersonalNameNumberOfLetters(){
        return this.personalName.length()*3;
    }
}
