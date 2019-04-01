package Assignment6;

import java.util.ArrayList;

public class NEw implements INews {
    int ID;
    String title,PublishDate,Author,Content;
    Float AvarageRate;
    Float[] RateList = new Float[3];
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    @Override
    public void Display() {
        System.out.println("title's new: " + this.title + ".  Publish-Date is: " + this.PublishDate);
        System.out.println("Athor: " + this.Author);
        System.out.println("content: "+ this.Content);
        System.out.println("AverageRate: " + this.AvarageRate);
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Float getAvarageRate() {
        return AvarageRate;
    }

    void  Calculate(){
        float sum = 0;

        for (int i = 0; i< RateList.length;i++)
            AvarageRate =sum/RateList.length;
    }


}
