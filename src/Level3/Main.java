package Level3;

import Level3.model.Cinema;
import Level3.view.MenuManager;

public class Main {
    public static void main(String []args) {
        Cinema cinema = new Cinema();
        MenuManager menuManager = new MenuManager(cinema);
        menuManager.run();
    }
}
