package Currency;

import ICurrency.IDoCurrency;
import ICurrencySetting.IEditorSetting;

public class Editor implements IDoCurrency {

    private final IEditorSetting setting;

    public Editor(IEditorSetting setting) {
        this.setting = setting;
    }

    @Override
    public void execution() {
        System.out.println("執行Editor");
        System.out.println(this.setting.toString());
    }
}
