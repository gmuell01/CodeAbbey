import java.util.HashMap;
import java.util.Scanner;

public class MazeFinder {

    public static void main(String[] args){
        Maze m = new Maze(" ");
        Scanner sc = new Scanner(System.in);

        String in;
        while(true){
            in = sc.next("[wasd]");
            m.move(in.charAt(0));
            m.printMaze();
        }




        //
        //m.move('r');
        //m.printMaze();
        //m.move('r');
        //m.printMaze();








    }



}
