package CurrencySetting;

import ICurrencySetting.IAppenderSetting;
import java.util.ArrayList;
import Enum.CurrencyType;

public class AppenderSetting implements IAppenderSetting {

    private ArrayList<String> copyBy;
    private ArrayList<String> newCurrency;
    private ArrayList<Integer> ratio;
    private String path;
    private final CurrencyType TAG;

    public AppenderSetting(){
        this.TAG = CurrencyType.APPENDER;
    }

    public AppenderSetting setCopyBy(ArrayList<String> copyBy) {
        this.copyBy = copyBy;
        return this;
    }

    public AppenderSetting setNewCurrency(ArrayList<String> newCurrency) {
        this.newCurrency = newCurrency;
        return this;
    }

    public AppenderSetting setRatio(ArrayList<Integer> ratio) {
        this.ratio = ratio;
        return this;
    }

    public AppenderSetting setPath(String path) {
        this.path = path;
        return this;
    }

    public ArrayList<String> getCopyBy() {
        return copyBy;
    }

    public ArrayList<String> getNewCurrency() {
        return newCurrency;
    }

    public ArrayList<Integer> getRatio() {
        return ratio;
    }

    public String getPath() {
        return path;
    }

    public CurrencyType getTAG() {
        return TAG;
    }

    @Override
    public String toString() {
        return "AppenderSetting{" +
                "copyBy=" + copyBy +
                ", newCurrency=" + newCurrency +
                ", ratio=" + ratio +
                ", path='" + path + '\'' +
                ", TAG='" + TAG + '\'' +
                '}';
    }
}
