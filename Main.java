import java.io.*;

import Adapter.ExpiredFormatReader;
import browser.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        // Chrome passwords
        Chrome one = new Chrome();
        System.out.println(one.getPasswords());
        
        // InternetExplorer passwords
        InternetExplorer two = new InternetExplorer();
        System.out.println(two.getPasswords());
        
        // InternetExplorer passwords passed through adapter
        ExpiredFormatReader tri = new ExpiredFormatReader(new InternetExplorer());
        System.out.println(tri.getPassword());
    }
}