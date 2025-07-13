package Level3.services;

import Level3.exceptions.ExceptionSeatOccupied;
import Level3.model.Seat;

import java.util.ArrayList;

public class ManageSeats {
    private ArrayList <Seat> seats = null;

   public ManageSeats() {
       this.seats = new ArrayList<>();
   }

   public void addSeat(Seat seatToAdd) throws ExceptionSeatOccupied {
        if (seatToAdd == null)
            return;
        switch (findSeat(seatToAdd)) {
            case  -1 -> {
                seats.add(seatToAdd);
                System.out.println("Added Successfully.");
            }
            default -> {
                throw new ExceptionSeatOccupied("The seats is already takes.");
            }
        }
   }
   public void deleteSeat(int row, int number) throws  ExceptionSeatOccupied{
       if (row <= 0 || number <= 0)
           return ;
       Seat s = new Seat(row, number, null);
       int isFound = findSeat(s);
       switch (isFound) {
           case -1 -> throw new ExceptionSeatOccupied("The seat is not reserved.");
           default -> {
                seats.remove(s);
                System.out.println("Delete Successfully");
           }
       }
   }
    public int findSeat(Seat seatToFind) {
        for (Seat s : seats) {
            if (s.equals(seatToFind))
                return (seats.indexOf(s));
        }
        return (-1);
    }

    public ArrayList<Seat> getSeats() {return seats;}
}
