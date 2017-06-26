public class Bus{

  private Person[] passengers;

  public Bus(int size){
    this.passengers = new Person[size];
  }

  public int getPassengerCount(){
    int count = 0;
    for(int j=0; j<passengers.length; j++){
      if(passengers[j] == null){
        if(j == 0){
          return 0;
        }
        count = j+1;
        break;
      }
    }
    return count;
  }

  public void add(Person person){

  }
}
