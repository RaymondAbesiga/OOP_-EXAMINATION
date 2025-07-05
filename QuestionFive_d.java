package ray.oopexamination;

abstract class TaxCategory {
    public abstract double calculateVAT(double amount);
}


class Retailer extends TaxCategory {
    public double calculateVAT(double amount) {
        return amount * 0.18; 
    }
}

class Wholesaler extends TaxCategory {
    public double calculateVAT(double amount) {
        return amount * 0.15; 
    }
}
class Importer extends TaxCategory {
    public double calculateVAT(double amount) {
        return amount * 0.10;
    }
}
public class Vat {
    public static void main(String[] args) {
        TaxCategory[] categories = new TaxCategory[3];

        categories[0] = new Retailer();
        categories[1] = new Wholesaler();
        categories[2] = new Importer();
        double[] amounts = {1000, 2000, 3000};
        for (int i = 0; i < categories.length; i++) {
            double vat = categories[i].calculateVAT(amounts[i]);
            System.out.println("Category: " + categories[i].getClass().getSimpleName()
                + ", Amount: " + amounts[i]
                + ", VAT: " + vat);
        }
    }
}
