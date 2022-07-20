import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class stuff {
    public static void main(String[] args) throws FileNotFoundException {
        File fr = new File("./resources/SplashScreen_1.txt");
        Scanner sc = new Scanner(fr);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }
}
