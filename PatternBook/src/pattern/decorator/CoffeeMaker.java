package pattern.decorator;

/**
 *
 * @author ramudu
 */
public class CoffeeMaker {

    public static void main(String[] args) {
        orderCaramelEspresso();
        orderCinnamonEspresso();
        orderChocolateCaramelEspresso();

    }

    private static void orderCinnamonEspresso() {
        FlavouredCoffee fCoffee = new CinnamonCoffee(new Espresso());
        System.out.println("Ordered : " + fCoffee.getDescription());
        System.out.println("Cost : " + fCoffee.getCost());

    }

    private static void orderCaramelEspresso() {
        FlavouredCoffee fCoffee = new CarmelCoffee(new Espresso());
        System.out.println("Ordered : " + fCoffee.getDescription());
        System.out.println("Cost : " + fCoffee.getCost());

    }

    private static void orderChocolateCaramelEspresso() {
        FlavouredCoffee fCoffee = new ChocolateCoffee(new CarmelCoffee(new Espresso()));
        System.out.println("Ordered : " + fCoffee.getDescription());
        System.out.println("Cost : " + fCoffee.getCost());

    }

}
