package tmbs.academia_jedi.aulas.component.dataTransferBetweenActivities.bundle;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.utility.Constant;

public class BundleSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_second);

        //Obtenção de parâmetro via Intent(Ex 1)
        Bundle extras = getIntent().getExtras();
        String user_name = (String) extras.get(Constant.EXTRA_USER_NAME);

        TextView textView = (TextView) findViewById(R.id.textView_bundle_secondary_activity);
        textView.setTextColor(Color.GREEN);
        textView.setText(String.format(getResources().getString(R.string.bundle_secondary_activity), user_name));
    }


}
