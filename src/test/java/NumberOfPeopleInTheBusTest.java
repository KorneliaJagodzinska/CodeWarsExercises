import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfPeopleInTheBusTest {

    NumberOfPeopleInTheBus numberOfPeopleInTheBus= new NumberOfPeopleInTheBus();

    @Test
    public void checkTheCorrectNumberOfPeopleInTheBus() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, numberOfPeopleInTheBus.countPassengers(list));
    }

}