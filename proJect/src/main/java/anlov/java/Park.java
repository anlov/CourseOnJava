package anlov.java;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Attractions> attractions = new ArrayList<>();

   public class Attractions{
       private String name;
       private String workingHours;
       private double price;

       public Attractions(String name, String workingHours, double price) {
           this.name = name;
           this.workingHours = workingHours;
           this.price = price;
       }

       @Override
       public String toString() {
           return "Аттракцион:" + name + ", работает " + workingHours + '\'' +
                   " по цене " + price + '.';
       }
   }

    public void addAttraction(String name, String workingHours, double price) {
        attractions.add(new Attractions(name, workingHours, price));
    }

    public void displayAttractions() {
        for (Attractions attraction : attractions) {
            System.out.println(attraction);
        }
    }
}
