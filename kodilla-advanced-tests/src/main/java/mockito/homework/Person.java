package mockito.homework;

import java.util.Set;

public interface Person {
    String getFirstName();
    String getEmail();

    void receive (Notification notification);
    void receive2 (Notification notification, Set<Person> targetGroup);
}


