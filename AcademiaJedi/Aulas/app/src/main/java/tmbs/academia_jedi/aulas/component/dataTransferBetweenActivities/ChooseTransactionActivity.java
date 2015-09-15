package tmbs.academia_jedi.aulas.component.dataTransferBetweenActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.component.dataTransferBetweenActivities.bundle.BundleExampleActivity;
import tmbs.academia_jedi.aulas.component.dataTransferBetweenActivities.intent.IntentExampleActivity;
import tmbs.academia_jedi.aulas.component.dataTransferBetweenActivities.startForResult.ResultExampleActivity;

public class ChooseTransactionActivity extends AppCompatActivity implements View.OnClickListener  {

    private Button intentAction;
    private Button bundleAction;
    private Button startForResultAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_transaction);

        intentAction = (Button) findViewById(R.id.button_intent);
        bundleAction = (Button) findViewById(R.id.button_bundle);
        startForResultAction = (Button) findViewById(R.id.button_start_for_result);

        intentAction.setOnClickListener(this);
        bundleAction.setOnClickListener(this);
        startForResultAction.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        Class nextActivity = null;

        switch (v.getId()) {
            case R.id.button_intent:
                nextActivity = IntentExampleActivity.class;
                break;
            case R.id.button_bundle:
                nextActivity = BundleExampleActivity.class;
                break;
            case R.id.button_start_for_result:
                nextActivity = ResultExampleActivity.class;
                break;
            default:
                Toast.makeText(ChooseTransactionActivity.this, getResources().getString(R.string.label_toast_chose_activity), Toast.LENGTH_SHORT).show();
        }

        if (nextActivity != null) {
            Intent intent = new Intent(ChooseTransactionActivity.this, nextActivity);
            ChooseTransactionActivity.this.startActivity(intent);
        }

    }
}
