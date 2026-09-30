class ReservationSystem {
 private int seats = 10;
 synchronized void reserve(String name, int req) {
 System.out.println(name + " entered. Available: " + seats + " Requested: " + req);
 if(seats >= req) {
 seats -= req;
 System.out.println("Seat Available. Reserve now :-) " + req + " seats reserved.");
 } else {
 System.out.println("Requested seats not available :-(");
 }
 System.out.println(name + " leaving.\n---");
 }
}
class Person extends Thread {
 ReservationSystem rs; String name; int seats;
 Person(ReservationSystem r, String n, int s) { rs=r; name=n; seats=s; }
 public void run() { rs.reserve(name, seats); }
}
public class ReservationMain {
 public static void main(String[] args) throws InterruptedException {
 ReservationSystem rs = new ReservationSystem();
 Person p1 = new Person(rs,"Person-1",5);
 Person p2 = new Person(rs,"Person-2",2);
 Person p3 = new Person(rs,"Person-3",4);
 p1.start(); p1.join();
 p2.start(); p2.join();
 p3.start(); p3.join();
 }
}