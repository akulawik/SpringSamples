package pl.akulawik.springsamples.xmlconfig.collectioninjection;

import java.util.List;
import java.util.Set;

public class DataSource {
    private List<String> names;
    private Set<Address> addresses;

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }
}
