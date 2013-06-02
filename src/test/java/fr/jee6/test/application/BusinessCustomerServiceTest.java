package fr.jee6.test.application;

import fr.jee6.test.model.Customer;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.openejb.jee.WebApp;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.Classes;
import org.apache.openejb.testing.EnableServices;
import org.apache.openejb.testing.Module;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: Lucho
 * Date: 30/05/13
 * Time: 21:57
 * To change this template use File | Settings | File Templates.
 */
@EnableServices(value = "jaxrs")
@RunWith(ApplicationComposer.class)
public class BusinessCustomerServiceTest {

    @Module
    @Classes(BusinessCustomerService.class)
    public WebApp app() {
        return new WebApp().contextRoot("test");
    }

    @Test
    public void getList() {
        final Customer customer = WebClient.create("http://localhost:4204").path("/test/api/customer/get").accept(MediaType.APPLICATION_JSON_TYPE).get(Customer.class);
    }
}
