package binding;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Oct 5, 2011
 * Time: 3:07:22 PM
 * To change this template use File | Settings | File Templates.
 */
 import java.lang.annotation.*;
import com.google.inject.BindingAnnotation;

@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
@Target(ElementType.LOCAL_VARIABLE)
public @interface Bad {
}
