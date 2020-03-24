import java.time.LocalDate;
import java.time.LocalTime;

class Ticket {
  Event event = new Event();
  LocalTime purchaseTime;
  LocalDate purchaseDate;
  int[][] seatLocation;
  Boolean checkedInStatus;
  Boolean isRefundable;

  User owner = new User();

  public Ticket(Event event, int[][] seatLocation, boolean isRefundable) {
    this.purchaseTime = LocalTime.now();
    this.purchaseDate = LocalDate.now();
    this.event = event;
    this.seatLocation = seatLocation; // need a way to do seatlocation, could be two ints?
    this.isRefundable = isRefundable;
    this.checkedInStatus = false;
  }

  public Boolean isRefundable() {
    return isRefundable;
  }

}
