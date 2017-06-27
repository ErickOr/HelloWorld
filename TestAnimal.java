
import farmsans.FarmAnimal;
import java.util.Date;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;


public class TestAnimal {
    @Test
    public void TestAnimal() {
        try{
            int expectedId=1;
            int actualId=0;
            String expectedName="Vaca Juan";
            String actualName="";
            Date expectedDate=new Date(116,10,20);
            Date actualDate=null;
            FarmAnimal cow1=new FarmAnimal();
            
            cow1.setId(1);
            actualId= cow1.getId();
            
            cow1.setNombre("Vaca Juan");
            actualName= cow1.getNombre();
            
            cow1.setBornOn(new Date(116,10,20));
            actualDate= cow1.getBornOn();
            
            assertEquals(expectedId, actualId);
            System.out.println("Id  1 test passed");
            
            assertEquals(expectedName, actualName);
            System.out.println("Name 1 test passed");
            
            assertEquals(expectedDate, actualDate);
            System.out.println("Date  1 test passed");
            
        }catch(IndexOutOfBoundsException success){
            System.err.println("Id test Not passed"+success.getMessage());
        }
        
        try{
            int expectedId=2;
            int actualId=0;
            String expectedName="Vaca Pepito";
            String actualName="";
            Date expectedDate=new Date(116,10,21);
            Date actualDate=null;
            FarmAnimal cow2=new FarmAnimal();
            
            cow2.setId(2);
            actualId= cow2.getId();
            
            cow2.setNombre("Vaca Pepito");
            actualName= cow2.getNombre();
            
            cow2.setBornOn(new Date(116,10,21));
            actualDate= cow2.getBornOn();
            
            assertEquals(expectedId, actualId);
            System.out.println("Id 2 test passed");
            
            assertEquals(expectedName, actualName);
            System.out.println("Name 2 test passed");
            
            assertEquals(expectedDate, actualDate);
            System.out.println("Date 2  test passed");
            
        }catch(IndexOutOfBoundsException success){
            System.err.println("Id test Not passed"+success.getMessage());
        }
        try{
            int expectedId=3;
            int actualId=0;
            String expectedName="Vaca Pocoyo";
            String actualName="";
            Date expectedDate=new Date(116,10,22);
            Date actualDate=null;
            FarmAnimal cow3=new FarmAnimal();
            
            cow3.setId(3);
            actualId= cow3.getId();
            
            cow3.setNombre("Vaca Pocoyo");
            actualName= cow3.getNombre();
            
            cow3.setBornOn(new Date(116,10,22));
            actualDate= cow3.getBornOn();
            
            assertEquals(expectedId, actualId);
            System.out.println("Id 3 test passed");
            
            assertEquals(expectedName, actualName);
            System.out.println("Name 3 test passed");
            
            assertEquals(expectedDate, actualDate);
            System.out.println("Date 3 test passed");
            
        }catch(IndexOutOfBoundsException success){
            System.err.println("Id test Not passed"+success.getMessage());
        }
        try{
            int expectedId=4;
            int actualId=0;
            String expectedName="Vaca omar";
            String actualName="";
            Date expectedDate=new Date(116,10,23);
            Date actualDate=null;
            FarmAnimal cow4=new FarmAnimal();
            
            cow4.setId(4);
            actualId= cow4.getId();
            
            cow4.setNombre("Vaca omar");
            actualName= cow4.getNombre();
            
            cow4.setBornOn(new Date(116,10,23));
            actualDate= cow4.getBornOn();
            
            assertEquals(expectedId, actualId);
            System.out.println("Id 4 test passed");
            
            assertEquals(expectedName, actualName);
            System.out.println("Name 4 test passed");
            
            assertEquals(expectedDate, actualDate);
            System.out.println("Date 4 test passed");
            
        }catch(IndexOutOfBoundsException success){
            System.err.println("Id test Not passed"+success.getMessage());
        }
        try{
            int expectedId=5;
            int actualId=0;
            String expectedName="Vaca luis";
            String actualName="";
            Date expectedDate=new Date(116,10,24);
            Date actualDate=null;
            FarmAnimal cow5=new FarmAnimal();
            
            cow5.setId(5);
            actualId= cow5.getId();
            
            cow5.setNombre("Vaca luis");
            actualName= cow5.getNombre();
            
            cow5.setBornOn(new Date(116,10,24));
            actualDate= cow5.getBornOn();
            
            assertEquals(expectedId, actualId);
            System.out.println("Id 5 test passed");
            
            assertEquals(expectedName, actualName);
            System.out.println("Name 5 test passed");
            
            assertEquals(expectedDate, actualDate);
            System.out.println("Date 5 test passed");
            
        }catch(IndexOutOfBoundsException success){
            System.err.println("Id test Not passed"+success.getMessage());
        }
    }
}
