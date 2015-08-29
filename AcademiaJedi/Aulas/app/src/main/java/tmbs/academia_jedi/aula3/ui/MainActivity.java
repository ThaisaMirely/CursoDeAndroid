package tmbs.academia_jedi.aula3.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import tmbs.academia_jedi.aula3.R;
import tmbs.academia_jedi.aula3.utility.Constant;

public class MainActivity extends AppCompatActivity {

    TextView labelName_Text;
    EditText userName_EditText;
    Button action_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labelName_Text = (TextView) findViewById(R.id.label);
        userName_EditText = (EditText) findViewById(R.id.editText_user_name);
        action_Button = (Button) findViewById(R.id.button_ok);


        action_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message;
                if (!userName_EditText.getText().toString().trim().isEmpty()) {
                    message = String.format(getResources().getString(R.string.toast_message), userName_EditText.getText().toString());

                    //Passagem de parametro via intent(ex.1)
                    Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                    intent.putExtra(Constant.EXTRA_USER_NAME, userName_EditText.getText().toString());

                    //Passagem de parametro via intent(ex.2)
                    //Bundle extras = new Bundle();
                    //extras.putString(Constant.EXTRA_USER_NAME, userName_EditText.getText().toString());
                    //intent.putExtras(extras);

                    //Inciando outra activity
                    MainActivity.this.startActivity(intent);

                } else {
                    message = getResources().getString(R.string.error_message_toast);
                }
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
