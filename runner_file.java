import java.util.Scanner;

public class runner_file{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int bars = 8;
        int game;
        Game g = new Game();
        int z = 800;
        int y = 4;
        //double count = 0;
        //double count2 = 0;

        while (z >= 0)
        {

            System.out.println("Start of the game\n\n\n");

            while (bars >= 1)
            {
                System.out.println("What do you want to play, Omar?");
                game = g.play(bars);

                while((game < 1 || game > 2) && y > 0)
                {
                    System.out.println("You can't play that \n Play again");
                   game = g.play(bars);
                   y--;
                }
                bars -= game;
                System.out.println("There are " + bars + " left." );

                if (bars == 1)
                {
                    System.out.println("Omar you have won");
                    g.setWin();
                    //count++;
                    break;
                }
                if (bars <= 0)
                {
                    System.out.println("Yemeli you have won");
                
                    g.setLoss();
                    break;
                }

                System.out.println("What do you want to play, Yemeli?");
                game = (int)(Math.random()*2 +1);                 //input.nextInt();

                while(game < 1 || game > 2)
                {
                    System.out.println("You can't play that \n Play again");
                    game = (int)(Math.random()*2 +1);                 //input.nextInt();
                }
                bars -= game;
                System.out.println("There are " + bars + "left." );

                if (bars == 1)
                {
                    System.out.println("Yemeli you have won");
                   g.setLoss(); 
                   break;
                
                }

                else if (bars <= 0)
                {
                    System.out.println("Omar you have won");
                    //count++;
                    break;
                }
                
            }
            //count2++;
            System.out.println("Game Ended!");
            z--;
            bars = 8;
            
            System.out.println(g.list());
            //System.out.println("machine won " + (count  /count2)  +" times for " + count2 + " games.");
            

        }

        System.out.println("Start of the game\n\n\n");

            while (bars >= 1)
            {
                System.out.println("What do you want to play, Omar?");
                game = g.play(bars);

                while((game < 1 || game > 2) && y > 0)
                {
                    System.out.println("You can't play that \n Play again");
                   game = g.play(bars);
                   y--;
                }
                bars -= game;
                System.out.println("There are " + bars + " left." );

                if (bars == 1)
                {
                    System.out.println("Omar you have won");
                    g.setWin();
                    //count++;
                    break;
                }
                if (bars <= 0)
                {
                    System.out.println("Yemeli you have won");
                
                    g.setLoss();
                    break;
                }

                System.out.println("What do you want to play, Yemeli?");
                game = input.nextInt(); //(int)(Math.random()*2 +1);

                while(game < 1 || game > 2)
                {
                    System.out.println("You can't play that \n Play again");
                    game = input.nextInt(); //(int)(Math.random()*2 +1);
                }
                bars -= game;
                System.out.println("There are " + bars + "left." );

                if (bars == 1)
                {
                    System.out.println("Yemeli you have won");
                   g.setLoss(); 
                   break;
                
                }

                else if (bars <= 0)
                {
                    System.out.println("Omar you have won");
                    
                }
                
            }
            System.out.println("Game Ended!");
            
    }
}