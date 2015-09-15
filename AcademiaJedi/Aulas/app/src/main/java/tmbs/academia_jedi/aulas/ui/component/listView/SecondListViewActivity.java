package tmbs.academia_jedi.aulas.ui.component.listView;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.ui.adapter.SecondListViewAdapter;
import tmbs.academia_jedi.aulas.utility.Util;

public class SecondListViewActivity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_listview);

        SecondListViewAdapter customAdapter = new SecondListViewAdapter(this, R.layout.item_second_listview, Util.popularAdapter());
        setListAdapter(customAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Toast.makeText(SecondListViewActivity.this, "Acesse " + Util.popularAdapter().get(position).getUrl(), Toast.LENGTH_LONG).show();

    }

}
