package tmbs.academia_jedi.aulas.component.dataTransferBetweenActivities.intent;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.utility.Constant;

public class IntentSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        //Obtenção de parâmetro via Intent(Ex 1)
        Intent intent = getIntent();
        String user_name = intent.getStringExtra(Constant.EXTRA_USER_NAME);

        TextView textView = (TextView) findViewById(R.id.textView_secondary_activity_label);
        textView.setTextColor(Color.BLUE);
        textView.setText(String.format(getResources().getString(R.string.intent_secondary_activity), user_name));

    }

}


