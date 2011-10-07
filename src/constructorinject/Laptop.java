package constructorinject;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 12:20:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Laptop {
    private String model;
    private String price;

 Laptop(){
        this.model="Dell";
       this.price="2000";

 }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
