public class Horsebarn
{
	private Horse[] horses;
	public Horsebarn(Horse[] horses)
	{
		this.horses=horses;
	}
	public int findHorseSpace(String name)
	{
		for(int i=0;i<horses.length;i++)
		{
			if(horses[i]!=null && name.equals(horses[i].getName()))
				return i;
		}
		return -1;
	}
	
	public void consolidate()
	{
		Horse[]newSpaces=new Horse[horses.length];
		int nextSpot=0;
		for(Horse nextHorse: horses)
		{
			if(nextHorse != null)
			{
				newSpaces[nextSpot] = nextHorse;
				nextSpot++;
			}
		}
		horses=newSpaces;
	}
}