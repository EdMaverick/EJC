package ex12;

public class Starter {

    public static void main(String[] args) {
        Item[] purchasedItems = new Item[]{
                new Item("laptop", 750.00, 3),
                new Item("cucumber", 2.00, 5)};
        Basket userBasket = new Basket(purchasedItems);
        User user = new User("login", "password", userBasket);

        Category category1 = new Category("first", purchasedItems);
        Category category2 = new Category("second", purchasedItems);
    }
}
