package model;

/**
 * @Charlie Dolphin charl - cpdolphin
 * CIS175 - Fall 2021
 * Sep 8, 2022
 */
public class Basketball {

	boolean isOpen;
	String name;
	
	public Basketball()
	{
		
	}
	
	public Basketball(String name, boolean open)
	{
		setName(name);
		setOpen(open);
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean Shoot()
	{
		boolean madeShot = false;
		if (isOpen() == true)
		{
			madeShot = true;
			return madeShot;
		}
		return madeShot;
	}
	
	public String printResult()
	{
		String result = "";
		if (this.isOpen() == false)
		{
			result = name + " has missed the contested shot!";
			return result;
		}
		result = name + " has made the open shot!";
		return result;
	}
}
