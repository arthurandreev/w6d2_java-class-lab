import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person passenger;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 20);
        passenger = new Person("Ronald McDonald");
    }

    @Test
    public void busHasDestination() {
        String destination = bus.getDestination();
        assertEquals("Ocean Terminal", destination);
    }

    @Test
    public void busHasCapacity() {
        int capacity = bus.getCapacity();
        assertEquals(20, capacity);
    }

    @Test
    public void busIsEmpty() {
        int passengers = bus.countPassengers();
        assertEquals(0, passengers);
    }

    @Test
    public void AddPassenger__BusNotFull() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void addPassenger__BusIsFull() {
        for (int i = 0; i<20; i++) {
            bus.addPassenger(passenger);
        }
        assertEquals(20, bus.countPassengers());
        bus.addPassenger(passenger);
        assertEquals(20, bus.countPassengers());
    }

    @Test
    public void removePassenger__passengerReturned() {
        bus.addPassenger(passenger);
        assertEquals(passenger, bus.removePassenger());
    }

    @Test
    public void removePassenger__passengerRemoved() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.countPassengers());
        bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void removePassenger__noPassengersLeft() {
        bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }
}

