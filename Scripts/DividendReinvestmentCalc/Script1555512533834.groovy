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
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://calc.crafton.ocweb.team/dividend-reinvestment/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://calc.crafton.ocweb.team/dividend-reinvestment/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://calc.crafton.ocweb.team/dividend-reinvestment/')

selenium.click('id=initialNumberOfShares')

selenium.type('id=initialNumberOfShares', '200')

selenium.click('id=initialPriceOfShares')

selenium.type('id=initialPriceOfShares', '234')

selenium.click('id=annualDividend')

selenium.type('id=annualDividend', '23432')

selenium.click('id=dividendAnnualGrowthRate')

selenium.type('id=dividendAnnualGrowthRate', '43')

selenium.click('id=stockPriceAnnualGrowthRate')

selenium.type('id=stockPriceAnnualGrowthRate', '23')

selenium.click('id=numberOfYears')

selenium.type('id=numberOfYears', '3')

selenium.click('id=numOfReinvestmentPerYear')

selenium.select('id=numOfReinvestmentPerYear', 'label=3')

selenium.click('id=dividend-reinvestment-calculate')

selenium.click('name=s')

WebUI.takeScreenshot('/Users/sthokala/Documents/DRCalculator.png')

selenium.close()

