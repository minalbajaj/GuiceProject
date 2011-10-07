package constructorinject;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 12:20:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mobile {

    private String number;

    public Mobile() {
        this.number = "9975636873";
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "number='" + number + '\'' +
                '}';
    }
}
