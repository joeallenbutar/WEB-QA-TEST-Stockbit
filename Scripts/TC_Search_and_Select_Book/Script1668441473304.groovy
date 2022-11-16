import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/books')

WebUI.setText(findTestObject('Page_ToolsQA/input_Book Store API_searchBox'), 'Git Pocket Guide')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Title'))

WebUI.click(findTestObject('Page_ToolsQA/div_Git Pocket Guide'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Author'))

WebUI.click(findTestObject('Page_ToolsQA/div_Richard E. Silverman'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Publisher'))

WebUI.click(findTestObject('Page_ToolsQA/div_OReilly Media'))

WebUI.click(findTestObject('Page_ToolsQA/a_Git Pocket Guide'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Title'))

WebUI.click(findTestObject('Page_ToolsQA/label_Git Pocket Guide'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Author'))

WebUI.click(findTestObject('Page_ToolsQA/label_Richard E. Silverman'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Publisher'))

WebUI.click(findTestObject('Page_ToolsQA/label_OReilly Media'))

