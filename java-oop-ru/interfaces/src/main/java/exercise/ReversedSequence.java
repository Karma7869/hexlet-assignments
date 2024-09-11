package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String reversedString;

    public ReversedSequence(String input) {
        this.reversedString = new StringBuilder(input).reverse().toString();
    }

    @Override
    public char charAt(int index) {
        return reversedString.charAt(index);
    }

    @Override
    public int length() {
        return reversedString.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reversedString.subSequence(start, end);
    }

    @Override
    public String toString() {
        return reversedString;
    }
}
// END
