package tmbs.academia_jedi.aulas.component.dataTransferBetweenActivities.bundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.component.dataTransferBetweenActivities.intent.IntentSecondActivity;
import tmbs.academia_jedi.aulas.utility.Constant;

public class BundleExampleActivity extends AppCompatActivity {

    private EditText userNameBundleEditText;
    private Button actionBundleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_example);

        userNameBundleEditText = (EditText) findViewById(R.id.editText_user_name);
        actionBundleButton = (Button) findViewById(R.id.button_ok);


        actionBundleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message;
                if (!userNameBundleEditText.getText().toString().trim().isEmpty()) {
                    message = String.format(getResources().getString(R.string.toast_message), userNameBundleEditText.getText().toString());

                    Intent intent = new Intent(BundleExampleActivity.this, BundleSecondActivity.class);

                    Bundle extras = new Bundle();
                    extras.putString(Constant.EXTRA_USER_NAME, userNameBundleEditText.getText().toString());
                    intent.putExtras(extras);

                    //Inciando outra activity
                    BundleExampleActivity.this.startActivity(intent);

                } else {
                    message = getResources().getString(R.string.error_message_toast);
                }
                Toast.makeText(BundleExampleActivity.this, message, Toast.LENGTH_LONG).show();


            }
        });
    }

}
