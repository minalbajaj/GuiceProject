package bindingwidnamedanno;

import com.google.inject.Module;
import com.google.inject.Binder;
import com.google.inject.name.Names;


/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 3:13:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerModule implements Module{

    public void configure(Binder binder) {

        binder.bind(Player.class).annotatedWith(Names.named("Good")).to(GoodPlayer.class);
       
        binder.bind(Player.class).annotatedWith(Names.named("Bad")).to(BadPlayer.class);
           }

    }

