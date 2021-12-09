
public class PowerOfTwo {
	
	public boolean isPowerOfTwo(int x)
	{
		boolean result = false;
		
		if (x == 0)
		{
            return result;
		}
		
        while (x != 1) 
        {
            if (x % 2 != 0)
            {
                return result;
            }
            
            x = x / 2;
        }
        
		result = true;
        
		return result;
	}
}
