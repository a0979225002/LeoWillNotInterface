import CurrencySetting.AppenderSetting;
import CurrencySetting.EditorSetting;
import Factory.CurrencyFactory;
import ICurrencySetting.IAppenderSetting;
import ICurrencySetting.IEditorSetting;

public class DFS {

    public static void main(String[] args) {

        CurrencyFactory<IAppenderSetting> currencyFactory = new CurrencyFactory();
        CurrencyFactory<IEditorSetting> currencyFactory2 = new CurrencyFactory();

        currencyFactory.builder(
                new AppenderSetting()
                        .setCopyBy(null)
                        .setNewCurrency(null)
                        .setRatio(null)
                        .setPath("./Appender")
        ).execution();


        currencyFactory2.builder(
                new EditorSetting()
                        .setAddOrSub(null)
                        .setDiv(null)
                        .setMulti(null)
                        .setTargetCurrency(null)
                        .setMathType(100)
                        .setPath("./Editor")
        ).execution();
    }
}
