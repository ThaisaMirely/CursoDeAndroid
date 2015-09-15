package tmbs.academia_jedi.aulas.utility;

import java.util.ArrayList;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.model.Site;

/**
 * Created by thaisamirely on 9/9/15.
 */
public class Util {


    public static ArrayList<Site> popularAdapter() {
        ArrayList<Site> siteList = new ArrayList<>();
        siteList.add(new Site("Amazon", "http://amazon.com.br/", R.drawable.amazon_icon));
        siteList.add(new Site("Apple", "http://www.apple.com/", R.drawable.apple_icon));
        siteList.add(new Site("Behance", "https://www.behance.net/", R.drawable.behance_icon));
        siteList.add(new Site("Blogger", "https://www.blogger.com", R.drawable.blogger_icon));
        siteList.add(new Site("Dropbox", "https://www.dropbox.com/", R.drawable.dropbox_icon));
        siteList.add(new Site("Facebook", "https://www.facebook.com/", R.drawable.facebook_icon));
        siteList.add(new Site("Flickr", "https://www.flickr.com/", R.drawable.flickr_icon));

        return siteList;
    }
}
