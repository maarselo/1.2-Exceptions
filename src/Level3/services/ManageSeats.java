package Level3.services;

import Level3.exceptions.SeatOccupiedException;
import Level3.model.Seat;

import java.util.ArrayList;

public class ManageSeats {
    private ArrayList <Seat> seats = null;

   public ManageSeats() {
       this.seats = new ArrayList<>();
   }

   public void addSeat(Seat seatToAdd) throws SeatOccupiedException {
        if (seatToAdd == null)
            return;
        if (findSeat(seatToAdd) != -1)
            throw new SeatOccupiedException("The seats is already takes.");

        seats.add(seatToAdd);
        System.out.println("Added Successfully.");
   }

   public void deleteSeat(int row, int number) throws SeatOccupiedException {
       if (row <= 0 || number <= 0)
           return ;
       Seat s = new Seat(row, number, null);
       if (findSeat(s) == -1)
           throw new SeatOccupiedException("The seat is not reserved.");
       seats.remove(s);
       System.out.println("Delete Successfully");
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
