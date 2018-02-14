import java.util.Scanner;

public class BattleShip {

    public static void main(String [] args){

        System.out.println("****Welcome to Battle Ships game****");
        String[][] sea = new String[10][10];
        showEmptySea(sea);

        deployPlayerShips(sea);
    }

    public static void showEmptySea(String [][] sea){
        System.out.println("Right now, the sea is empty.");
        System.out.print("   ");
        for (int x=0;x<10;x++){
            System.out.print(x);
        }
        System.out.println("");
        for (int y=0;y<sea.length;y++){
            System.out.print(y+" |");
            for (int x=0;x<sea[y].length;x++){
                System.out.print(" ");
            }
            System.out.println("| "+y);
        }
        System.out.print("   ");
        for (int x=0;x<10;x++){
            System.out.print(x);
        }
        System.out.println("");
    }

    public static void deployPlayerShips(String [][] sea){
        Scanner input = new Scanner(System.in); //This line creates a Scanner for use

        for (int ship=1;ship<6;ship++) {
            //ask player to enter their ship's coordinates
            System.out.print("Enter X coordinate for your"+ship +". ship: ");
            int x = input.nextInt();
            System.out.print("Enter Y coordinate for your"+ship +". ship: ");
            int y = input.nextInt();

            if (sea[x][y]=="@"){
                System.out.println("The coordinate already occupied. Please choose another location.");
                ship--;
            } else if (x>10||y>10||x<0||y<0) {
                System.out.println("The coordinates are outside the grid location.");
                ship--;
            }
            else {
                sea[x][y]="@";
            }

        }
    }
}
