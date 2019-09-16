package com.jenkins.assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Addition {

	@Test
	public static void regressionTest() {
		
     App add=new App();
     
     Assert.assertEquals(add.addition(2, 6),8, "Failed");
		
	}
	
} 