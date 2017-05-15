import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PersonTest{
  Person person;

  @Before
  public void before() {
    person = new Person("Daniel", 666);
  }

  @Test
  public void hasName(){
    assertEquals("Daniel", person.getName());
  }
