package CurrencySetting;

import ICurrencySetting.IEditorSetting;
import java.util.ArrayList;
import Enum.CurrencyType;

public class EditorSetting implements IEditorSetting {


    private ArrayList<String> targetCurrency;
    private ArrayList<String> addOrSub;
    private ArrayList<Integer> multi;
    private ArrayList<Integer> div;
    private int mathType;
    private String path;
    private final CurrencyType TAG;

    public EditorSetting(){
        this.TAG = CurrencyType.EDITOR;
    }

    public EditorSetting setTargetCurrency(ArrayList<String> targetCurrency) {
        this.targetCurrency = targetCurrency;
        return this;
    }

    public EditorSetting setAddOrSub(ArrayList<String> addOrSub) {
        this.addOrSub = addOrSub;
        return this;
    }

    public EditorSetting setMulti(ArrayList<Integer> multi) {
        this.multi = multi;
        return this;
    }

    public EditorSetting setDiv(ArrayList<Integer> div) {
        this.div = div;
        return this;
    }

    public EditorSetting setMathType(int mathType) {
        this.mathType = mathType;
        return this;
    }

    public EditorSetting setPath(String path) {
        this.path = path;
        return this;
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

    public CurrencyType getTAG() {
        return TAG;
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
                ", TAG='" + TAG + '\'' +
                '}';
    }
}
