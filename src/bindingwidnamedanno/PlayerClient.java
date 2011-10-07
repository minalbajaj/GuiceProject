package bindingwidnamedanno;

import com.google.inject.Guice;
import com.google.inject.Module;
import com.google.inject.Key;
import com.google.inject.Injector;



import com.google.inject.name.Names;
 // import javax.inject.Named;
import javax.inject.Inject;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 3:16:02 PM
 * To change this template use File | Settings | File Templates.
 */

public class PlayerClient {
     public static void main(String[] args) {

     PlayerModule module = new PlayerModule();
        Injector injector = Guice.createInjector(module);
        Player goodPlayer =injector.getInstance(Key.get(Player.class,Names.named("Good"))) ;
         Player badPlayer =injector.getInstance(Key.get(Player.class,Names.named("Bad"))) ;
        goodPlayer.bat();
         badPlayer.bat();
    }
}
