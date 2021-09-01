package CurrencySetting;

import ICurrencySetting.IAppenderSetting;
import java.util.ArrayList;

public class AppenderSetting implements IAppenderSetting {

    private ArrayList<String> copyBy;
    private ArrayList<String> newCurrency;
    private ArrayList<Integer> ratio;
    private String path;

    public AppenderSetting(ArrayList<String> copyBy, ArrayList<String> newCurrency, ArrayList<Integer> ratio, String path){
        this.copyBy = copyBy;
        this.newCurrency = newCurrency;
        this.ratio = ratio;
        this.path = path;
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

    @Override
    public String toString() {
        return "AppenderSetting{" +
                "copyBy=" + copyBy +
                ", newCurrency=" + newCurrency +
                ", ratio=" + ratio +
                ", path='" + path + '\'' +
                '}';
    }
}
