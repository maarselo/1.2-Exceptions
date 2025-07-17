package Level3.services;

import Level3.exceptions.AnyReservatios;
import Level3.exceptions.ExceptionSeatOccupied;
import Level3.model.Cinema;
import Level3.model.Seat;
import Level3.utils.Input;

import java.util.Iterator;

public class ManageCinema {
    private Cinema cinema;

    public ManageCinema (Cinema cinema) {
        this.cinema = cinema;
    }

    public void showSeats() throws AnyReservatios {
        if (this.cinema.getManageSeats().getSeats().isEmpty())
            throw new AnyReservatios("The cinema doesn't have any reserves");
        for (Seat s : this.cinema.getManageSeats().getSeats())
            System.out.println(s.toString());
    }

    public void showSeatsPerson () {
        int signal = 0;
        String person = Input.readstring("Put the name of the person: ");
        for (Seat s : this.cinema.getManageSeats().getSeats()) {
            if (s.getPerson().equals(person)) {
                signal = 1;
                System.out.println(s.toString());
            }
        }
        if (signal == 0)
            System.out.println("This persona doesn't have any booking.");
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
        } catch (ExceptionSeatOccupied e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteReservePerson() {
        boolean signal = false;
        String name = Input.readstring("What ir your name:");
        Iterator<Seat> iterator = this.cinema.getManageSeats().getSeats().iterator(); // Obtén un Iterator

        while (iterator.hasNext()) {  // Itera con while
            Seat s = iterator.next(); // Obtén el siguiente elemento
            if (s.getPerson().equals(name)) {
                System.out.println("Deleting->" + s.toString());
                iterator.remove(); // Elimina el elemento actual de forma segura
                signal = true;
            }
        }
        System.out.println(signal ? "Remove Successfully " : "Error: any booking for this name");
    }
}
