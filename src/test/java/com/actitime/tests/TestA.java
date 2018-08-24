package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class TestA {
	@Test
	public void create()
	{
		Reporter.log("create",true);
	}
	@Test
	public void delete()
	{
		Reporter.log("delete",true);
	}

}
