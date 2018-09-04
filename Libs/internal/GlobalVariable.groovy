package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object UserName
     
    /**
     * <p></p>
     */
    public static Object Pwd
     
    /**
     * <p></p>
     */
    public static Object Path
     
    /**
     * <p></p>
     */
    public static Object File1
     
    /**
     * <p></p>
     */
    public static Object File2
     
    /**
     * <p></p>
     */
    public static Object File3
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['URL' : 'http://10.4.80.97:8080/ghlims/logon.jsp', 'UserName' : 'admin', 'Pwd' : 'admin', 'Path' : 'C:\\GH_LIMS_TESTDATA\\PDFfilepath.xlsx', 'File1' : 'C:\\GH_LIMS_TESTDATA\\finalreport\\', 'File2' : 'C:\\GH_LIMS_TESTDATA\\old report\\', 'File3' : 'C:\\GH_LIMS_TESTDATA\\differences pdf folder\\'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        URL = selectedVariables['URL']
        UserName = selectedVariables['UserName']
        Pwd = selectedVariables['Pwd']
        Path = selectedVariables['Path']
        File1 = selectedVariables['File1']
        File2 = selectedVariables['File2']
        File3 = selectedVariables['File3']
        
    }
}
