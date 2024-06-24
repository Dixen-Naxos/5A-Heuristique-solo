public class Menu {
    public enum Size {
        petit,
        moyen,
        grand
    }

    public enum Beverage {
        coca,
        pepsi,
        eau
    }

    public enum Course {
        assiette,
        sandwich
    }

    public enum Dessert {
        normal,
        special
    }

    public enum DessertSize {
        baba,
        jsp
    }

    public enum Coffee {
        yes,
        no
    }

    Course menuType;
    Beverage beverage;
    Size size;
    Dessert dessert;
    DessertSize dessertSize;
    Coffee coffee;

    private boolean isValidMenuType(String menuType) {
        return menuType != null && Course.valueOf(menuType) != null;
    }

    private boolean isValidCourse(String course) {
        return course != null && Course.valueOf(course) != null;
    }

    private boolean isValidSize(String size) {
        return size != null && Size.valueOf(size) != null;
    }

    private boolean isValidDessert(String dessert) {
        return dessert != null && Dessert.valueOf(dessert) != null;
    }

    private boolean isValidDessertSize(String dessertSize) {
        return dessertSize != null && DessertSize.valueOf(dessertSize) != null;
    }

    private boolean isValidCoffee(String coffee) {
        return coffee != null && Coffee.valueOf(coffee) != null;
    }

    public Menu(String type, String name, String beverage, String size, String dessert, String dsize,
            String coffee) {
        if (isValidMenuType(type) && isValidCourse(name) && isValidSize(beverage) && isValidDessert(size)
                && isValidDessertSize(dsize) && isValidCoffee(coffee)) {
            this.menuType = Course.valueOf(type);
            this.beverage = Beverage.valueOf(beverage);
            this.size = Size.valueOf(size);
            this.dessert = Dessert.valueOf(dessert);
            this.dessertSize = DessertSize.valueOf(dsize);
            this.coffee = Coffee.valueOf(coffee);
        }

        switch(menuType){
            case Course.assiette:
        }

    }

    private int computeSmall() {
        int total = 2;
        // dans ce cas, on applique la formule standard
        if (dsize.equals("normal")) {
            // pas de formule
            // on ajoute le prix du dessert normal
            total += 2;
        } else {
            // sinon on rajoute le prix du dessert special
            total += 4;
        }
        return total
    }

    private int computePlate(String name, String beverage, String size, String dessert, String dsize, String coffee) {
        int total = 15;
        // ainsi qu'une boisson de taille:
        if (size.equals("petit")) {
            total += 2;
            // dans ce cas, on applique la formule standard
            if (dsize.equals("normal")) {
                // pas de formule
                // on ajoute le prix du dessert normal
                total += 2;
            } else {
                // sinon on rajoute le prix du dessert special
                total += 4;
            }

            // si on prends moyen
        } else if (size.equals("moyen")) {

            total += 3;
            // dans ce cas, on applique la formule standard
            if (dsize.equals("normal")) {
                // j'affiche la formule appliquée
                System.out.print("Prix Formule Standard appliquée ");
                // le prix de la formule est donc 18
                total = 18;
            } else {
                // sinon on rajoute le prix du dessert special
                total += 4;
            }

        } else if (size.equals("grand")) {
            total += 4;
            // dans ce cas, on applique la formule standard
            if (dsize.equals("normal")) {
                // pas de formule
                // on ajoute le prix du dessert normal
                total += 2;
            } else {
                // dans ce cas on a la fomule max
                System.out.print("Prix Formule Max appliquée ");
                total = 21;
            }

        }
        return total;
    }

    private int computeSandwich(String name, String beverage, String size, String dessert, String dsize,
            String coffee) {
        int total = 10;
        // ainsi qu'une boisson de taille:
        if (size == "petit") {

            // si on prends moyen
        } else if (size == "moyen") {
            total += 3;
            // dans ce cas, on applique la formule standard
            if (dsize.equals("normal")) {
                // j'affiche la formule appliquée
                System.out.print("Prix Formule Standard appliquée ");
                // le prix de la formule est donc 13
                total = 13;
            } else {
                // sinon on rajoute le prix du dessert special
                total += 4;
            }

        } else if (size == "grand") {
            total += 4;
            // dans ce cas, on applique la formule standard
            if (dsize.equals("normal")) {
                // pas de formule
                // on ajoute le prix du dessert normal
                total += 2;
            } else {
                // dans ce cas on a la fomule max
                System.out.print("Prix Formule Max appliquée ");
                total = 16;
            }

        }
        return total;
    }

    public int ComputeV2(String type, String name, String beverage, String size, String dessert, String dsize,
            String coffee) {
        // prix total à payer pour le client
        int total = 0;
        // si le client prends un plat en assiette
        if (type.equals("assiette")) {
            total += computePlate(name, beverage, size, dessert, dsize, coffee);
        }
        // mode sandwich
        else {
            total += computeSandwich(name, beverage, size, dessert, dsize, coffee);
        }
        if (type.equals("assiette") && size.equals("moyen") && dsize.equals("normal") && coffee.equals("yes")) {
            System.out.print(" avec café offert!");
        } else {
            // Assume coffee costs 1 unit, adding to the total only if coffee is not
            // included
            if (!coffee.equals("yes")) {
                total += 1;
            }
        }
        return total;
    }
}
