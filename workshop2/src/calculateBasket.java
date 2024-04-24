import java.util.Scanner;

public class calculateBasket {
    public static void main(String[] args) {
        //  Kullanıcının seçtiği ürünleri, fiyatlarını ve sepete eklenen
        //  miktarları bir dizi ile tutan algoritma yazınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many product will you add: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        String[] products = new String[number];
        Float[] prices = new Float[number];
        Integer[] quantity = new Integer[number];



        for (int i = 0; i < products.length; i++) {

            System.out.print((i + 1) + ".product name: ");
            products[i] = scanner.next();

            System.out.print((i + 1) + ".product price: ");
            prices[i] = scanner.nextFloat();

            System.out.print((i + 1) + ".product quantity: ");
            quantity[i] = scanner.nextInt();
        }

        System.out.println("\n" + "Products in the basket;");
        for (int j=0; j<products.length;j++) {
            System.out.println("product name:" + products[j] +
                    "  product price:" + prices[j] + "  product quantity:" + quantity[j]);
        }
    }
}



