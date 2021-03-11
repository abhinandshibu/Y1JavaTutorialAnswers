package package0c21;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PropertyCollection implements PropertyCollectionInterface {

    Set<Property> collection;

    public PropertyCollection() {
        this.collection = new HashSet<>();
    }

//    private <T extends Property> Set<T> getPropertiesOfType(Class<T> type) {
//        return collection.stream()
//                .filter(p -> p instanceof T)
//                .map(p -> (T) p)
//                .collect(Collectors.toSet());
//    }

    @Override
    public void addProperty(Property p) {
        collection.add(p);
    }

    @Override
    public Set<House> getHouses() {
        return collection.stream()
                .filter(p -> p instanceof House)
                .map(p -> (House) p)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Bungalow> getBungalows() {
        return collection.stream()
                .filter(p -> p instanceof Bungalow)
                .map(p -> (Bungalow) p)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Flat> getFlats() {
        return collection.stream()
                .filter(p -> p instanceof Flat)
                .map(p -> (Flat) p)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Maisonette> getMaisonettes() {
        return collection.stream()
                .filter(p -> p instanceof Maisonette)
                .map(p -> (Maisonette) p)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Terraced> getTerracedHouses() {
        return collection.stream()
                .filter(p -> p instanceof Terraced)
                .map(p -> (Terraced) p)
                .collect(Collectors.toSet());
    }

}
