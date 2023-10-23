package Adapter;
import browser.*;

import java.io.IOException;


/**
 * Adapter class for change password file format
 */
public class ExpiredFormatReader implements IFormatPassword
{
	private final InternetExplorer internetExplorer;
	public ExpiredFormatReader(InternetExplorer internetExplorer)
	{
		this.internetExplorer = internetExplorer;
	}
	
	/**
	 * Converts old data format into modern one
	 * @return Auth data converted to modern format
	 */
	@Override
	public String getPassword() throws IOException
	{
		String[] temp =  internetExplorer.getPasswords().split("\n");
		StringBuilder result = new StringBuilder("Website,Username,Password\n");
		for (String s : temp)
		{
			String[] split = s.split(",");
			result.append(split[2]).append(",");
			result.append(split[0]).append(",");
			result.append(split[1]).append("\n");
		}
		return result.toString();
	}
}
