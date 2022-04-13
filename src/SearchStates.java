import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SearchStates {

    public static final  int listSize = 50;
    private States[] stateList;
    int numStates = 0;
    private String key;

    public SearchStates(String key) {
        stateList = new States[listSize];
        this.key = key;
        this.ReadFile();
        this.Search(key);
    }

    public void ReadFile(){
        System.out.println("reading wordlist ...");
        System.out.println();
        Scanner scan = null;

        String name;
        String capital;
        String nickname;
        String population;

        try {
            scan = new Scanner(new File("States.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found. ");
        }

        while (scan.hasNextLine()){
            name = scan.nextLine();
            capital = scan.nextLine();
            nickname = scan.nextLine();
            population = scan.nextLine();

            States a = new States(name, capital, nickname, population);
            stateList [numStates] = a;
            numStates++;
        }
    }
        public void Search(String key){

            int left = 0;
            int right = listSize ;
            int midpoint;
            while( left <= right){
                 midpoint = (left + right)/2;
                if (stateList[midpoint].getName().equals(key))
                    System.out.println(stateList[midpoint].toString());
                else if ((stateList[midpoint].getName().compareTo(key)) < 0)
                    left = midpoint +1;
                else
                    right = midpoint -1;
            }
        }


}
