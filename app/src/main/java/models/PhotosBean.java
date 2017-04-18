package models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shalakhaverma on 17/04/2017.
 */

public class PhotosBean implements Serializable {
    /**
     * height : 910
     * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/115212688446356792868/photos\">Dinah&#39;s Garden Hotel Palo Alto<\/a>"]
     * photo_reference : CoQBdwAAAHo-HLlO3Bk9Z_Pf2pVcLaHxrELAREl4gsSYW6MI1hH_jbeT_KAPSS0TPNhuejERTk_CLsfu2kBr1MOcnV6oGb6saP7ZeUv8Pzc9byvnrg7jzi20AjIB5cAB9p6dJpFu4p-YPEGQcJrEZisoPwQDI2CpCLWDjXrshEit5Z8LsEDLEhA7eGE3acaZPDQyL8doWJWiGhRi6C1EMPVxUoC-zx6-hsHfZid4Sw
     * width : 909
     */

    private int height;
    private String photo_reference;
    private int width;
    private List<String> html_attributions;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPhoto_reference() {
        return photo_reference;
    }

    public void setPhoto_reference(String photo_reference) {
        this.photo_reference = photo_reference;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public List<String> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<String> html_attributions) {
        this.html_attributions = html_attributions;
    }
}
