import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class SelectMenuStepDefenition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User go to “select menu” page")
	def userGoToSelectMenuPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://demoqa.com/select-menu')
	}

	@When("User in “select menu” page")
	def userInSelectMenuPage() {
	}

	@And("User choose select value “Another root option”")
	def userChooseSelectValue_AnotherRootOption() {
		WebUI.click(findTestObject('Object Repository/Page_ToolsQA/svg_Select Option_css-19bqh2r'))
		WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Another root option'))
	}

	@And("User choose select one “Other”")
	def userChooseSelectOne_Other() {
		WebUI.click(findTestObject('Object Repository/Page_ToolsQA/svg_Select Title_css-19bqh2r'))
		WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Other'))
	}

	@And("User choose old style select menu “Aqua”")
	def userChooseOldStyleSelectMenu_Aqua() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ToolsQA/select_RedBlueGreenYellowPurpleBlackWhiteVo_537a50'),
				'10', true)
	}

	@And("User choose multi select drop down “all color”")
	def userChooseMultiSelectDropDown_AllColor() {
		WebUI.click(findTestObject('Object Repository/Page_ToolsQA/svg_Select_css-19bqh2r'))
		WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Green'))
		WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Blue'))
		WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Black'))
		WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Red'))
	}

	@Then("User success input all select menu")
	def userSuccessInputAllSelectMenu() {
		WebUI.delay(2)
		WebUI.closeBrowser()
	}
}