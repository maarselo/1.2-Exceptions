package Level3.services;

import Level3.exceptions.AnyReservationsException;
import Level3.exceptions.SeatOccupiedException;
import Level3.model.Cinema;
import Level3.model.Seat;
import Level3.utils.Input;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManageCinema {
    private Cinema cinema;

    public ManageCinema (Cinema cinema) {
        this.cinema = cinema;
    }

    public void showSeats() throws AnyReservationsException {
        if (this.cinema.getManageSeats().getSeats().isEmpty())
            throw new AnyReservationsException("The cinema doesn't have any reserves");
        for (Seat s : this.cinema.getManageSeats().getSeats())
            System.out.println(s.toString());
    }

    public void showSeatsPerson () {
        int signal = 0;
        String person = Input.readstring("Put the name of the person: ");
        List<Seat> seats = findSeatsByPerson(person);
        if (seats.isEmpty()) {
            System.out.println("This persona doesn't have any booking.");
            return;
        }
        for (Seat s : seats)
            System.out.println(s.toString());
    }

    public List<Seat> findSeatsByPerson(String personName) {
        List<Seat> result = new ArrayList<>();
        for (Seat s : this.cinema.getManageSeats().getSeats()) {
            if (s.getPerson().equals(personName)) {
                result.add(s);
            }
        }
        return result;
    }

    public void reserveSeat() {
        int row = Input.readInt("Choose a row(max." + cinema.getRows() + "/min.1): ", cinema.getRows());
        int seat = Input.readInt("Choose a seat(max." + cinema.getSeatsPerRow() + "/min.1): ", cinema.getSeatsPerRow());
        String name = Input.readstring("What is your name:");
        this.cinema.getManageSeats().addSeat(new Seat(row, seat, name));
    }

    public void deleteReserve() {
        int row = Input.readInt("Choose a row(max." + cinema.getRows() + "/min.1): ", cinema.getRows());
        int seat = Input.readInt("Choose a row(max." + cinema.getSeatsPerRow() + "/min.1): ", cinema.getSeatsPerRow());
        try {
            cinema.getManageSeats().deleteSeat(row, seat);
        } catch (SeatOccupiedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteReservePerson() {
        boolean signal = false;
        String name = Input.readstring("What ir your name:");
        Iterator<Seat> iterator = this.cinema.getManageSeats().getSeats().iterator();

        while (iterator.hasNext()) {
            Seat s = iterator.next();
            if (s.getPerson().equals(name)) {
                System.out.println("Deleting->" + s.toString());
                iterator.remove();
                signal = true;
            }
        }
        System.out.println(signal ? "Remove Successfully " : "Error: any booking for this name");
    }
}
