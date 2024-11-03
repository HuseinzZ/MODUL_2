package OCP;

public class StandardCinema extends Cinema{
    public StandardCinema(double price){
        this.price = price;
    }
    @Override
    double calculateAdminFee(){
        return this.price * 10 / 100;
    }
}
