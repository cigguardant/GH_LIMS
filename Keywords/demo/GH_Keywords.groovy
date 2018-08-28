package demo

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
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import internal.GlobalVariable

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class GH_Keywords {

	@Keyword
	def writeSpreadSheet(String path,String status,String AccessingNumber) {
		try {
			FileInputStream file = new FileInputStream (new File(path))
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			if(AccessingNumber==""){
				sheet.getRow(1).createCell(12).setCellValue("Accessioning not Created")
				sheet.getRow(1).createCell(13).setCellValue(status)
			}
			else{
				sheet.getRow(1).createCell(12).setCellValue(AccessingNumber)
				sheet.getRow(1).createCell(13).setCellValue(status)
			}
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File(path))
			workbook.write(outFile)
			outFile.close()
			//			KeywordUtil.logInfo("Wait for Element Present")
			//			KeywordUtil.markPassed("Element has been clicked")

		}  catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}


	@Keyword
	def writeSpreadSheetXLSX(String path,String result) {
		try {
			File f = new File(path);
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook  wb = new XSSFWorkbook(fis);
			XSSFSheet s = wb.getSheetAt(1);
			s.getRow(1).createCell(1).setCellValue(result);

			FileOutputStream outFile =new FileOutputStream(new File(path));
			wb.write(outFile);
			outFile.close();
			//			KeywordUtil.logInfo("Wait for Element Present")
			//			KeywordUtil.markPassed("Element has been clicked")

		}  catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
}
