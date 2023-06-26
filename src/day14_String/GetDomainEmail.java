package day14_String;

public class GetDomainEmail {
    public static void main(String[] args) {

        String email="Cydeo.School@yahoo.com";
        System.out.println("email = " + email);
        email=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        System.out.println("email = " + email);

    }
}
