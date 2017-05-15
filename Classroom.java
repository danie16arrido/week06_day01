public class Classroom{
  private int roomNumber;
  private String building;
  private char type;
  private boolean empty;

  public Classroom(int roomNumber, String building, char type){
    this.roomNumber = roomNumber;
    this.building = building;
    this.type = type;
    this.empty = true;
  }

  public int getRoomNumber(){
    return this.roomNumber;
  }

  public String getBuilding(){
    return this.building;
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


}
