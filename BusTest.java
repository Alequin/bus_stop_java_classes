import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusTest{

  @before
  public void setup(){
    Bus bus = new Bus(10);
    Person person = new Person("Andrew");
  }

  @Test
  public void getPassengerCount(){
    assertEquals(0, bus.getPassengerCount());
  }

  @Test
  public void addToBus(){
    bus.add(person);
    assertEquals(1, bus.getPassengerCount());
  }

}
