package ICurrencySetting;
import Enum.CurrencyType;
public interface ISetting {
    CurrencyType TAG = null;
    String path = "";
    CurrencyType getTAG();
}
