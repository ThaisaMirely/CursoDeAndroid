package tmbs.academia_jedi.aulas.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.model.Site;

/**
 * Created by thaisamirely on 9/9/15.
 */
public class SecondListViewAdapter extends ArrayAdapter<Site> {

    private ArrayList<Site> items;
    private Context context;
    public SecondListViewAdapter(Context context, int resource, ArrayList<Site> items) {
        super(context, resource, items);
        this.items = items;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_second_listview, parent, false);

        Site item = items.get(position);

        TextView titleView = (TextView) rowView.findViewById(R.id.textView_name);
        titleView.setText(item.getName());

        TextView descriptionView = (TextView) rowView.findViewById(R.id.textView_site);
        descriptionView.setText(item.getUrl());

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView_icon);
        imageView.setImageResource(item.getImage());

        return rowView;
    }

}
