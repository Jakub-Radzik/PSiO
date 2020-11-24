package training;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


public class Mailing {
    public static void main(String[] args) {
        String to = "jradzik4@gmail.com";
        String from = "260366@student.pwr.edu.pl";
        String host = "localhost";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

    }
}
