package com.example.turistguide_del1.repository;

import com.example.turistguide_del1.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private List<TouristAttraction> attractions;

    public TouristRepository() {
        attractions = new ArrayList<>();
        populateAttractions();
    }

    public void populateAttractions() {
        attractions.add(new TouristAttraction("Tivoli", "Tivoli Gardens, also known simply as Tivoli, is an amusement park and pleasure garden in Copenhagen, Denmark. The park opened on 15 August 1843 and is the third-oldest operating amusement park in the world, after Dyrehavsbakken in nearby Klampenborg, also in Denmark, and Wurstelprater in Vienna, Austria."));
        attractions.add(new TouristAttraction("TheLittleMermaid", "The Little Mermaid (Danish: Den lille Havfrue) is a bronze statue by Edvard Eriksen, depicting a mermaid becoming human. The sculpture is displayed on a rock by the waterside at the Langelinie promenade in Copenhagen, Denmark. It is 1.25 metres tall and weighs 175 kilograms."));
    }

    public String getDescriptionFromName(String name) {
        String result = "";
        for (TouristAttraction attraction : attractions) {
            if (attraction.getName().equalsIgnoreCase(name)) {
                result = attraction.getDescription();
            }
        }
        return result;
    }

    public void addAttraction(String name, String description) {
        attractions.add(new TouristAttraction(name, description));
    }

    public void updateAttraction(String name, String description) {
        for (TouristAttraction attraction : attractions) {
            if (attraction.getName().equalsIgnoreCase(name)) {
                attraction.setDescription(description);
            }
        }
    }

    public void deleteAttraction(String name) {
        for (TouristAttraction attraction : attractions) {
            if (attraction.getName().equalsIgnoreCase(name)) {
                attractions.remove(attraction);
            }
        }
    }

    public List<TouristAttraction> getAttractions() {
        return attractions;
    }


}
