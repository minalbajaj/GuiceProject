package singleinterfaceimpl;

import com.google.inject.Module;
import com.google.inject.Binder;
import com.google.inject.AbstractModule;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 7, 2011
 * Time: 10:42:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class AddModule extends AbstractModule{
    protected void configure() {
        bind(Add.class).to(AddImpl.class);
    }
//public void configure(Binder binder) {
      //  binder.bind(Add.class).to(AddImpl.class);
    }

