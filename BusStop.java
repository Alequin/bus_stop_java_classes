public class BusStop{

  private Person[] people;
  private Bus busAtStop;

  public BusStop(){
    this.people = new Person[30];
  }

  public void setBusAtStop(Bus bus){
    this.busAtStop = bus;
  }

  public Bus getBusAtStop(){
    Bus tempBus = this.busAtStop;
    this.busAtStop = null;
    return tempBus;
  }

  public getPersonOffBus(){
    int index = 0;
    for(Person person : people){
      
    }
  }

}
