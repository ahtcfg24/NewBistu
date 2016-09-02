package org.iflab.ibistubydreamfactory.models;

import java.util.List;

/**
 *
 */
public class NewsDetail extends BaseRecord {
    private String title;
    private String time;
    private String article;
    private List<ImgListBean> imgList;

    public NewsDetail() {
    }

    public NewsDetail(String title, String time, String article, List<ImgListBean> imgList) {
        this.title = title;
        this.time = time;
        this.article = article;
        this.imgList = imgList;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public List<ImgListBean> getImgList() {
        return imgList;
    }

    public void setImgList(List<ImgListBean> imgList) {
        this.imgList = imgList;
    }

    public static class ImgListBean {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    @Override
    public String toString() {
        return "NewsDetail{" +
                "title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", article='" + article + '\'' +
                ", imgList=" + imgList +
                '}';
    }
}
