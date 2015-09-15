package tmbs.academia_jedi.aulas.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.ui.component.listView.FirstListViewActivity;
import tmbs.academia_jedi.aulas.ui.component.listView.SecondListViewActivity;

public class ManagerListViewActivity extends Activity implements View.OnClickListener {

    private Button simpleListViewAction;
    private Button customListViewAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        simpleListViewAction = (Button) findViewById(R.id.button_first_listview);
        customListViewAction = (Button) findViewById(R.id.button_second_listview);

        simpleListViewAction.setOnClickListener(this);
        customListViewAction.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Class nextAction = null;

        switch (v.getId()) {
            case R.id.button_first_listview:
                nextAction = FirstListViewActivity.class;
                break;
            case R.id.button_second_listview:
                nextAction = SecondListViewActivity.class;
                break;
            default:
                Toast.makeText(ManagerListViewActivity.this, getResources().getString(R.string.label_toast_chose_activity), Toast.LENGTH_SHORT).show();
        }

        if (nextAction != null) {
            Intent intent = new Intent(ManagerListViewActivity.this, nextAction);
            ManagerListViewActivity.this.startActivity(intent);
        }
    }
}
