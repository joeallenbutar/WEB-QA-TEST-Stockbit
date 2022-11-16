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

class SearchBookStepDefenition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User go to “book store” page")
	def userGoToBookStorePage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://demoqa.com/books')
	}

	@When("User in “Book Store” page")
	def userInBookStorePage() {
	}

	@And("User search book (.*)")
	def userSearchBook(String title) {
		WebUI.setText(findTestObject('Page_ToolsQA/input_Book Store API_searchBox'), title)
	}

	@And("User see “No rows found”")
	def userSee_NoRowsFound() {
		WebUI.delay(2)
		WebUI.closeBrowser()
	}

	@And("User click book “Git Pocket Guide”")
	def userClickBookName() {
		WebUI.click(findTestObject('Page_ToolsQA/a_Git Pocket Guide'))
	}

	@Then("User see “Git Pocket Guide”")
	def userSeeBookDetail() {
		WebUI.delay(2)
		WebUI.closeBrowser()
	}
}