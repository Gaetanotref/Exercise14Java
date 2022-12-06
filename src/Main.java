public class Main {
    public static void main(String[] args){
        String mySurname="Trefiletti";
        String isContained = mySurname.contains("ni") ? mySurname +" contain the sequence ni" : mySurname + " don't contain the sequence ni";
        System.out.println(isContained);
    }
}