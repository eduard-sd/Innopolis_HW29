import org.junit.Assert;
import ru.sayakhov.Person;


public class PersonTest {

    @org.junit.Test
    public void equals() {

        Person anton5 = new Person("Anton",10,'M');
        Person anton7 = new Person("Anton",77,'M');
        Person anton6 = new Person("Anton",10,'M');

        Assert.assertTrue(anton5.equals(anton6));
        Assert.assertTrue(anton6.hashCode() == anton5.hashCode());
        Assert.assertTrue(anton7.hashCode() != anton5.hashCode());
    }
}