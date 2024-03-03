package com.temp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusTest {

    @Test
    void shouldCreateBusWithAllEmptySeats() {
        Bus myBus = new Bus(24);
        assertEquals(24, myBus.getNumberOfEmptySeats());
        assertEquals(0, myBus.getTotalTicketAmount());
    }

//    @Test
//    void shouldBoardPersonWithNameAndIdAndTicketAmountAndSeatNumber (){
//        Bus myBus = new Bus (24);
//        myBus.boardPassenger("ST01","Sachin","Tendulkar","01","100");
//
//    }
}
