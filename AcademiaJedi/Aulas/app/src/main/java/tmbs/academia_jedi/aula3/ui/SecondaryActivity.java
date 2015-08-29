package tmbs.academia_jedi.aula3.ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import tmbs.academia_jedi.aula3.R;
import tmbs.academia_jedi.aula3.utility.Constant;

public class SecondaryActivity extends AppCompatActivity {

    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        //Obtenção de parâmetro via Intent(Ex 1)
        Intent intent = getIntent();
        String user_name = intent.getStringExtra(Constant.EXTRA_USER_NAME);

        //Obtenção de parâmetro via Intent(Ex 2)
        // Bundle extras = getIntent().getExtras();
        //String user_name = (String) extras.get(Constant.EXTRA_USER_NAME);

        TextView textView = (TextView) findViewById(R.id.textView_secondary_activity_label);
        textView.setTextColor(Color.GREEN);
        textView.setText(String.format(getResources().getString(R.string.secondary_activity_label), user_name));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_secondary, menu);
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
