package constructorinject;

import com.google.inject.Inject;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 12:20:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private Laptop laptop;
    private Mobile mobile;

    @Inject
    public Person(Laptop laptop, Mobile mobile) {
        this.laptop = laptop;
        this.mobile = mobile;
    }

    public void displayinfo(){

        System.out.println("Mobile no is."+mobile);
        System.out.println("laptop model is "+laptop);
    }

}
