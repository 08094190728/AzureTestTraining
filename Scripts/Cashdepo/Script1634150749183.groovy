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

WebUI.navigateToUrl('http://172.27.15.103:8097/login')

WebUI.setText(findTestObject('Object Repository/input_FCMB_form-control ie10f ng-untouched _6ed422'), 'temitope.olarewaju')

WebUI.setEncryptedText(findTestObject('Object Repository/input_FCMB_form-control ie10f ng-untouched _0d3afe'), '9pYaEUHIhYDutknkqAfauw==')

WebUI.setText(findTestObject('Object Repository/input_FCMB_form-control ie10f ng-untouched _0d3afe_1'), '10000')

WebUI.click(findTestObject('Object Repository/button_Login'))

WebUI.click(findTestObject('Object Repository/span_Deposits'))

WebUI.click(findTestObject('Object Repository/span_Cash Deposit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/input_Customer Information_form-control tex_9c86de'), '6425662026')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/i_Customer Information_fa fa-search'))

WebUI.setText(findTestObject('capturedobj/input_Amount_form-control input-lg text-uppercase ng-untouched ng-pristine ng-invalid'), 
    '2000')

WebUI.setText(findTestObject('capturedobj/input_Depositor First Name_form-control input-lg text-uppercase ng-untouched ng-pristine ng-invalid'), 
    'Alloy')

WebUI.setText(findTestObject('capturedobj/input_Depositor Last Name_form-control input-lg ng-untouched ng-pristine ng-valid'), 
    'Ade')

WebUI.setText(findTestObject('capturedobj/input_Enter Broker Code_form-control input-lg ng-untouched ng-pristine ng-invalid'), 
    '08094190728')

WebUI.setText(findTestObject('Object Repository/input_Amount_input-underline text-center fo_15d621'), '2')

WebUI.click(findTestObject('Object Repository/button_Post Transaction'))

WebUI.click(findTestObject('Object Repository/button_Confirm'))

WebUI.click(findTestObject('Object Repository/button_Print'))

WebUI.closeBrowser()

