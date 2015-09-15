package tmbs.academia_jedi.aulas.model;

/**
 * Created by thaisamirely on 9/9/15.
 */
public class Site {

    public String name;
    public String url;
    public int image;

    public Site(String name, String url, int image) {
        this.name = name;
        this.url = url;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
