package com.tutorials.hp.firebaserecyclermulti_items.m_UI;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.tutorials.hp.firebaserecyclermulti_items.R;

/**
 * Created by Oclemy on 6/21/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 * 1. HOLD VIEWS
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView nameTxt,propTxt,descTxt;

    public MyViewHolder(View itemView) {
        super(itemView);

        nameTxt=(TextView) itemView.findViewById(R.id.nameTxt);
        propTxt=(TextView) itemView.findViewById(R.id.propellantTxt);
        descTxt=(TextView) itemView.findViewById(R.id.descTxt);
    }
}
