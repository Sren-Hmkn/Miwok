package com.example.android.miwok;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Rainer on 25.12.2017.
 */

public class CategoryClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
/*
        startActivity(new Intent(view.getContext(), NumbersActivity.class));
*/
        Toast.makeText(
                view.getContext(),
                "Open the list",
                Toast.LENGTH_SHORT
        ).show();
    }
}
