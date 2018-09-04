
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.util.Map

import com.kms.katalon.core.testobject.TestObject


def static "pdf.XcelWriter.writeData"(
    	String path	
     , 	java.util.Map<String, java.lang.Boolean> map	
     , 	int listSize	) {
    (new pdf.XcelWriter()).writeData(
        	path
         , 	map
         , 	listSize)
}

def static "lims.KW_Class.login"(
    	String userName	
     , 	String pswd	) {
    (new lims.KW_Class()).login(
        	userName
         , 	pswd)
}

def static "pdf.ComparePDF.comparePDFFile"(
    	String inputFile1	
     , 	String inputFile2	
     , 	String outputFile	) {
    (new pdf.ComparePDF()).comparePDFFile(
        	inputFile1
         , 	inputFile2
         , 	outputFile)
}

def static "lims.GH_Keywords.clickWithJS"(
    	TestObject to	) {
    (new lims.GH_Keywords()).clickWithJS(
        	to)
}

def static "lims.GH_Keywords.writeSpreadSheet"(
    	String path	
     , 	String status	
     , 	String AccessingNumber	) {
    (new lims.GH_Keywords()).writeSpreadSheet(
        	path
         , 	status
         , 	AccessingNumber)
}

def static "lims.GH_Keywords.writeSpreadSheetXLSX"(
    	String path	
     , 	String result	) {
    (new lims.GH_Keywords()).writeSpreadSheetXLSX(
        	path
         , 	result)
}

def static "lims.GH_Keywords.createRandom"() {
    (new lims.GH_Keywords()).createRandom()
}

def static "pdf.XcelReader.readData"(
    	String path	) {
    (new pdf.XcelReader()).readData(
        	path)
}
