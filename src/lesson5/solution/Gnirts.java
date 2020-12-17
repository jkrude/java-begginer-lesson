package lesson5.solution;

public class Gnirts implements CharSequence {

    private char[] value;

    public Gnirts(String input) {
        value = new char[input.length()];
        for (int i = 0; i < value.length; ++i) {
            value[(value.length - 1) - i] = input
                .charAt(i); // value.length -1 because we count from 0
        }
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int i) {
        return value[i];
    }

    @Override
    public CharSequence subSequence(int from, int to) {
        return new String(value, from, to);
    }
}
