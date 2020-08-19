import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringDisemvowelTest {
    @Test
    public void checkIfTheMethodRemovesVowelsFromTheGivenString() {
        assertEquals("Ths wbst s fr lsrs LL!",StringDisemvowel.disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", StringDisemvowel.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", StringDisemvowel.disemvowel("What are you, a communist?"));
    }

}