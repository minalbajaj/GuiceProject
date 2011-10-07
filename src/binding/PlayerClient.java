package binding;

import com.google.inject.Injector;
import com.google.inject.Guice;
import com.google.inject.Module;
import com.google.inject.Key;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 2:49:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerClient {
          public static void main(String[] args) {

        PlayerModule module = new PlayerModule();
        Injector injector = Guice.createInjector(new Module[]{module});
             Player player = injector.getInstance( Key.get( Player.class,Good.class));
      
               player.bat();
        player.bowl();
    }

}
