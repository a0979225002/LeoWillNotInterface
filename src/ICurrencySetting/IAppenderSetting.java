package ICurrencySetting;

import java.util.ArrayList;

public interface IAppenderSetting extends ISetting{
    public ArrayList<String> copyBy = new ArrayList();
    public ArrayList<String> newCurrency = new ArrayList();
    public ArrayList<Integer> ratio = new ArrayList();
}
