public class StringBufferr {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" Hi");
        System.out.println(sb);
        // thread safe
        // we can't call the two threads symaltaniously
        // String buffer is less efficient then the string builder
    }
}
