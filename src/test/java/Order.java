import crimearent.precondition.Precondition;
import org.testng.annotations.Test;


public class Order extends Precondition {
    



    @Test()
    public void jenkinsFirstPage() throws Exception {

        String varCityOne = "Алушта";
        String varCityTwo = "Бахчисарай";

        String varTimeTake = "22.08.2018";
        String varTimeReturn = "23.08.2018";

        String varTimeOne = "00:00";
        String varTimeTwo= "00:00";

        String varPromoCode= "0";




        mainPage.enterTakeAndReturnCityDataTimePromocodeSubmit(varCityOne,varCityTwo,varTimeTake,varTimeReturn
                ,varTimeOne, varTimeTwo, varPromoCode);

        Thread.sleep(8000);

    }
}
