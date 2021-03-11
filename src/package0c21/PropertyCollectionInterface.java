package package0c21;

import java.util.Set;

public interface PropertyCollectionInterface {

    // Add a property to the collection
    void addProperty(Property p);

    // Return the set of all houses in the collection
    Set<House> getHouses();

    // Return the set of all bungalows in the collection
    Set<Bungalow> getBungalows();

    // Return the set of all flats in the collection
    Set<Flat> getFlats();

    // Return the set of all maisonettes in the collection
    Set<Maisonette> getMaisonettes();

    // Return the set of all terraced houses in the collection
    Set<Terraced> getTerracedHouses();

}
