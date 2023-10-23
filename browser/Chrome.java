package browser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Chrome extends AbstractBrowser
{
	public Chrome()
	{
		super();
		version = "118.0.5993.71";
		name = "Chrome";
		engine = "Chromium";
		filePath = "browser/password/chrome-passwords.csv";
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
