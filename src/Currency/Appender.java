package Currency;

import ICurrency.IDoCurrency;
import ICurrencySetting.IAppenderSetting;

public class Appender implements IDoCurrency {

    private final IAppenderSetting setting;

    public Appender(IAppenderSetting setting) {
        this.setting = setting;
    }

    @Override
    public void execution() {
        System.out.println("執行Appender");
        System.out.println(this.setting.toString());
    }
}
