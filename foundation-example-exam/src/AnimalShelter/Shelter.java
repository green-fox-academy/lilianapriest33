package AnimalShelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {

    int budget = 50;
    List<Animal> animals;
    List<String> adoptersName;

    Shelter() {
        animals = new ArrayList<>();
        adoptersName = new ArrayList<>();
    }

    public int rescue(Animal animal) {
        animals.add(animal);
        return animals.size();
    }

    public int heal() {
        int healedAnimals = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).isHealthy == false && budget > animals.get(i).healCost && healedAnimals < 1) {
                budget -= animals.get(i).healCost;
                animals.get(i).isHealthy = true;
                healedAnimals++;
            } else continue;
        }
        return healedAnimals;
    }

    public void addAdopter(String name) {
        adoptersName.add(name);
    }

    public void findNewOwner() {
        int adoptedAnimals = 0;
        while (adoptedAnimals < 1) {
            int j = (int) (Math.random() * animals.size());
            if (animals.get(j).isHealthy) {
                adoptersName.remove((int) (Math.random() * adoptersName.size()));
                animals.remove(j);
                adoptedAnimals++;
            }
        }
    }

    public int earnDonation(int amount) {
        budget += amount;
        return budget;
    }

    @Override
    public String toString() {
        String info = " ";
        info = "Budget: " + budget + " €\n" + "There are " +
                animals.size() + " animal(s) and " + adoptersName.size() + " potential adopter(s).\n";
        for (int i = 0; i < animals.size(); i++) {
            info += animals.get(i).toString() + "\n";
        }
        return info;
    }
}