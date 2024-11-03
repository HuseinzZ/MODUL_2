package OCP;

public class PremiumCinema extends Cinema{
    public PremiumCinema(double price){
        this.price = price;
    }
    @Override
    double calculateAdminFee(){
        return this.price * 20 / 100;
    }
}
