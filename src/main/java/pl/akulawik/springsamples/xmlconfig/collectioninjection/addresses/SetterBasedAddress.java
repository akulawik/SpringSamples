package pl.akulawik.springsamples.xmlconfig.collectioninjection.addresses;

import pl.akulawik.springsamples.xmlconfig.collectioninjection.Address;

public class SetterBasedAddress extends Address {
    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
