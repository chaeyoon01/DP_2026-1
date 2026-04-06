package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter=200;
    private String baseDate;

    public LicenseCardFactory(String baseDate){
        this.baseDate=baseDate;
    }

     private String calculateExpiryDate(String issuedDate){
        int year=Integer.parseInt(issuedDate.substring(0,4));
        year+=5;
        String date=issuedDate.substring(4);
        return year+date;
    }

    @Override
    protected Product createProduct(String holder) {
        String expiryDate=calculateExpiryDate(baseDate);
        return new LicenseCard(holder, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
        System.out.println();
    }
}
