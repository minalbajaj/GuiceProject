package binding;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.*;
import com.google.inject.BindingAnnotation;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 3:06:37 PM
 * To change this template use File | Settings | File Templates.
 */
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
@Target(ElementType.LOCAL_VARIABLE)
public @interface Good {
}
