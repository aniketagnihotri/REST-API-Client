package org.yelpapiinterface.springbootstarter.sample;

public class SampleObject {

    private String id;
    private String name;
    private boolean is_closed;
    private int review_count;

    public SampleObject() {
    }

    public SampleObject(String id, String name, boolean is_closed, int review_count) {
        this.id = id;
        this.name = name;
        this.is_closed = is_closed;
        this.review_count = review_count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIs_closed() {
        return is_closed;
    }

    public void setIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
    }

    public int getReview_count() {
        return review_count;
    }

    public void setReview_count(int review_count) {
        this.review_count = review_count;
    }

}
