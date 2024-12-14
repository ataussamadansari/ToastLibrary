package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

public class toaster {
    public static void showToast(Context activity, String message) {
        Toast toast = Toast.makeText(activity, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
