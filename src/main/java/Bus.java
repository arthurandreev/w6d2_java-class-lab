import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countPassengers() {
        return passengers.size();
    }

    public void addPassenger(Person passenger) {
        if (countPassengers() < this.capacity) {
            this.passengers.add(passenger);
        }
    }

    public Person removePassenger() {
        if (countPassengers() > 0) {
            return passengers.remove(0);
        }
        return null;
    }
}
