import ca.pragra.framework.data.ExcelDataProvider;
import org.testng.annotations.DataProvider;

import java.util.Iterator;

public class LoginDataProvider {
    @DataProvider(name= "loginProvider")
    public Iterator<Object []> getLoginData(){
        ExcelDataProvider dataProvider = new ExcelDataProvider();
    return dataProvider.getData("Login").iterator();
    }
}
