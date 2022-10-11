public class ProductManager {
    public void add(Product product){

        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        } else{
            System.out.println("ürün bilgileri gecersizdir");
        }
        ProductValidator productValidator = new ProductValidator();
        productValidator.bisey();
    }
}
