package com.moringa.employees;

public class NewAsset {

    String assetName;
    String postField;
    String numOfAssets;

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getPostField() {
        return postField;
    }

    public void setPostField(String postField) {
        this.postField = postField;
    }

    public String getNumOfAssets() {
        return numOfAssets;
    }

    public void setNumOfAssets(String numOfAssets) {
        this.numOfAssets = numOfAssets;
    }

    public NewAsset(String assetName, String postField, String numOfAssets) {
        this.assetName = assetName;
        this.postField = postField;
        this.numOfAssets = numOfAssets;
    }
}
