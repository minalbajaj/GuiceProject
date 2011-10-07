package simple;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 12:06:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerTest {
            public static void main(String[] args) {

    Injector injector = Guice.createInjector();
    Player player = injector.getInstance(Player.class);
    player.name = "David Boon";
                //without guice
                Player p=new Player();
                p.name="test";
    System.out.println(player);
    }
}
