package tmbs.academia_jedi.aulas.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.component.dataTransferBetweenActivities.ChooseTransactionActivity;
import tmbs.academia_jedi.aulas.ui.component.googleActivityLifecycle.ActivityA;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button dialogAction;
    Button intentAction;
    Button lifeCycleAction;
    Button initMenuListViewAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        intentAction = (Button) findViewById(R.id.button_intent);
        lifeCycleAction = (Button) findViewById(R.id.button_life_cycle);
        initMenuListViewAction = (Button) findViewById(R.id.button_listview);

        dialogAction = (Button) findViewById(R.id.button_dialog);

        //Implementação ação Button com utilização de implementação da interface Listener (ex 1)
        intentAction.setOnClickListener(this);
        lifeCycleAction.setOnClickListener(this);
        initMenuListViewAction.setOnClickListener(this);

        //Implementação - ação via implementação interna da interface Listener (ex 2)
        dialogAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GroupingDialogActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });


    }


    //Implementação ação Button com utilização de implementação da interface Listener (ex 1)
    @Override
    public void onClick(View v) {

        Class nextActivity = null;

        switch (v.getId()) {
            case R.id.button_intent:
                nextActivity = ChooseTransactionActivity.class;
                break;
            case R.id.button_life_cycle:
                nextActivity = ActivityA.class;
                break;
            case R.id.button_listview:
                nextActivity = ManagerListViewActivity.class;
                break;
            default:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.label_toast_chose_activity), Toast.LENGTH_SHORT).show();
        }

        if (nextActivity != null) {
            Intent intent = new Intent(MainActivity.this, nextActivity);
            MainActivity.this.startActivity(intent);
        }
    }

    //Implementacao - ação Button via onClick xml (ex 3)
    public void onClickFragmentAndTab(View view) {
        if (view.getId() == (R.id.button_fragments_and_tabs)) {
            Intent intent = new Intent(MainActivity.this, FragmentAndTabsActivity.class);
            MainActivity.this.startActivity(intent);
        }
    }


}
