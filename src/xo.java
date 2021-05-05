import java.util.Arrays;
import java.util.Scanner;

public class xo {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int[][] Board = new int[4][4];

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print(Board[j][i]);
            }
            System.out.println();
        }// this prints out the board

        System.out.println("Player no1");
        System.out.println("Enter the x position of where you want to put your piece");
        int xPosition = in.nextInt();
        System.out.println("Enter the y position of where you want to put your piece");
        int yPosition = in.nextInt();
        Board[xPosition][yPosition] = 1;
        for (int q = 1; q < 4; q++) {
            for (int u = 1; u < 4; u++) {
                System.out.print(Board[u][q]);
            }
            System.out.println();
        }
        System.out.println("___________");


        int num = 0;
        while (num < 8) {
            for (int b = 2; b > 0; b--) {
                System.out.println("Player no" + b);
                System.out.println("Enter the x position of where you want to put your piece");
                xPosition = in.nextInt();
                System.out.println("Enter the y position of where you want to put your piece");
                yPosition = in.nextInt();
                if (Board[xPosition][yPosition] == 0) { //makes sure no one placed a piece there
                    if (b == 1)
                        Board[xPosition][yPosition] = 1;
                    else
                        Board[xPosition][yPosition] = 2;
                    for (int q = 1; q < 4; q++) {
                        for (int u = 1; u < 4; u++) {
                            System.out.print(Board[u][q]);
                        }
                        System.out.println();
                    }
                    System.out.println("___________");

                } else {  //in a case that someone already placed a piece there it will redo his turn
                    System.out.println("Someone already put a piece here, try again \n________");
                    num--;
                    b++;
                }
                num++;

            } //for b closer

            if (((Board[1][1] == 1) && (Board[1][2] == 1) && (Board[1][3] == 1)) ||
                    ((Board[2][1] == 1) && (Board[2][2] == 1) && (Board[2][3] == 1)) ||
                    ((Board[3][1] == 1) && (Board[3][2] == 1) && (Board[3][3] == 1)) ||
                    ((Board[1][1] == 1) && (Board[2][1] == 1) && (Board[3][1] == 1)) ||
                    ((Board[1][2] == 1) && (Board[2][2] == 1) && (Board[3][2] == 1)) ||
                    ((Board[1][3] == 1) && (Board[2][3] == 1) && (Board[3][3] == 1)) ||
                    ((Board[1][1] == 1) && (Board[2][2] == 1) && (Board[3][3] == 1)) ||
                    ((Board[1][3] == 1) && (Board[2][2] == 1) && (Board[3][1] == 1))) {
                System.out.println("Player no1 won!!!!");
                break;
            }
            if (((Board[1][1] == 2) && (Board[1][2] == 2) && (Board[1][3] == 2)) ||
                    ((Board[2][1] == 2) && (Board[2][2] == 2) && (Board[2][3] == 2)) ||
                    ((Board[3][1] == 2) && (Board[3][2] == 2) && (Board[3][3] == 2)) ||
                    ((Board[1][1] == 2) && (Board[2][1] == 2) && (Board[3][1] == 2)) ||
                    ((Board[1][2] == 2) && (Board[2][2] == 2) && (Board[3][2] == 2)) ||
                    ((Board[1][3] == 2) && (Board[2][3] == 2) && (Board[3][3] == 2)) ||
                    ((Board[1][1] == 2) && (Board[2][2] == 2) && (Board[3][3] == 2)) ||
                    ((Board[1][3] == 2) && (Board[2][2] == 2) && (Board[3][1] == 2))) {
                System.out.println("Player no2 won!!!!");
                break;
            }

        } //while closer
        if (num == 8)
            System.out.println("Tie game");
    } //void main closer
}// Main closer
