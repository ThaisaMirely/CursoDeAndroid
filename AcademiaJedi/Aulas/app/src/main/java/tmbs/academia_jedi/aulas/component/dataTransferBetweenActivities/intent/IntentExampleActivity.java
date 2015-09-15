package tmbs.academia_jedi.aulas.component.dataTransferBetweenActivities.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.utility.Constant;

public class IntentExampleActivity extends AppCompatActivity {

    private EditText userNameEditText;
    private Button actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_example);

        userNameEditText = (EditText) findViewById(R.id.editText_user_name);
        actionButton = (Button) findViewById(R.id.button_ok);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message;
                if (!userNameEditText.getText().toString().trim().isEmpty()) {
                    message = String.format(getResources().getString(R.string.toast_message), userNameEditText.getText().toString());

                    //Passagem de parametro via intent(ex.1)
                    Intent intent = new Intent(IntentExampleActivity.this, IntentSecondActivity.class);
                    intent.putExtra(Constant.EXTRA_USER_NAME, userNameEditText.getText().toString());

                    //Inciando outra activity
                    IntentExampleActivity.this.startActivity(intent);

                } else {
                    message = getResources().getString(R.string.error_message_toast);
                }
                Toast.makeText(IntentExampleActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }

}
