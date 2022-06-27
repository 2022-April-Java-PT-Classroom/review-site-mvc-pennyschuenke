package org.wecancoeit.reviews;

public class Review {

    public Long id;
    public String title;
    public String description;
    public String imageUrl;



    public Long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){return description;}
    public String getImageUrl(){
        return imageUrl;
    }



    public Review(Long id, String title,String description, String imageUrl) {
        this.id=id;
        this.title=title;
        this.description=description;
        this.imageUrl=imageUrl;
    }

}
