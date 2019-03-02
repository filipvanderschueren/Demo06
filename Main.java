public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!!!! ");
        SomeClass s = new SomeClass();
        s.setMessage( "newMessage" );
        System.out.println("Message from the ClassInstance : "+s.getMessage());
    }
}
