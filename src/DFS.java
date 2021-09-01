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
                new AppenderSetting(
                        null,
                        null,
                        null,
                        "拉拉拉阿")
                ,"A"
        ).execution();


        currencyFactory2.builder(
                new EditorSetting(
                        null,
                        null,
                        null,
                        null,
                        0,
                        "拉拉2")
                ,"B"
        ).execution();

    }

}
