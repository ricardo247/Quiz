package com.alexander.quiz_firestore;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CatGridAdapter extends BaseAdapter {



    private List<String> catList;

    public CatGridAdapter(List<String> catList) {
        this.catList = catList;

    }


    @Override
    public int getCount() {
        return catList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {


        View view;

        if(convertView == null)
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_item_layout,parent,false);
        }
        else
        {
            view = convertView;
        }



        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(parent.getContext(), ProsActivity.class);
                intent.putExtra("CATEGORY",catList.get(position));
                intent.putExtra("CATEGORY_ID",position+1);
                parent.getContext().startActivity(intent);
            }
        });


        ((TextView) view.findViewById(R.id.catName)).setText(catList.get(position));

        return view;
    }
}
