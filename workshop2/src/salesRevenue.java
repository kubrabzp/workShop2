public class salesRevenue {
    public static void main(String[] args) {
        //1-) Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi
        // olarak tutan ve toplam satış gelirini hesaplayan bir algoritma yazınız

        int[] dailySales = {2,5,3};
        String[] productName = {"phone", "pc", "tablet" };
        float[] productPrice = {40000,50000,3500.50f};

        double total = 0;
        for(int i=0; i<dailySales.length; i++){
            double sales=0;
            sales = productPrice[i]*dailySales[i];
            System.out.println("Sales revenue of " + productName[i] + ": " + sales);
            total += sales;
        }
        System.out.println("Total sales revenue of the store: " + total);
    }
}