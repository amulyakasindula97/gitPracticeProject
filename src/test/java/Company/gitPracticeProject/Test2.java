package Company.gitPracticeProject;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void firstTest() {
		System.out.println("hello ");
		assertTrue(false, "Test is Failed...!");
	}

}
