import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa121.aconex.com/')

WebUI.setText(findTestObject('Page_/input_Login Name_userName (1)'), 'poleary')

WebUI.setEncryptedText(findTestObject('Page_/input_Password_password (1)'), 'GU40p1m8Zsmy/VQiGrGLIA==')

WebUI.click(findTestObject('Page_/button_Log in (1)'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Documents'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Document Register'))

WebUI.setText(findTestObject('Object Repository/Page_Aconex/input_Date Range_searchQuery'), 'katalon_test_02')

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Search'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/input_Lock_selectedIdsInPage'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Transmit'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/a_Start a Workflow'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/input_Majestic Project  Constr'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/span_Mr Patrick OLearyMajestic'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Log off/button_Log in'))

WebUI.setText(findTestObject('Page_/input_Login Name_userName (1)'), 'ataylor')

WebUI.setEncryptedText(findTestObject('Page_/input_Password_password (1)'), 'GU40p1m8Zsmy/VQiGrGLIA==')

WebUI.click(findTestObject('Page_/button_Log in (1)'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Workflows'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Assigned to me'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/img'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/input_Date Due_selectedQueueId'))

WebUI.click(findTestObject('Page_Aconex/a_INSP-0003'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Aconex/select_--Select a Review Outco'), 'number:1', true)

WebUI.click(findTestObject('Object Repository/Page_Aconex/button_Submit Review'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/span_Mr Antony TaylorSplice Ar'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Log off/button_Log in'))

WebUI.setText(findTestObject('Page_/input_Login Name_userName (1)'), 'ftaylor')

WebUI.setEncryptedText(findTestObject('Page_/input_Password_password (1)'), 'GU40p1m8Zsmy/VQiGrGLIA==')

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Workflows'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Assigned to me'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/img'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/a_INSP-0003_1'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/span_2_annotTool glyphicons ve'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_No valid pages specified_p'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_No valid pages specified_p'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Aconex/select_--Select a Review Outco'), 'number:2', true)

WebUI.setText(findTestObject('Object Repository/Page_Aconex/textarea_You_auiField-input la'), 'ac1')

WebUI.click(findTestObject('Object Repository/Page_Aconex/button_Submit Review'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/span_Mrs Felicity TaylorLife B'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Log off/button_Log in'))

WebUI.setText(findTestObject('Page_/input_Login Name_userName (1)'), 'poleary')

WebUI.setEncryptedText(findTestObject('Page_/input_Password_password (1)'), 'GU40p1m8Zsmy/VQiGrGLIA==')

WebUI.click(findTestObject('Page_/button_Log in (1)'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Workflows'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/div_Assigned to me'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/img'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/td_INSP-0003'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/a_INSP-0003_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Aconex/select_--Select a Review Outco'), 'number:1', true)

WebUI.click(findTestObject('Object Repository/Page_Aconex/button_Submit Review'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/span_Mr Patrick OLearyMajestic'))

WebUI.click(findTestObject('Object Repository/Page_Aconex/a_Logout'))

