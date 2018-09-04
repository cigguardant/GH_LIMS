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
import de.redsix.pdfcompare.PdfComparator;

//	XcelReader xr = new XcelReader();
//	XcelWriter xr1 = new XcelWriter();
	
Map<String,Boolean> mapFinal = new HashMap<String,Boolean>();

	List<String> excelValues = CustomKeywords.'pdf.XcelReader.readData'(GlobalVariable.Path);

		List<String> excelVal2 = excelValues;

for (int i = 0; i < excelValues.size(); i++) {

	String[] col1DatatArray = excelValues.get(i).split("~");
//	boolean flag = new PDFComparator().comparePDF(col1DatatArray[0], col1DatatArray[1], col1DatatArray[2]);
	boolean flag = CustomKeywords.'pdf.ComparePDF.comparePDFFile'(col1DatatArray[0], col1DatatArray[1], col1DatatArray[2]);
//	boolean flag = CustomKeywords.'pdf.ComparePDF.comparePDF'();
	
	System.out.println(flag);
	System.out.println("completed !");

	mapFinal.put(col1DatatArray[0], flag);
	if (!flag) {
		System.out.println("Differences found! in PDF files " + col1DatatArray[0] + "," + col1DatatArray[1]
				+ ", Please refer the file " + col1DatatArray[2]);
	} else {
		System.out.println("Similar PDF files    " + col1DatatArray[0] + ",   " + col1DatatArray[1]);
	}

}

//xr = null;

System.out.println(mapFinal.toString());
	CustomKeywords.'pdf.XcelWriter.writeData'(GlobalVariable.Path, mapFinal, mapFinal.size());