package fr.jee6.test.providers;

import fr.jee6.test.model.Customer;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * Created with IntelliJ IDEA.
 * User: Lucho
 * Date: 02/06/13
 * Time: 17:49
 * To change this template use File | Settings | File Templates.
 */
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class CustomerProvider implements MessageBodyWriter<Customer> {
    @Override
    public long getSize(Customer customer, Class<?> rawType, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public boolean isWriteable(Class<?> rawType, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return Customer.class.isAssignableFrom(rawType) && mediaType.isCompatible(MediaType.APPLICATION_JSON_TYPE);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void writeTo(Customer customer, Class<?> rawType, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException {
        final PrintWriter writer = new PrintWriter(entityStream);
        writer.println("{customer: {id: "+customer.getId()+", name: "+customer.getName()+"}");
    }
}
