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

WebUI.openBrowser('https://wealthyretirement.com/dividend-reinvestment-calculator/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://wealthyretirement.com/dividend-reinvestment-calculator/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://wealthyretirement.com/dividend-reinvestment-calculator/")
selenium.click("id=initialNumberOfShares")
selenium.type("id=initialNumberOfShares", "300")
selenium.click("id=initialPriceOfShares")
selenium.type("id=initialPriceOfShares", "200")
selenium.click("id=annualDividend")
selenium.type("id=annualDividend", "30,000")
selenium.click("id=dividendAnnualGrowthRate")
selenium.type("id=dividendAnnualGrowthRate", "4")
selenium.click("id=stockPriceAnnualGrowthRate")
selenium.type("id=stockPriceAnnualGrowthRate", "5")
selenium.click("id=numberOfYears")
selenium.type("id=numberOfYears", "2")
selenium.click("id=numOfReinvestmentPerYear")
selenium.select("id=numOfReinvestmentPerYear", "label=3")
selenium.click("id=dividend-reinvestment-calculate")
//selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Calculator Results'])[1]/following::th[2]")
WebUI.takeScreenshot("/Users/sthokala/Documents/ProdDRCalculator.png")
selenium.close()

