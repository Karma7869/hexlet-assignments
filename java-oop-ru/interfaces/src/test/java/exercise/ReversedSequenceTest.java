import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReversedSequenceTest {

    @Test
    public void testToString() {
        ReversedSequence seq = new ReversedSequence("Hello");
        assertEquals("olleH", seq.toString(), "toString() should return the reversed string.");
    }

    @Test
    public void testCharAt() {
        ReversedSequence seq = new ReversedSequence("Hello");
        assertEquals('o', seq.charAt(0), "charAt(0) should return 'o'.");
        assertEquals('H', seq.charAt(4), "charAt(4) should return 'H'.");
    }

    @Test
    public void testLength() {
        ReversedSequence seq = new ReversedSequence("Hello");
        assertEquals(5, seq.length(), "length() should return 5.");
    }

    @Test
    public void testSubSequence() {
        ReversedSequence seq = new ReversedSequence("Hello, World!");
        assertEquals("!dlroW", seq.subSequence(0, 6), "subSequence(0, 6) should return '!dlroW'.");
        assertEquals("dlroW", seq.subSequence(1, 6), "subSequence(1, 6) should return 'dlroW'.");
    }

    @Test
    public void testEmptyString() {
        ReversedSequence seq = new ReversedSequence("");
        assertEquals("", seq.toString(), "Reversed empty string should be an empty string.");
        assertEquals(0, seq.length(), "Length of an empty string should be 0.");
    }

    @Test
    public void testSingleCharacter() {
        ReversedSequence seq = new ReversedSequence("A");
        assertEquals("A", seq.toString(), "Reversed single character string should be the same.");
        assertEquals('A', seq.charAt(0), "charAt(0) should return 'A'.");
        assertEquals(1, seq.length(), "Length of a single character string should be 1.");
    }

    @Test
    public void testOutOfBoundsCharAt() {
        ReversedSequence seq = new ReversedSequence("Hello");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            seq.charAt(10);
        }, "charAt() should throw IndexOutOfBoundsException for an invalid index.");
    }

    @Test
    public void testOutOfBoundsSubSequence() {
        ReversedSequence seq = new ReversedSequence("Hello");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            seq.subSequence(0, 10);
        }, "subSequence() should throw IndexOutOfBoundsException for an invalid range.");
    }
}
