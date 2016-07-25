package com.ssa.ptboatgame;

public class PTBoat 

{
	int location;
	public boolean amIHit = false;

	public PTBoat(int location)
	{
		this.location = location;
	}
	public boolean amIHit(int column)
	{
		return(column == location);
	}

}
