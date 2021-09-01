package CurrencySetting;

import ICurrencySetting.IEditorSetting;

import java.util.ArrayList;

public class EditorSetting implements IEditorSetting {


    private ArrayList<String> targetCurrency;
    private ArrayList<String> addOrSub;
    private ArrayList<Integer> multi;
    private ArrayList<Integer> div;
    private int mathType;
    private String path;

    public EditorSetting(
            ArrayList<String> targetCurrency,
            ArrayList<String> addOrSub,
            ArrayList<Integer> multi,
            ArrayList<Integer> div,
            int mathType,
            String path){

        this.targetCurrency = targetCurrency;
        this.addOrSub = addOrSub;
        this.multi = multi;
        this.div = div;
        this.mathType = mathType;
        this.path = path;
    }

    public ArrayList<String> getTargetCurrency() {
        return targetCurrency;
    }

    public ArrayList<String> getAddOrSub() {
        return addOrSub;
    }

    public ArrayList<Integer> getMulti() {
        return multi;
    }

    public ArrayList<Integer> getDiv() {
        return div;
    }

    public int getMathType() {
        return mathType;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "EditorSetting{" +
                "targetCurrency=" + targetCurrency +
                ", addOrSub=" + addOrSub +
                ", multi=" + multi +
                ", div=" + div +
                ", mathType=" + mathType +
                ", path='" + path + '\'' +
                '}';
    }
}
