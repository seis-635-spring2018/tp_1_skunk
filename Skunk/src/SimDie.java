
public class SimDie
{
	private int[] seq;
	private int nextPos = 0;
	private int lastRoll;
	
	public SimDie(int[] arr)
	{
		if (arr.length == 0)
			throw new RuntimeException();
		
		seq = arr;
	}
	
	public void roll()
	{
		if (nextPos >= seq.length)
		{
			nextPos = 0;
		} 
		lastRoll = seq[nextPos];
		nextPos++;
		
		
	}
	
	public int getLastRoll()
	{
		return lastRoll;
	}
}
