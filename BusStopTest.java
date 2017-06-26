import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusStopTest{

  private BusStop busStop;
  private Bus bus;
  private Person person;

  @Before
  public void setup(){
    this.busStop = new BusStop();
    this.bus = new Bus(10);
    this.person = new Person("Andrew");
  }

  @Test
  public void setAndGetBusAtStop(){
    busStop.setBusAtStop(bus);
    assertEquals(bus, busStop.getBusAtStop());
    assertEquals(null, busStop.getBusAtStop());
  }

  @Test
  public void checkNumberOfPeopleAtBusStop(){

  }

  @Test
  public void addPersonToBusStop(){

  }

  @Test
  public void getPersonOffBus(){

  }


}
