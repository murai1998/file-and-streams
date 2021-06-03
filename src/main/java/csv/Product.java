package csv;

import com.opencsv.bean.CsvBindByName;

public class Product {
    @CsvBindByName(column = "Id")
    private  String  id;
    @CsvBindByName(column = "Title")
    private String title;
    @CsvBindByName(column = "Category")
    private String category;
    @CsvBindByName(column = "Length")
    private String length;
    @CsvBindByName(column = "Stage Of Hair Loss")
    private String stageHairLoss;
    @CsvBindByName(column = "Price Range")
    private String priceRange;
    @CsvBindByName(column = "Texture")
    private String texture;
    @CsvBindByName(column = "Area Of Hair Loss")
    private String areaOfHairLoss;




    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public String getCategory() {
        return category;
    }

    public String getLength() {
        return length;
    }

    public String getStageHairLoss() {
        return stageHairLoss;
    }

    public String getPriceRange() {
        return priceRange;
    }



    public String getTexture() {
        return texture;
    }


    public String getAreaOfHairLoss() {
        return areaOfHairLoss;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", length='" + length + '\'' +
                ", stageHairLoss='" + stageHairLoss + '\'' +
                ", priceRange='" + priceRange + '\'' +
                ", areaOfHairLoss='" + areaOfHairLoss + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setStageHairLoss(String stageHairLoss) {
        this.stageHairLoss = stageHairLoss;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public void setAreaOfHairLoss(String areaOfHairLoss) {
        this.areaOfHairLoss = areaOfHairLoss;
    }
}
