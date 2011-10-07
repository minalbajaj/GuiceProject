package binding;

import com.google.inject.Module;
import com.google.inject.Binder;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 2:44:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerModule implements Module{
             public void configure(Binder binder) {

        binder.bind(Player.class).annotatedWith(Good.class).to(Goodplayer.class);
        binder.bind(Player.class).annotatedWith(Bad.class).to(Badplayer.class);
    }
    
}
