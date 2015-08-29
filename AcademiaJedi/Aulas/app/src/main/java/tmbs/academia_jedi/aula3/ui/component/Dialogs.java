package tmbs.academia_jedi.aula3.ui.component;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import tmbs.academia_jedi.aula3.R;

/**
 * Created by thaisamirely on 8/29/15.
 */
public class Dialogs {

    public static void simpleDialog(Context context) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        //Adição de botões
        builder.setPositiveButton(R.string.label_ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //Ação botão OK
            }
        });
        builder.setNegativeButton(R.string.label_cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //Ação botão cancelar

            }
        });

//Criando e exibindo dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
