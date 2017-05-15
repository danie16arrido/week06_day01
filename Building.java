public class Building{
  private String name;
  private Classroom[] classroomsList;

  public Building(String name){
    this.name = name;
    this.classroomsList = new Classroom[10];
  }

  public String getName(){
    return this.name;
  }

  public int classroomsCount(){
    int count = 0;
    for (Classroom classroom : classroomsList){
        if (classroom != null){
          count++;
        }
    }
    return count;
  }

  public int numberOfClassrooms(){
    return this.classroomsList.length;
  }

  public void addClassroom(Classroom classroom1){
    if (isFull()){
      return;
    }
    int classroomsInBuilding = classroomsCount();
    classroomsList[classroomsInBuilding] = classroom1;
  }

  public boolean isFull(){
    return classroomsCount() == classroomsList.length;
  }

  public void moveStudentToClassRoom(Person student, Classroom classroom){
    classroom.addStudent(student);
  }

  public void moveStudentFromAtoB(Person student, Classroom from, Classroom to){
    to.addStudent(student);
    // from.removeStudent(student);
  }

}
