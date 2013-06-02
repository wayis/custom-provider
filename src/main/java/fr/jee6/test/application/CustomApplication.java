package fr.jee6.test.application;

import fr.jee6.test.providers.CustomerProvider;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Lucho
 * Date: 02/06/13
 * Time: 18:27
 * To change this template use File | Settings | File Templates.
 */
@ApplicationPath("/api")
public class CustomApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = super.getClasses();
        classes.add(BusinessCustomerService.class);
        classes.add(CustomerProvider.class);
        return classes;
    }
}
