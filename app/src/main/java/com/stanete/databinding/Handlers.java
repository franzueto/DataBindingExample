package com.stanete.databinding;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/**
 * Created by @stanete
 */
public class Handlers {

    private User user;
    private Context context;

    public Handlers(User user, Context context) {
        this.user = user;
        this.context = context;
    }

    public void onClickChangeName(View view) {
        user.setFirstName("Christian");
    }

    public void onClickGoToDetails(View view) {
        Intent intent = new Intent(context, DetailsActivity.class);
        context.startActivity(intent);
    }
}
