package fr.jee6.test.model;

/**
 * Created with IntelliJ IDEA.
 * User: Lucho
 * Date: 02/06/13
 * Time: 17:45
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    private long id;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
