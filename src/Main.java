import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person("Jan", "Dendermonde", "042");
        Person person2=new Person("Tom", "Temse", "044");
        Person fakePerson1=new Person("Dirk", "Gent", "045");
        byte[] person1Bytes=person1.getBytes();
        byte[] person2ytes=person2.getBytes();
        byte[] fakePerson1Bytes=fakePerson1.getBytes();

        

      }
    }
