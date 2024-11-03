package OCP;

public class DeluxeCinema extends Cinema{
    public DeluxeCinema(double price){
        this.price = price;
    }
    @Override
    double calculateAdminFee(){
        return this.price * 12 / 100;
    }
}
