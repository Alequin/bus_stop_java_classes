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

}
