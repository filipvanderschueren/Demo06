public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!!!! ");
        SomeClass s = new SomeClass();
        s.setMessage( "a changed Message" );
        System.out.println("Message from the ClassInstance : "+s.getMessage());
    }
}
