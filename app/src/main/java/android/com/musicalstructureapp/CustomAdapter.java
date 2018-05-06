package android.com.musicalstructureapp;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by czare on 17.04.2018.
 */

public class CustomAdapter extends ArrayAdapter<DataModel> implements View.OnClickListener {

    Context mContext;
    private ArrayList<DataModel> dataSet;
    private int lastPosition = -1;

    public CustomAdapter(ArrayList<DataModel> data, Context context) {
        super(context, R.layout.items, data);
        this.dataSet = data;
        this.mContext = context;
    }

    @Override
    public void onClick(View v) {
        int position = (Integer) v.getTag();
        Object object = getItem(position);
        DataModel dataModel = (DataModel) object;

        switch (v.getId()) {
            case R.id.play:

                Snackbar.make(v, "Song " + dataModel.getFeature() + " is now playing ", Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();

                break;
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DataModel dataModel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.items, parent, false);
            viewHolder.artist = (TextView) convertView.findViewById(R.id.artist);
            viewHolder.song = (TextView) convertView.findViewById(R.id.song);
            viewHolder.play = (ImageView) convertView.findViewById(R.id.play);
            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;


        viewHolder.artist.setText(dataModel.getName());
        viewHolder.song.setText(dataModel.getType());
        viewHolder.play.setOnClickListener(this);
        viewHolder.play.setTag(position);
        return convertView;
    }

    private static class ViewHolder {
        TextView artist;
        TextView song;
        ImageView play;
    }


}
