package pl.akulawik.springsamples.xmlconfig.collectioninjection;

public abstract class Address {

    protected String city;
    protected String street;
    protected int number;

    public String getAddress() {
        return city + " " + street + " " + number;
    }
}
