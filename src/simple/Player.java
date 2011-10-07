package simple;

import com.google.inject.name.Named;
import com.google.inject.Inject;


/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 12:05:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Player {
   
    public String name;

    public Player(){
    }
   
    public String toString(){
        return name;
    }
}
