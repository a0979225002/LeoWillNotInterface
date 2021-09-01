package Factory;

import Currency.Appender;
import Currency.Editor;
import ICurrency.IDoCurrency;
import ICurrencySetting.IAppenderSetting;
import ICurrencySetting.IEditorSetting;
import ICurrencySetting.ISetting;

public class CurrencyFactory<T extends ISetting> {

    private T setting;

    public IDoCurrency builder(T setting,String TAG) {

        this.setting = setting;
        IDoCurrency doCurrency;

        switch (TAG) {
            case "A":
                doCurrency = new Appender((IAppenderSetting) setting);
                break;
            case "B":
                doCurrency = new Editor((IEditorSetting) setting);
                break;
            default:
                return null;
        }
        return doCurrency;
    }
}
