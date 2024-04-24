public class Restaurant {
    public static void main(String[] args) {
        // 2-) Restoranın menüsündeki yemekleri, fiyatlarını ve popülerlik
        // derecelendirmelerini bir dizi ile tutan algoritma yazınız.

        String[] foods = {"etliekmek" , "hamburger", "pizza"};
        float[] pricesFoods = {140, 300, 250};
        float[] popularity = {4.5f, 4.3f, 4.2f};

        for(int i=0; i<foods.length; i++){
            System.out.println("food:" + foods[i] + " price:" + pricesFoods[i] +
                    " popularity:" + popularity[i]);
        }
    }
}