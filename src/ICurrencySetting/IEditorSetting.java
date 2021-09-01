package ICurrencySetting;

import java.util.ArrayList;

public interface IEditorSetting extends ISetting{
    public ArrayList<String> targetCurrency = new ArrayList();
    public ArrayList<String> addOrSub = new ArrayList();
    public ArrayList<Integer> multi = new ArrayList();
    public ArrayList<Integer> div = new ArrayList();
    public int mathType = 0;
}
