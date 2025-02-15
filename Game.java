import java.util.ArrayList;
import java.util.List;

public class Game{
    //private int bar;
    private List<Integer> prob8 = new ArrayList<>();
    private List<Integer> prob7 = new ArrayList<>();
    private List<Integer> prob6 = new ArrayList<>();
    private List<Integer> prob5 = new ArrayList<>();
    private List<Integer> prob4 = new ArrayList<>();
    private List<Integer> prob3 = new ArrayList<>();
    private List<Integer> prob2 = new ArrayList<>();

    //private int outcome;
    private int coup8 = 0;
    private int coup7 = 0;
    private int coup6 = 0;
    private int coup5 = 0;
    private int coup4 = 0;
    private int coup3 = 0;
    private int coup2 = 0;
    


    
    public Game (){  
        for (int i = 4; i > 0; i--){
            prob8.add(4);
        }
    
        for (int r = 4; r > 0; r--){
            prob8.add(5);
        }
        for (int i = 4; i > 0; i--){
            prob7.add(4);
        }
    
        for (int r = 4; r > 0; r--){
            prob7.add(5);
        }

        for (int i = 4; i > 0; i--){
            prob6.add(4);
        }
    
        for (int r = 4; r > 0; r--){
            prob6.add(5);
        }

        for (int i = 4; i > 0; i--){
            prob5.add(4);
        }
    
        for (int r = 4; r > 0; r--){
            prob5.add(5);
        }

        for (int i = 4; i > 0; i--){
            prob4.add(4);
        }
    
        for (int r = 4; r > 0; r--){
            prob4.add(5);
        }

        for (int i = 4; i > 0; i--){
            prob3.add(4);
        }
    
        for (int r = 4; r > 0; r--){
            prob3.add(5);
        }

        for (int i = 4; i > 0; i--){
            prob2.add(4);
        }
    
        for (int r = 4; r > 0; r--){
            prob2.add(5);
        }
    
    
    
    }



public int play(int a){
        
        if (a == 8) {
            coup8 = prob8.get((int)(Math.random()*prob8.size()));
            if (coup8 == 4 ){
                return 1;

            }
            else if (coup8 == 5 ){
                return 2;
            }
        }
        if (a == 7) {
            coup7 = prob7.get((int)(Math.random()*prob7.size()));
            if (coup7 == 4 ){
                return 1;

            }
            else if (coup7 == 5 ){
                return 2;
            }
        }
        if (a == 6) {
            coup6 = prob6.get((int)(Math.random()*prob6.size()));
            if (coup6 == 4 ){
                return 1;

            }
            else if (coup6 == 5 ){
                return 2;
            }
        }
        if (a == 5) {
            coup5 = prob5.get((int)(Math.random()*prob5.size()));
            if (coup5 == 4 ){
                return 1;

            }
            else if (coup5 == 5 ){
                return 2;
            }
        }
        if (a == 4) {
            coup4 = prob4.get((int)(Math.random()*prob4.size()));
            if (coup4 == 4 ){
                return 1;

            }
            else if (coup4 == 5 ){
                return 2;
            }
        }
        if (a == 3) {
            coup3 = prob3.get((int)(Math.random()*prob3.size()));
            if (coup3 == 4 ){
                return 1;

            }
            else if (coup3 == 5 ){
                return 2;
            }
        }
        if (a == 2) {
            coup2 = prob2.get((int)(Math.random()*prob2.size()));
            if (coup2 == 4 ){
                return 1;

            }
            else if (coup2 == 5 ){
                return 2;
            }
        }

        if (a == 1) {
            return 1;
        }
  
        
        return 0;
    }


    public void setLoss(){
        
            if (coup8 != 0){
                prob8.remove(Integer.valueOf(coup8));
                coup8 = 0;
            }
            if (coup7 != 0){
                prob7.remove(Integer.valueOf(coup7));
                coup7 = 0;
            }
            if (coup6 != 0){
                prob6.remove(Integer.valueOf(coup6));
                coup6 = 0;
            }
            if (coup5 != 0){
                prob5.remove(Integer.valueOf(coup5));
                coup5 = 0;
            }
            if (coup4 != 0){
                prob4.remove(Integer.valueOf(coup4));
                coup4 = 0;
            }
            if (coup3 != 0){
                prob3.remove(Integer.valueOf(coup3));
                coup3 = 0;
            }
            if (coup2 != 0){
                prob2.remove(Integer.valueOf(coup2));
                coup2 = 0;
            }
    }

    public void setWin(){
        if (coup8 != 0){
            prob8.add(Integer.valueOf(coup8));
            coup8 = 0;
        }
        if (coup7 != 0){
            prob7.add(Integer.valueOf(coup7));
            coup7 = 0;
        }
        if (coup6 != 0){
            prob6.add(Integer.valueOf(coup6));
            coup6 = 0;
        }
        if (coup5 != 0){
            prob5.add(Integer.valueOf(coup5));
            coup5 = 0;
        }
        if (coup4 != 0){
            prob4.add(Integer.valueOf(coup4));
            coup4 = 0;
        }
        if (coup3 != 0){
            prob3.add(Integer.valueOf(coup3));
            coup3 = 0;
        }
        if (coup2 != 0){
            prob2.add(Integer.valueOf(coup2));
            coup2 = 0;
        }
        
    }
    
    /*public void setOutcome(int a){
        if (a>= 0 && a<= 1){
        outcome = a;
    }
}
    */
    public String list(){
        return " coup 8 is " + prob8 + "\ncoup 6 is " + prob6 + "\ncoup 5 is " + prob5 ;
    }

}