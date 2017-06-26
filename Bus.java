public class Bus{

  private Person[] passengers;

  public Bus(int size){
    this.passengers = new Person[size];
  }

  public int getPassengerCount(){
    int count = 0;
    for(int j=1; j<passengers.length; j++){
      if(passengers[j] == null){
        count = j;
        break;
      }
    }
    return count;
  }

  public void add(Person person){

  }
}
