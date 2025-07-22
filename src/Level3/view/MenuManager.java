package Level3.view;

import Level3.model.Cinema;
import Level3.utils.Input;

public class MenuManager {
    private Cinema cinema;

    public MenuManager(Cinema cinema) {
        this.cinema = cinema;
    }

    public void run(){
        int option = 1;
        do {
            option = Input.showMenu();
            try {
                switch (option) {
                    case 1 -> cinema.getManageCinema().showSeats();
                    case 2 -> cinema.getManageCinema().showSeatsPerson();
                    case 3 -> cinema.getManageCinema().reserveSeat();
                    case 4 -> cinema.getManageCinema().deleteReserve();
                    case 5 -> cinema.getManageCinema().deleteReservePerson();
                    case 0 -> {
                        System.out.print("Saliendo");
                        for (int i = 0;  i < 3; i++) {
                            try {
                                Thread.sleep(2000);
                            }catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                            System.out.print(".");
                        }
                        System.out.println();
                        return ;
                    }
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
