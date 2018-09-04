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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class XcelReader {

	@Keyword
	public List<String> readData(String path) throws IOException, InvalidFormatException {
		FileInputStream fis = null;
		XSSFWorkbook wb = null;

		XSSFSheet s = null;
		XSSFRow r = null;
		XSSFCell c = null;
		XSSFCell c1 = null;

		List<String> excelVal = new ArrayList<String>();
		File f = new File(path);

		try {

			fis = new FileInputStream(f);
		} catch (Exception e) {
		}

		try {
			wb = new XSSFWorkbook(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		s = wb.getSheetAt(0);
		int rowCount = s.getLastRowNum();

		for(int i=1;i<rowCount+1;i++){
			String rowValue = "";
			r = s.getRow(i);
			for (int j = 0; j < 3; j++) {
				//r.getLastCellNum()
				c =  r.getCell(j);
				String cellValue =c.getStringCellValue();
				rowValue = rowValue+cellValue+ "~";
			}
			fis.close();
			excelVal.add(rowValue);
		}
		return excelVal;
	}
}
