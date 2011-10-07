package singleinterfaceimpl;

import com.google.inject.Injector;
import com.google.inject.Guice;
import com.google.inject.Module;
import com.google.inject.Key;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 7, 2011
 * Time: 10:45:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class AddClient {
    public static void main(String args[]) {

      // AddModule module=new AddModule();
        Injector i= Guice.createInjector(new AddModule())  ;
        Add add=i.getInstance(Key.get(Add.class));
      
        System.out.println("add"+ add.add(5,7));
    }


}
