import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {
        // pour tester, lancer en ligne de commande :
        // java Program "assiette" "couscous" "coca" "moyen" "baba" "normal" "yes"
        // Note: Make sure the class name matches the file name when compiling and
        // running in Java.
        if (args[0] == null || args[1] == null || args[0].isEmpty() || args[1].isEmpty())
            System.out.println("Prix à payer : -1€");
        
        App app = new App();
        Menu menu = new Menu(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
        int price = app.Compute(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
        System.out.println("Prix à payer : " + price + "€");
    }
}
