package com.dangbinh.moneymanagement.utils;

import android.content.Context;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

import com.dangbinh.moneymanagement.R;

/**
 * Created by dangbinh on 9/11/2020.
 */
public class DialogContainer {

    AlertDialog alertDialog;

    public DialogContainer(final Context ctx, int message) {

        alertDialog = new AlertDialog.Builder(ctx).create();
        // Setting Dialog Title
        alertDialog.setTitle("Error");
        // Setting Dialog Message
        alertDialog.setMessage(ctx.getString(message));
        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.password_button);
        // Setting OK Button
        alertDialog.setButton(DialogInterface.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //do things
            }
        });
        // Showing Alert Message
    }

    public void show() {
        alertDialog.show();
    }
}
