package mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

class WeatherMonitorServiceTestSuite {

    WeatherMonitorService weatherMonitorService = new WeatherMonitorService();

    Person person = Mockito.mock(Person.class);

    Person person1 = Mockito.mock(Person.class);
    Person person2 = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);

    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);

    Notification notification = Mockito.mock(Notification.class);


    @Test
    public void AddPersonToSubscriptionFromParticularLocationAndCheckReceiveNotification() {


        Mockito.when(location.getLocationName()).thenReturn("Warszawa");

        weatherMonitorService.addPerson(person, location);
        Mockito.when(notification.getLocation()).thenReturn("Warszawa");

        weatherMonitorService.sendNotification(notification);

        Mockito.verify(person, times(1)).receive(notification);
    }

    @Test
    public void  CancelSubscriptionFromParticularLocation(){

        weatherMonitorService.addPerson(person, location);
        weatherMonitorService.cancelSubscriptionForLocation(person, location);
        weatherMonitorService.sendNotification(notification);
        Mockito.verify(person, never()).receive(notification);
    }


    @Test
    public void CancelSubscriptionsFromAllLocationsAndCompletelyUnsubscribingOfAllNotifications(){


        weatherMonitorService.addPerson(person, location1);
        weatherMonitorService.addPerson(person, location2);
        weatherMonitorService.cancelAllSubscription(person);
        weatherMonitorService.sendNotification(notification);
        Mockito.verify(person, never()).receive(notification);
    }

    @Test
    public void NotificationShouldBeSentToDefinedGroupOfPeople(){

        Mockito.when(location1.getLocationName()).thenReturn("Warszawa");
        Mockito.when(location2.getLocationName()).thenReturn("Poznan");
        weatherMonitorService.addPerson(person1, location1);
        weatherMonitorService.addPerson(person2, location2);
        Mockito.when(notification.getLocation()).thenReturn("Warszawa");

        weatherMonitorService.sendNotification(notification);

        Mockito.verify(person1, times(1)).receive(notification);
        Mockito.verify(person2, never()).receive(notification);
    }

    @Test
    public void OpportunitySendNotificationsToAll(){

        weatherMonitorService.addPerson(person1, location1);
        weatherMonitorService.addPerson(person2, location2);

        weatherMonitorService.sendToAllNotification(notification);

        Mockito.verify(person1,times(1)).receive(notification);
        Mockito.verify(person2,times(1)).receive(notification);
    }

    @Test
    public void OpportunityRemoveParticularLocation(){
        Mockito.when(location1.getLocationName()).thenReturn("Warszawa");
        Mockito.when(location2.getLocationName()).thenReturn("Poznan");

        weatherMonitorService.addPerson(person1, location1);
        weatherMonitorService.addPerson(person2, location2);
        weatherMonitorService.removeLocation(location2);
        Mockito.when(notification.getLocation()).thenReturn("Warszawa");
        weatherMonitorService.sendNotification(notification);

        Mockito.verify(person1, times(1)).receive(notification);
        Mockito.verify(person2, never()).receive(notification);
}
    }
