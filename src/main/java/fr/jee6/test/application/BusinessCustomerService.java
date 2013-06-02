package fr.jee6.test.application;

import fr.jee6.test.model.Customer;

import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: Lucho
 * Date: 30/05/13
 * Time: 19:46
 * To change this template use File | Settings | File Templates.
 */
@Singleton
@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
public class BusinessCustomerService {

    @Path("/get")
    @GET
    public Customer findOne() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Test");
        return customer;
    }

}
