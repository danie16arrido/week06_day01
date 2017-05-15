import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ClassroomTest{
  Classroom classroom1;
  Person student1;

  @Before
  public void before() {
    classroom1 = new Classroom(12, "High Street", 'a');
    student1 = new Person("Daniel", 666);
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

  @Test
  public void classroomHasNoStudentsWhenCreated(){
    assertEquals(0, classroom1.studentsCount());
  }

  @Test
  public void canAddStudent(){
    classroom1.addStudent(student1);
    assertEquals(1, classroom1.studentsCount());
  }

  @Test
  public void classRoomIsFull(){
    for (int i = 0; i < 6; i++){
      classroom1.addStudent(student1);
    }
    assertEquals(true, classroom1.isFull());
  }


}
