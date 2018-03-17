import static org.junit.Assert.*;

import org.junit.Test;

public class SimDieTest
{

//	@Test
//	public void test()
//	{
//		fail("Not yet implemented");
//	}
	
	@Test
	public void test_constructor()
	{
		int[] iArray = {1};
		
		SimDie d = new SimDie(iArray);
		
		d.roll();
		
		int result = d.getLastRoll();
		
		assertEquals("first roll is 1", 1,result);
	
	}

	@Test
	public void test_length_2_seq()
	{
		int[] iArray = {1,2}	;
		SimDie d = new SimDie(iArray);	
		d.roll();
		int result = d.getLastRoll();
		assertEquals(1,result);
		d.roll();
		assertEquals(2,d.getLastRoll());
		
	}
	
	@Test
	public void test_length_3_seq()
	{
		int[] iArray = {1,2,3}	;
		SimDie d = new SimDie(iArray);	
		d.roll();
		int result = d.getLastRoll();
		assertEquals(1,result);
		d.roll();
		assertEquals(2,d.getLastRoll());
		d.roll();
		assertEquals(3,d.getLastRoll());
		
	}
	
	@Test
	public void test_length_2_seq_3_rolls()
	{ 
		int[] iArray = {2,1}	;
		SimDie d = new SimDie(iArray);	
		d.roll();
		assertEquals(2,d.getLastRoll());
		d.roll();
		assertEquals(1,d.getLastRoll());
		d.roll();
		assertEquals(2,d.getLastRoll());
	}
	
	@Test(expected=RuntimeException.class)
	public void test_length_0_seq()
	{
		SimDie d = new SimDie(new int[] {});
		
	}
	 
	@Test
	public void test_length_3_seq_6_rolls()
	{ 
		int[] iArray = {1,2,3};
		SimDie d = new SimDie(iArray);	
		d.roll();
		assertEquals(1,d.getLastRoll());
		d.roll();
		assertEquals(2,d.getLastRoll());
		d.roll();
		assertEquals(3,d.getLastRoll());
		
		d.roll();
		assertEquals(1,d.getLastRoll());
		d.roll();
		assertEquals(2,d.getLastRoll());
		d.roll();
		assertEquals(3,d.getLastRoll());	
	}
	
	public static void main(String[] args)
	{
		
	}


}
