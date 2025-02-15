import java.util.Scanner;

public class ai_file{

    public static int add(int what) {
        what += 1;
        return what;
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("what do you want?");
        int bar = input.nextInt();  
        bar = add(bar);
        System.out.println("hello world" + bar);
        Dog d = new Dog(bar);
        d.addOne();
        System.out.println(d);
    }
    
}