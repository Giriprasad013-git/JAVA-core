public class StringBuilderr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" Hi");
    }
    // not thread safe
    // we can call the two threads symaltaniously

}
