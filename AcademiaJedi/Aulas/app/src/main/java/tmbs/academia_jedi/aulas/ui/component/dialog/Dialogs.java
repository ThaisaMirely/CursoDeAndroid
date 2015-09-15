package tmbs.academia_jedi.aulas.ui.component.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.view.View;

import tmbs.academia_jedi.aulas.R;

/**
 * Created by thaisamirely on 8/29/15.
 */
public class Dialogs {

    public static void simpleDialog(Context context) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle(R.string.label_simple_dialog);
        builder.setMessage(R.string.message_simple_dialog);

        //Adição de botões
        builder.setPositiveButton(R.string.label_ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //Ação botão OK
                dialog.dismiss();
            }
        });


        //Criando e exibindo dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public static void selectedItemDialog(Context context, final View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.pick_color)
                .setItems(R.array.colors_array, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        // O argumento "Which" contém a posição de índice do item selecionado

                        int backgroundColor;
                        switch (which){
                            case 0:
                                backgroundColor = Color.MAGENTA;
                                break;
                            case 1:
                                backgroundColor =  Color.RED;
                                break;
                            case 2:
                                backgroundColor = Color.BLUE;
                                break;
                            case 3:
                                backgroundColor = Color.GREEN;
                                break;
                            default:
                                backgroundColor = Color.WHITE;
                        }

                        view.setBackgroundColor(backgroundColor);
                    }
                });
        //Criando e exibindo dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
