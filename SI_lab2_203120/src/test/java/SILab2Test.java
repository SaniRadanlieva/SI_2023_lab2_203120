import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    public void testEveryBranch() {
        assertThrows(RuntimeException.class, () -> SILab2.function(null ,null));
        User user1 = new User(null, "Sani1234", "sani@g.com");
        List<User> users = List.of(user1);
        assertFalse(SILab2.function(user1, users));
        User user2 = new User("Sani", "Sa Ni1234", "sani@g.com");
        assertFalse(SILab2.function(user2, users));
        User user3 = new User("Sani", "Sani Sani", "sani@g.com");
        User user4 = new User("SaniS", "SaniSani", "sanis@g.com");
        users = List.of(user4);
        assertFalse(SILab2.function(user3, users));

        User user5 = new User("Sani", "Sani1234", "sani@g.com");
        assertTrue(SILab2.function(user5, users));
    }

    @Test
    public void testMultipleConditionMissingInformation() {
        RuntimeException exception;


        exception = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Sani", null, null), new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Sani", "Sani12345", null), new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Sani", null, "sani@g.com"), new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));

    }
}
