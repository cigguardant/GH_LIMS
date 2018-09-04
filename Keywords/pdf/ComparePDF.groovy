package pdf

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import de.redsix.pdfcompare.PdfComparator
import java.io.File;


import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class ComparePDF {

	boolean isEquals = false;



	@Keyword
	public boolean comparePDFFile(String inputFile1, String inputFile2, String outputFile) throws Exception {

		String file1 = GlobalVariable.File1;
		String file2 = GlobalVariable.File2;
		String file3 = GlobalVariable.File3;

		isEquals = new PdfComparator("C:\\GH_LIMS_TESTDATA\\finalreport\\A27433_AMENDED_report.pdf"," C:\\GH_LIMS_TESTDATA\\old report\\Guardant360-A27433-v2-Amended.pdf").compare().writeTo("C:\\GH_LIMS_TESTDATA\\differences pdf folder\\A27433-v2_Differences");
		//		isEquals = new PdfComparator(file1+inputFile1, file2+inputFile2).compare().writeTo(file3+outputFile);

		return isEquals;
	}
}
