package com.example.abhijeetsingh.task41;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abhijeet Singh on 13-07-2017.
 */
public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Activity context,ArrayList<User> pusers)
    {
        super(context,0,pusers);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        User my_user= (User)getItem(position);


        TextView nameView=(TextView)listItemView.findViewById(R.id.name);
        nameView.setText(my_user.getName());

        TextView emailView=(TextView)listItemView.findViewById(R.id.email);

        return listItemView;

    }

}
