package mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

class WeatherMonitorServiceTestSuite {

    @Test
    public void AddPersonToSubscriptionFromParticularLocationAndCheckReceiveNotification() {
        WeatherMonitorService weatherMonitorService = new WeatherMonitorService();
        Person person = Mockito.mock(Person.class);
        Location location = Mockito.mock(Location.class);
        weatherMonitorService.addPerson(person, location);
        Notification notification = Mockito.mock(Notification.class);

        weatherMonitorService.sendNotification(notification);

        Set<Person> subscribers = weatherMonitorService.getSubscribersForLocation(location);
        for (Person subscriber : subscribers) {
            subscriber.receive(notification);
        }

        Mockito.verify(person, times(1)).receive(notification);
    }

    @Test
    public void  CancelSubscriptionFromParticularLocation(){
        WeatherMonitorService weatherMonitorService = new WeatherMonitorService();
        Person person = Mockito.mock(Person.class);
        Location location = Mockito.mock(Location.class);
        weatherMonitorService.addPerson(person, location);
        weatherMonitorService.cancelSubscriptionForLocation(person, location);
        Notification notification = Mockito.mock(Notification.class);

       weatherMonitorService.sendNotification(notification);

        Mockito.verify(person, never()).receive(notification);
    }


    @Test
    public void CancelSubscriptionsFromAllLocationsAndCompletelyUnsubscribingOfAllNotifications(){
        WeatherMonitorService weatherMonitorService = new WeatherMonitorService();
        Person person = Mockito.mock(Person.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        weatherMonitorService.addPerson(person, location1);
        weatherMonitorService.addPerson(person, location2);
        weatherMonitorService.cancelAllSubscription(person);
        Notification notification = Mockito.mock(Notification.class);

        weatherMonitorService.sendNotification(notification);

        Mockito.verify(person, never()).receive(notification);

    }

    @Test
    public void NotificationShouldBeSentToDefinedGroupOfPeople(){
        WeatherMonitorService weatherMonitorService = new WeatherMonitorService();
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        weatherMonitorService.addPerson(person1, location1);
        weatherMonitorService.addPerson(person2, location2);
        Notification notification = Mockito.mock(Notification.class);

        Set<Person> targetGroup = new HashSet<>();
        targetGroup.add(person1);

        weatherMonitorService.sendToGroupOFPeopleNotification(notification, targetGroup);


        Mockito.verify(person1, times(1)).receive(notification);
        Mockito.verify(person2, never()).receive(notification);
    }
    @Test
    public void OpportunitySendNotificationsToAll(){
        WeatherMonitorService weatherMonitorService = new WeatherMonitorService();
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        weatherMonitorService.addPerson(person1, location1);
        weatherMonitorService.addPerson(person2, location2);
        Notification notification = Mockito.mock(Notification.class);

        weatherMonitorService.sendToAllNotification(notification);

        Mockito.verify(person1,times(1)).receive(notification);
        Mockito.verify(person2,times(1)).receive(notification);
    }

    @Test
    public void OpportunityRemoveParticularLocation(){
        WeatherMonitorService weatherMonitorService = new WeatherMonitorService();
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        weatherMonitorService.addPerson(person1, location1);
        weatherMonitorService.addPerson(person2, location2);
        weatherMonitorService.removeLocation(location2);
        Notification notification = Mockito.mock(Notification.class);
        weatherMonitorService.sendNotification(notification);

        Mockito.verify(person1, times(1)).receive(notification);
        Mockito.verify(person2, never()).receive(notification);
}
    }
