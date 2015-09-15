package tmbs.academia_jedi.aulas.ui.component.listView;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import tmbs.academia_jedi.aulas.R;

public class FirstListViewActivity extends Activity implements SearchView.OnQueryTextListener {

    private ListView mListView;
    private ArrayAdapter mArrayAdapter;
    private ArrayList<String> mArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_listview);

        mListView = (ListView) findViewById(R.id.first_listView);
        //é inicalizado um array de string. Cada item presente nesse array será um item na listView
        String[] values = new String[]{"Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile"};

        //adiciona os itens do array de string a um ArrayList
        mArrayList = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            mArrayList.add(values[i]);
        }
        //o mArrayAdapter é inicializado com o layout da mListView(simple_list_item_1) e seus dados(mArrayList)
        mArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mArrayList);

        // o adaptador(mArrayAdapter) é atribuído ao litview
        mListView.setAdapter(mArrayAdapter);

        //afim de criar ações em cada item selecionado é criado o setOnItemClickListener, que manipulará as posições de
        //cada item da lista.
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(FirstListViewActivity.this, "Você selecionou o sistema operacional " + mArrayAdapter.getItem(position).toString(), Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
