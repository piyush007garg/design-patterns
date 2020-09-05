import com.qa.factorydesign.GoogleFactory;
import com.qa.factorydesign.GooglePage;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    private GooglePage googlePage;

    @Test
    public void serachTest(String language , String keywords){
    this.googlePage = GoogleFactory.get(language,this.driver);
    googlePage.launchUrl();
    googlePage.search(keywords);
    int resultCount=googlePage.getResultCount();
    System.out.println(resultCount);

    }


    public Object[][] getData(){
        return new Object[][]{
                {"ENG","Selenium"},
                {"MARATHI","docker"}
        };
     }


}
