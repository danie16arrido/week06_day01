import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ClassroomTest{
  Classroom classroom1;

  @Before
  public void before() {
    classroom1 = new Classroom(12, "High Street", 'a');
  }

  @Test
  public void hasRoomNumber(){
    assertEquals(12, classroom1.getRoomNumber());
  }

  @Test
  public void hasBuilding(){
    assertEquals("High Street", classroom1.getBuilding());
  }
  @Test
  public void hasType(){
    assertEquals('a', classroom1.getType());
  }
  @Test
  public void isEmptyWhenCreated(){
    assertEquals(true, classroom1.empty());
  }

  @Test
  public void canChangeEmpty(){
    classroom1.setEmpty(false);
    assertEquals(false, classroom1.empty());
  }
}
