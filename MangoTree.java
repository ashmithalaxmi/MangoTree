import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int tree = scanner.nextInt();
        if(tree <= column || tree%column == 1 || tree%column==0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}