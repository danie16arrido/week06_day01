public class Classroom{
  private int roomNumber;
  private char type;
  private boolean empty;
  private Person[] studentsList;

  public Classroom(int roomNumber, char type){
    this.roomNumber = roomNumber;
    this.type = type;
    this.empty = true;
    this.studentsList = new Person[6];
  }

  public int getRoomNumber(){
    return this.roomNumber;
  }

  public char getType(){
    return this.type;
  }

  public boolean empty(){
    return this.empty;
  }

  public void setEmpty(boolean status){
    this.empty = status;
  }

  public int studentsCount(){
    int count = 0;
    for (Person student : studentsList){
        if (student != null){
          count++;
        }
    }
    return count;
  }
  public boolean isFull(){
    return studentsCount() == studentsList.length;
  }

  public void addStudent(Person student){
    if (isFull()){
      return;
    }
    int studentsInClass = studentsCount();
    studentsList[studentsInClass] = student;
  }


}
