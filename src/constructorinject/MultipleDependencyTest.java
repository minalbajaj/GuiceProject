package constructorinject;

import com.google.inject.Injector;
import com.google.inject.Guice;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 12:21:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class MultipleDependencyTest {

    public static void main(String args[]){

       // Person p=new Person(new Laptop(),new Mobile());
      //  p.displayinfo();
        Injector injector= Guice.createInjector();
        Person person=injector.getInstance(Person.class);
        person.displayinfo();

    }
}
