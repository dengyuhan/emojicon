package com.dyhdyh.emoji;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import io.github.rockerhieu.emojicon.R;
import io.github.rockerhieu.emojicon.emoji.Emojicon;

/**
 * author  dengyuhan
 * created 2016/9/13 17:47
 */
public class EmojiTabAdapter extends ArrayAdapter<Emojicon> {
    public EmojiTabAdapter(Context context,List<Emojicon> objects) {
        super(context, R.layout.item_emoji_tab, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
