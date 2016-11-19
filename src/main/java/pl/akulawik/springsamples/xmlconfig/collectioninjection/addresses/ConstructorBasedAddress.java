package pl.akulawik.springsamples.xmlconfig.collectioninjection.addresses;

import pl.akulawik.springsamples.xmlconfig.collectioninjection.Address;

public class ConstructorBasedAddress extends Address {

    public ConstructorBasedAddress(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }
}
