package Factory;

import Currency.Appender;
import Currency.Editor;
import ICurrency.IDoCurrency;
import ICurrencySetting.IAppenderSetting;
import ICurrencySetting.IEditorSetting;
import ICurrencySetting.ISetting;

public class CurrencyFactory<T extends ISetting> {

    public IDoCurrency builder(T setting) {
        IDoCurrency doCurrency;
        switch (setting.getTAG()) {
            case APPENDER:
                doCurrency = new Appender((IAppenderSetting) setting);
                break;
            case EDITOR:
                doCurrency = new Editor((IEditorSetting) setting);
                break;
            default:
                return null;
        }
        return doCurrency;
    }
}
