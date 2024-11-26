
public class Review01 {

    public static void main(String[] args) {
        int product=1500;
        int taxRate=10;
        int tax;
        tax=tax1(product,taxRate);
        int price=product+tax;
        System.out.println(product+"円の商品の税込価格は"+price+"円です（消費税は"+tax+"円）です。");


    }

    public static int tax1(int product,int taxRate) {
        int result=product/taxRate;
        return result;
    }

}
