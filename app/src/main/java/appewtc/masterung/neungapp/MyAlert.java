package appewtc.masterung.neungapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by masterUNG on 9/27/2016 AD.
 */

public class MyAlert {

    //Explicit
    private Context context;
    private String titleString, messageString;

    public MyAlert(Context context, String titleString, String messageString) {
        this.context = context;
        this.titleString = titleString;
        this.messageString = messageString;
    }   // Constructor

    public void myDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.doremon48);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();


    }   // myDialog

}   // Main Class
