package mockito.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WeatherMonitorService {

    private Map<Person, Location> registeredPeople = new HashMap<>();

    public void addPerson(Person person, Location location) {
        this.registeredPeople.put(person, location);
    }


    public void sendNotification(Notification notification) {
        for (Map.Entry<Person, Location> entry : registeredPeople.entrySet()) {
            Person person = entry.getKey();
            Location location = entry.getValue();
            if (location.equals(notification.getLocation())) {
            }
        }
    }

    public Set<Person> getSubscribersForLocation(Location location) {
        return registeredPeople.entrySet().stream()
                .filter(entry -> entry.getValue().equals(location))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    public void cancelSubscriptionForLocation(Person person, Location location) {
        registeredPeople.entrySet().removeIf(entry ->
                entry.getKey().equals(person) && entry.getValue().equals(location));
    }

    public void cancelAllSubscription(Person person) {
        registeredPeople.entrySet().removeIf(entry -> entry.getKey().equals(person));
    }


    public void sendToGroupOFPeopleNotification(Notification notification, Set<Person> targetGroup) {
        for (Person person : registeredPeople.keySet()) {
            Location personLocation = registeredPeople.get(person);
            if (personLocation != null && personLocation.equals(notification.getLocation()) && targetGroup.contains(person)) {
                person.receive(notification);
            }
        }
    }

    public void sendToAllNotification(Notification notification) {
        for (Person person : registeredPeople.keySet()) {
            person.receive(notification);
        }
    }

    public void removeLocation(Location location) {
        registeredPeople.entrySet().removeIf(entry -> entry.getValue().equals(location));
    }
}

