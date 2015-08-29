package tmbs.academia_jedi.aula3.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import tmbs.academia_jedi.aula3.R;
import tmbs.academia_jedi.aula3.ui.component.FragmentAndTabsActivity;

public class ManagerActivity extends AppCompatActivity implements View.OnClickListener {

    Button intentAction;
    Button dialogAction;
    Button fragmentAndTabsAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        intentAction = (Button) findViewById(R.id.button_intent);
        dialogAction = (Button) findViewById(R.id.button_dialog);

        //Implementação ação Button com utilização de implementação da interface Listener (ex 1)
        intentAction.setOnClickListener(this);

        //Implementação - ação via implementação interna da interface Listener (ex 2)
        dialogAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagerActivity.this, GroupingDialogActivity.class);
                ManagerActivity.this.startActivity(intent);
            }
        });


    }


    //Implementação ação Button com utilização de implementação da interface Listener (ex 1)
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_intent) {
            Intent intent = new Intent(ManagerActivity.this, MainActivity.class);
            ManagerActivity.this.startActivity(intent);
        } else {
            Toast.makeText(ManagerActivity.this, getResources().getString(R.string.label_toast_chose_activity), Toast.LENGTH_SHORT).show();

        }

    }

    //Implementacao - ação Button via onClick xml (ex 3)
    public void onClickFragmentAndTab(View view) {
        if (view.getId() == (R.id.button_fragments_and_tabs)) {
            Intent intent = new Intent(ManagerActivity.this, FragmentAndTabsActivity.class);
            ManagerActivity.this.startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_manager, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
