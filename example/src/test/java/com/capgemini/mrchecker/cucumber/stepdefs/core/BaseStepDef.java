package com.capgemini.mrchecker.cucumber.stepdefs.core;

import com.capgemini.mrchecker.test.core.logger.BFLogger;

import cucumber.api.java.en.Given;
import io.qameta.allure.Step;

public class BaseStepDef {
	
	@Step("asdad")
	@Given("^I have (\\d+) cukes in my belly$")
	public void i_have_n_cukes_in_my_belly(int cukes) {
		BFLogger.logDebug("Cukes: " + cukes);
	}
}