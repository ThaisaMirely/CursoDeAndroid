package tmbs.academia_jedi.aulas.ui.component.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import tmbs.academia_jedi.aulas.R;

/**
 * Created by thaisamirely on 8/29/15.
 */
public class SimpleDialogFragment  extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.message_dialog_fragment_test)
                .setPositiveButton(R.string.label_ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(), getResources().getString(R.string.toast_message_dialog_fragment_action), Toast.LENGTH_LONG).show();

                        dialog.dismiss();
                    }
                })
                .setNegativeButton(R.string.label_cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }

}
