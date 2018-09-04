import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/DE1_Suite')

suiteProperties.put('name', 'DE1_Suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Guardant_LIMS\\GH_LIMS\\Reports\\DE1_Suite\\20180904_134341\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/DE1_Suite', suiteProperties, [new TestCaseBinding('Test Cases/lims/Login', 'Test Cases/lims/Login',  [ 'url' : 'http://10.4.80.97:8080/ghlims/logon.jsp' , 'pswd' : 'admin' , 'userName' : 'admin' ,  ]), new TestCaseBinding('Test Cases/lims/Create_AccessionID', 'Test Cases/lims/Create_AccessionID',  [ 'tracking' : '458543' , 'Page' : '2' , 'PhyName' : 'sqa' , 'icdcode2' : '422' , 'icdcode1' : '321' , 'trfversion' : '455126' , 'Date' : '08/22/18' , 'FilePath' : 'C:\\GH_LIMS_TESTDATA\\test.pdf' ,  ]), new TestCaseBinding('Test Cases/lims/Logoff', 'Test Cases/lims/Logoff',  null)])
