package android.com.musicalstructureapp;

/**
 * Created by czare on 17.04.2018.
 */

public class DataModel {
    String name;
    String type;
    String feature;

    public DataModel(String name, String type, String feature) {
        this.name = name;
        this.type = type;
        this.feature = feature;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getFeature() {
        return feature;
    }

}
