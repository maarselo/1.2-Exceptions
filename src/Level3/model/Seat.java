package Level3.model;

import java.util.Objects;

public class Seat {
    private int row;
    private int number;
    private String person;

    public Seat(int row, int number, String person) {
        this.row = row;
        this.number = number;
        this.person = person;
    }

                                                                                                                                                                                                                                                                                                                                                                public int getRow() {return row;}
    public int getNumber() {return number;}
    public String getPerson() {return person;}
    public void setRow(int row) {this.row = row;}
    public void setNumber(int number) {this.number = number;}
    public void setPerson(String person) {this.person = person;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Seat seat = (Seat) o;
        return row == seat.row && number == seat.number;
    }
    @Override
    public int hashCode() {
        return Objects.hash(row, number);
    }
    @Override
    public String toString() {
        return "Seat{" + "row=" + row + ", number=" + number + ", person='" + person + '\'' + '}';
    }
}
