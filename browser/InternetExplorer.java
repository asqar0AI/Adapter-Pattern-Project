package browser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InternetExplorer extends AbstractBrowser
{
	public InternetExplorer()
	{
		super();
		version = "11";
		name = "Internet Explorer";
		engine = "Trident";
		filePath = "browser/password/internet-explorer-passwords.txt";
		try
		{
			this.reader = new BufferedReader(new FileReader(filePath));
		}
		catch (FileNotFoundException e)
		{
			throw new RuntimeException(e);
		}
	}
	
}
