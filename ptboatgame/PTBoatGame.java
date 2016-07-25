package com.ssa.ptboatgame;

public class PTBoatGame
{
	private PTBoat[] boats = new PTBoat[6];
	private int numberOfBoats = 0;

	public void addBoat(int location)
	{
		boats[numberOfBoats] = new PTBoat(location);
		numberOfBoats++;
	}
	public boolean guess(int location)
	{ 
		for(int i = 0; i < boats.length; i++)
		{
			if(boats[i].location == location)   
			{
				return true;
			}

		}
		return false;
	}
	public static void main(String[] args)
	{
		PTBoatGame game1 = new PTBoatGame();
		game1.addBoat(4);
		
		if (game1.guess(3))
		{  
			System.out.println("Hit");
		}
		else
		{
			System.out.println("Miss");
		}
	
	}
	
	








	//	private static PTBoat[] ptBoats;
	//	private static int numberOfBoats = 0; //value is zero b/c havent told comp to make any boats yet
	//
	//
	//	public static void main(String[] args)
	//	{
	//		for(int i = 0; i < 6; i++)
	//		{
	//			PTBoat aNewBoat = new PTBoat(i, false);//makes boat...adding boat in scope of "for" loop
	//			ptBoats[i] = aNewBoat;
	//			numberOfBoats++;
	//		}




}






