package com.bluewhale.testscript;
import com.bluewhale.generic.BaseClass;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class ProjectModule extends BaseClass {
	@Test
	public void createProject() {
		Reporter.log("createProject",true);
	}
	@Test
	public void modifyProject() {
		Reporter.log("modifyProject",true);
	}
	@Test
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}
}
