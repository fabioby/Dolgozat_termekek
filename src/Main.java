import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Add meg az elérési utat");
        Scanner input = new Scanner(System.in);
        String eleres = input.nextLine();
        Vegyesbolt.bevasarlok(eleres);
        Vegyesbolt.mivanakosaramban();
    }
}
