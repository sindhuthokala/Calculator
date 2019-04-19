import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://calc.crafton.ocweb.team/mutual-fund/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://calc.crafton.ocweb.team/mutual-fund/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://calc.crafton.ocweb.team/mutual-fund/")
selenium.click("id=years")
selenium.type("id=years", "45")
selenium.click("id=rateOfReturn")
selenium.type("id=rateOfReturn", "5")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rate of Return:'])[1]/following::div[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rate of Return:'])[1]/following::div[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Rate of Return:'])[1]/following::div[2]")
selenium.type("id=initialInvestment", "500000")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Initial Investment:'])[1]/following::div[2]")
selenium.type("id=annualInvestments", "2000")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Annual Investments:'])[1]/following::div[2]")
selenium.type("id=inflationRate", "2")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Inflation Rate:'])[1]/following::div[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Inflation Rate:'])[1]/following::label[1]")
selenium.type("id=taxRate", "34")
selenium.click("id=investment-return-calculate")
selenium.click("name=s")

WebUI.takeScreenshot("/Users/sthokala/Documents/MFCalculator.png")
WebUI.closeBrowser()