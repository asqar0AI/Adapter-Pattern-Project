package Adapter;
import browser.*;

import java.io.IOException;

public class ExpiredFormatReader implements IFormatPassword
{
	private final InternetExplorer internetExplorer;
	public ExpiredFormatReader(InternetExplorer internetExplorer)
	{
		this.internetExplorer = internetExplorer;
	}
	@Override
	public String getPassword() throws IOException
	{
		String[] temp =  internetExplorer.getPasswords().split("\n");
		int len = temp.length;
		StringBuilder result = new StringBuilder("Website,Username,Password\n");
		for (int i = 0; i < len; i ++)
		{
			String[] split = temp[i].split(",");
			result.append(split[2]).append(",");
			result.append(split[0]).append(",");
			result.append(split[1]).append("\n");
		}
		return result.toString();
	}
}
