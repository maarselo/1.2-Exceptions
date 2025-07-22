package Level3.model;

import Level3.utils.Input;
import Level3.services.ManageSeats;
import Level3.services.ManageCinema;
import Level3.utils.Input;

public class Cinema {
    private int rows;
    private int seatsPerRow;
    private ManageSeats manageSeats;
    private ManageCinema manageCinema;

    public Cinema (){
        requestInitialData();
        manageSeats = new ManageSeats();
        manageCinema = new ManageCinema(this);
    }

    public void requestInitialData(){
        this.rows = Input.readInt("How many rows your cinema have (max.50/ min.1): ", 50);
        this.seatsPerRow = Input.readInt("How many seats does a row have (max.50/min.1): ", 50);
    }

    public int getRows() {return rows;}
    public int getSeatsPerRow() {return seatsPerRow;}
    public ManageSeats getManageSeats() {return manageSeats;}
    public ManageCinema getManageCinema() {return manageCinema;}
    public void setRows(int rows) {this.rows = rows;}
    public void setSeatsPerRow(int seatsPerRow) {this.seatsPerRow = seatsPerRow;}
    public void setManageSeats(ManageSeats manageSeats) {this.manageSeats = manageSeats;}
    public void setManageCinema(ManageCinema manageCinema) {this.manageCinema = manageCinema;}
}
