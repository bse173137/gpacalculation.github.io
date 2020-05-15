import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import junit.framework.Assert;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ass3grading.Ass3grading;
import static ass3grading.Ass3grading.marks;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameen Zahra
 */
@RunWith(Parameterized.class)
public class index {
    private int ass;
	private int mid ;
	private int finals;
	private String ExpResult;
      
                
        Ass3grading object;
	
	public index(String b,int a,int m,int f)
	{
		
		ExpResult=b;
                this.mid=m;
		this.ass=a;
		
		this.finals=f;
                
                
                
                
	}
	@Before
    public void setup()
    {
        object=new Ass3grading();
       
    }
	
	@Parameterized.Parameters
	public static Collection<Object[]> Testdata() throws BiffException, IOException, IllegalArgumentException
	{ 
		
			FileInputStream file;
			int j=0;
				file = new FileInputStream("test.xls");
				Workbook wbk = Workbook.getWorkbook(file);
				  Sheet sheet = wbk.getSheet(0);
				  Object Data[][] = new Object[sheet.getRows()][sheet.getColumns()];
				  for(int i=0;i<(sheet.getRows());i++)
				  {
				   String r=sheet.getCell(0,i).getContents();
				   int l=Integer.parseInt(sheet.getCell(1,i).getContents());
				   int ll=Integer.parseInt(sheet.getCell(2,i).getContents());
				   int lll=Integer.parseInt(sheet.getCell(3,i).getContents());
				    Data[i][0] = r;
				    Data[i][1] = l;
				   Data[i][2] = ll;
				  Data[i][3] = lll;
				    
				    
				  }
				    
			
			 return Arrays.asList(Data);
	    
	}
	
	@Test
	public void testgrades() {
      Assert.assertEquals(ExpResult,object.marks(ass,mid,finals));
      
	}

}