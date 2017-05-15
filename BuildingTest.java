import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BuildingTest{
  Building building1;
  Classroom classroom1;
  Classroom classroom2;
  Person student1;
  Person student2;

  @Before
  public void before() {
    building1 =  new Building("Hawker House");
    classroom1 = new Classroom(12, 'a');
    classroom2 = new Classroom(1, 'g');
    student1 = new Person("Daniel", 666);
    student2 = new Person("Maria", 22);
  }

  @Test
  public void hasName(){
    assertEquals("Hawker House", building1.getName());
  }

  @Test
  public void isEmptyWhenCreated(){
    assertEquals(0, building1.classroomsCount());
  }

  @Test
  public void totalClassromms(){
    assertEquals(10, building1.numberOfClassrooms());
  }

  @Test
  public void addClassroomToBuilding(){
    building1.addClassroom(classroom1);
    assertEquals(1, building1.classroomsCount());
  }

  @Test
  public void isFull(){
    for (int i = 0; i < building1.numberOfClassrooms(); i++){
      building1.addClassroom(classroom1);
    }
    assertEquals(true, building1.isFull());
  }

  @Test
  public void moveStudentToClassRoom(){
    building1.moveStudentToClassRoom(student1, classroom2);
    assertEquals(1, classroom2.studentsCount());
  }

  @Test
  public void canMoveStudentsBetweenClassrooms(){
    classroom1.addStudent(student1);
    assertEquals(0, classroom2.studentsCount());
    building1.moveStudentFromAtoB(student1, classroom1, classroom2);
    assertEquals(1, classroom2.studentsCount());
    // assertEquals(0, classroom1.studentsCount());
  }






}
