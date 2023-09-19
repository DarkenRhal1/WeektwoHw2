package calc;

public class Market {
    public static void main(String[] args) {


        Fruit appleDrink = new Apple();
        appleDrink.calories = 95;
        ((Apple)appleDrink).make(95);

        Fruit bananaDrink = new Banana();
        bananaDrink.calories = 105;
        ((Banana)bananaDrink).makke(105);

        bananaDrink.makeJuice();
        System.out.println(((Banana)bananaDrink).makke(105) + " calories");
        appleDrink.makeJuice();
        System.out.println(((Apple)appleDrink).make(95) + " calories");
    }
}
