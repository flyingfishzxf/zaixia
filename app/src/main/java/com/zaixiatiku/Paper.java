package com.zaixiatiku;

public class Paper {
    private String title;

    private String subTitle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Paper(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }
}
