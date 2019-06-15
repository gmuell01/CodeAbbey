import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maze {

    private int[][] maze;
    private int height;
    private int width;
    private int posx;
    private int posy;
    //private ArrayList<ArrayList<Integer>> maze

    public Maze(String filepath) {
        try {
            File file = new File("C:\\Development\\pop2-jutge\\MazePath\\src\\MazeInput.txt");
            Scanner sc = new Scanner(file);
            String in = sc.nextLine();
            String[] ina = in.split(" ");
            height = Integer.parseInt(ina[1]);
            width = Integer.parseInt(ina[0]);
            maze = new int[height][width];
            int count = 0;
            while (sc.hasNextLine()){

                String line = sc.nextLine();
                for (int i = 0; i < width; i++){
                    maze[count][i] = Integer.parseInt(Character.toString(line.charAt(i)));
                }
                //System.out.println(Arrays.toString(maze[count]));
                count++;
            }
            posx = width - 1;
            posy = 0;
            printMaze();
        }

        catch (FileNotFoundException ex){
        }
    }

    public void printMaze(){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if (i == posy && j == posx){
                    System.out.print("#");
                } else {
                    System.out.print(maze[i][j]);
                }
            }
            System.out.println();
        }
    }

    public boolean move(char direction){

        boolean legal = true;
        switch (direction){
            case 'w':
                if (posy == 0 || maze[posy - 1][posx] == 0){
                    legal = false;
                } else {
                    this.posy -= 1;
                }
                break;
            case 's':
                if (posy == height - 1 || maze[posy + 1][posx] == 0){
                    legal = false;
                } else {
                    this.posy += 1;
                }
                break;
            case 'a':
                if (posx == 0 || maze[posy][posx - 1]==0){
                    legal = false;
                } else {
                    this.posx -= 1;
                }
                break;
            case 'd':
                if (posx == width - 1 || maze[posy][posx + 1]==0){
                    legal = false;
                } else {
                    this.posx += 1;
                }
                break;
        }

        return legal;
    }




}
