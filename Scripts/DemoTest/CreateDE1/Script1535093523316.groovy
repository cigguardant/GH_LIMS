import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

try {
		WebUI.takeScreenshot()
		Random rnd = new Random()
		int number = rnd.nextInt(999999)
		strbarcode = String.format("%06d", number)
		WebUI.click(findTestObject('Object Repository/Page_Iteration/td_Accession Clinical'))
		WebUI.setText(findTestObject('Object Repository/Page_Iteration/input_trfbarcode'), strbarcode)
		WebUI.setText(findTestObject('Object Repository/Page_Iteration/input_trfversion'), trfversion)
		WebUI.setText(findTestObject('Object Repository/Page_Iteration/input_trackingno'), tracking)
		WebUI.setText(findTestObject('Object Repository/Page_Iteration/input_tubebarcode01'), strbarcode)
		WebUI.setText(findTestObject('Object Repository/Page_Iteration/input_tubebarcode02'), strbarcode)
		WebUI.setText(findTestObject('Object Repository/Page_Iteration/input_noofpages'), Page)
		WebUI.setText(findTestObject('Object Repository/Page_Iteration/a_21'),'Date')
		WebUI.click(findTestObject('Object Repository/Page_Iteration/input_searchbutton'))
		WebUI.switchToWindowIndex(1)
		WebUI.setText(findTestObject('Object Repository/Page_/input_firstnamesrch'), PhyName)
		WebUI.click(findTestObject('Object Repository/Page_/input_Search'))
		WebUI.click(findTestObject('Object Repository/Page_/Physician_checkbox'))
		WebUI.switchToWindowIndex(0)
		WebUI.setText(findTestObject('Object Repository/Page_Iteration/input_icdcode01'),icdcode1)
		WebUI.setText(findTestObject('Object Repository/Page_Iteration/input_icdcode02'), icdcode2)
		WebUI.click(findTestObject('Object Repository/Page_Iteration/input_saveAccession01'))
		WebUI.switchToWindowIndex(1)
		//WebUI.delay(10)
		WebUI.waitForElementPresent('Object Repository/Page_/Upload', 10)
		WebUI.uploadFile(findTestObject('Object Repository/Page_/Upload'), FilePath)
		WebUI.waitForElementPresent('Object Repository/Page_Iteration/AccesingCode', 10)
		AccessingNumber = WebUI.getText(findTestObject('Object Repository/Page_Iteration/AccesingCode'))
		println(AccessingNumber)
		WebUI.click(findTestObject('Object Repository/Page_/submitbtn'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Page_/closewindowBtn'))
		WebUI.switchToWindowIndex(0)
		WebUI.click(findTestObject('Object Repository/Page_/Logoff'))
		
		//WebUI.delay(5)
		
		
}
catch (Exception e) {
    println('Exception Occured' + e)
} 
finally { 
	//WebUI.closeBrowser()
}

