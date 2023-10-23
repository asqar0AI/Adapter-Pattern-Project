import java.io.*;

import Adapter.ExpiredFormatReader;
import browser.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        Chrome one = new Chrome();
        System.out.println(one.getPasswords());
        
        InternetExplorer two = new InternetExplorer();
        System.out.println(two.getPasswords());
        
        ExpiredFormatReader tri = new ExpiredFormatReader(new InternetExplorer());
        System.out.println(tri.getPassword());
    }
}