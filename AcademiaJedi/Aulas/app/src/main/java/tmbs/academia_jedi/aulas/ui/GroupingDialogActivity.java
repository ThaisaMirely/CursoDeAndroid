package tmbs.academia_jedi.aulas.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import tmbs.academia_jedi.aulas.R;
import tmbs.academia_jedi.aulas.ui.component.dialog.Dialogs;
import tmbs.academia_jedi.aulas.ui.component.dialog.SimpleDialogFragment;

public class GroupingDialogActivity extends AppCompatActivity implements View.OnClickListener {

    Button dialogFragmentAction;
    Button simpleDialogAction;
    Button pickDialogAction;
    RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grouping_dialog);

        relativeLayout = (RelativeLayout) findViewById(R.id.layout_grouping_dialogs);

        simpleDialogAction = (Button) findViewById(R.id.button_simples_dialog);
        pickDialogAction = (Button) findViewById(R.id.button_dialog_pick_item);
        dialogFragmentAction = (Button) findViewById(R.id.button_dialog_fragment);

        simpleDialogAction.setOnClickListener(this);
        pickDialogAction.setOnClickListener(this);
        dialogFragmentAction.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button_simples_dialog) {
            Dialogs.simpleDialog(GroupingDialogActivity.this);

        } else if (view.getId() == R.id.button_dialog_pick_item) {
            Dialogs.selectedItemDialog(GroupingDialogActivity.this, relativeLayout);

        } else if (view.getId() == R.id.button_dialog_fragment) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            SimpleDialogFragment editNameDialog = new SimpleDialogFragment();
            editNameDialog.show(fragmentManager, "fragment_dialog");

        }

    }

}
