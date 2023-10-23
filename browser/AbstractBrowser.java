package browser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public abstract class AbstractBrowser implements IBrowserPassword
{
	protected BufferedReader reader;
	protected String version, name, engine, filePath;
	
	public AbstractBrowser()
	{
		this.version = "1";
		this.name = "Unknown Browser";
		this.version = "Chromium";
		this.filePath = "browser/password/EmptyPasswordStorage";
		try
		{
			this.reader = new BufferedReader(new FileReader(filePath));
		}
		catch (FileNotFoundException e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public String getPasswords() throws IOException
	{
		StringBuilder passwords = new StringBuilder();
		
		String line;
		
		while ((line = reader.readLine()) != null) {
			passwords.append(line).append("\n");
		}
		return passwords.toString();
		
	}
}
