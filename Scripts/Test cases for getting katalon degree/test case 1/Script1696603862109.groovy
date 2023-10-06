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

WebUI.navigateToUrl('https://cms.demo.katalon.com/')

WebUI.click(findTestObject('Object Repository/Page_Katalon Shop  Katalon Ecommerce/a_My account'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My account  Katalon Shop/h2_Recent Posts'), 0)

WebUI.click(findTestObject('Object Repository/Page_My account  Katalon Shop/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_My account  Katalon Shop/a_Sample Page'))

WebUI.rightClick(findTestObject('Object Repository/Page_Sample Page  Katalon Shop/a_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Sample Page  Katalon Shop/blockquote_Hi there Im a bike messenger by _996985'))

WebUI.rightClick(findTestObject('Object Repository/Page_Sample Page  Katalon Shop/p_Hi there Im a bike messenger by day, aspi_ed905b'))

WebUI.click(findTestObject('Object Repository/Page_Sample Page  Katalon Shop/p_This is an example page. Its different fr_b854e3'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sample Page  Katalon Shop/h1_Sample Page'), 'Sample Page')

WebUI.closeBrowser()

