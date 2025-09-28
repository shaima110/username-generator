public class UsernameGenerator {
    public static void main(String[] args) {
        long number = (long)(Math.random() * 1_000_000_0000L); // random up to 10 digits
        String username = "TR" + String.format("%010d", number); // always pad with 0s
        System.out.println("UserName: "+username);
    }
}
