package com.temp;

public class Bus {

    private int totalTicketAmount;
    private int seatCapacity;
    private int numberOfEmptySeats;

    public int getNumberOfEmptySeats() {
        return numberOfEmptySeats;
    }

    public int getTotalTicketAmount() {
        return totalTicketAmount;
    }

    public Bus(int seatCapacity) {
        this.seatCapacity = seatCapacity;
        numberOfEmptySeats = seatCapacity;
        totalTicketAmount = 0;
    }
}
