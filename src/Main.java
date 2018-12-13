import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class Main {
    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static void main(String[] args) {
        Person person1=new Person("Jan", "Dendermonde", "042");
        Person person2=new Person("Tom", "Temse", "044");
        Person fakePerson1=new Person("Jon", "Dendermonde", "042");
        byte[] person1Bytes=person1.getBytes();
        byte[] person2Bytes=person2.getBytes();
        byte[] fakePerson1Bytes=fakePerson1.getBytes();


        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] hashPerson1 = digest.digest(person1Bytes);
        byte[] hashFakePerson1 = digest.digest(fakePerson1Bytes);

        System.out.println(bytesToHex(hashPerson1));
        System.out.println(bytesToHex(hashFakePerson1));

    }
}
