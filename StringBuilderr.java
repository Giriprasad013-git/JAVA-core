public class StringBuilderr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" Hi");
        sb.replace(0, 5, "Hi");
        sb.reverse();
        sb.capacity();
        System.out.println(sb.capacity());
    }
    // not thread safe
    // we can call the two threads symaltaniously
// append(String str): Adds the string representation of a specified object to the end of this instance.
// append(char c): Appends a single character to the end of this instance.
// insert(int index, String str): Inserts the string representation of a specified object into this instance at a specified position.
// delete(int start, int end): Removes the characters in a substring of this instance.
// reverse(): Reverses the order of characters in this instance.
// toString(): Returns a string representation of this instance.
// length(): Returns the length (character count) of this instance.
// capacity(): Returns the current capacity of this instance.
// setLength(int newLength): Sets the length of this instance.
// charAt(int index): Returns the character at a specified position in this instance.
// substring(int start): Returns a new string that is a substring of this instance.
// substring(int start, int end): Returns a new string that is a substring of this instance.
// replace(int start, int end, String str): Replaces all characters in a substring of this instance with characters in a specified string.
}
