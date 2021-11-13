package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LengthOfSubUniqueChar 
{
	private int lengthOfSubstring(String s) {
		int max = 0;
		int count =0;
		boolean flag = false;
		for(int i=0;i<s.length();i++)
		{
			int j=i+1;
			if(j<s.length())
			{
				if(s.charAt(i)!=s.charAt(j))
				{
					flag = true;
					count++;
				}
				else
				{
					flag = false;
					count++;
					if(count>max)
					{
						max = count;
					}
					count=0;
				}
			}
		}
		if((flag==true)&&(count>=max))
		{
			count++;
			max = count;
		}
		return max;
	}
	@Test
	public void testCase1()
	{
		Assert.assertEquals(lengthOfSubstring("ababa"), 5);
	}
	@Test
	public void testCase2()
	{
		Assert.assertEquals(lengthOfSubstring("aac"), 2);
	}
	@Test
	public void testCase3()
	{
		Assert.assertEquals(lengthOfSubstring("abaavbg"),4);
	}

}
