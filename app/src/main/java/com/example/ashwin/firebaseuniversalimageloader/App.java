package com.example.ashwin.firebaseuniversalimageloader;

/**
 * Created by ashwin on 12/9/16.
 */

public class App {

    private String title, subTitle, callToActionText, appImage, appLogo;

    public App() {
    }

    public App(String title, String subTitle, String callToAction, String appImageUrl, String appLogoUrl) {
        this.title = title;
        this.subTitle = subTitle;
        this.appImage = appImageUrl;
        this.appLogo = appLogoUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subTitle;
    }

    public void setSubtitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getAppimage() {
        return appImage;
    }

    public void setAppimage(String appImageUrl) {
        this.appImage = appImageUrl;
    }

    public String getCalltoactiontext() {
        return callToActionText;
    }

    public void setCalltoactiontext(String callToActionText) {
        this.callToActionText = callToActionText;
    }

    public String getApplogo() {
        return appLogo;
    }

    public void setApplogo(String appLogoUrl) {
        this.appLogo = appLogoUrl;
    }

}