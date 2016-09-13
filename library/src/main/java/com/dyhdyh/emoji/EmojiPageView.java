package com.dyhdyh.emoji;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.GridView;
import android.widget.RelativeLayout;

import io.github.rockerhieu.emojicon.R;

/**
 * author  dengyuhan
 * created 2016/9/13 17:34
 */
public class EmojiPageView extends RelativeLayout{
    private GridView mEmojiTab;
    private ViewPager mEmojiPager;

    public EmojiPageView(Context context) {
        this(context,null);
    }

    public EmojiPageView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public EmojiPageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_emoji_container,this,false);
        this.mEmojiPager= (ViewPager) findViewById(R.id.emojis_pager);
        this.mEmojiTab= (GridView) findViewById(R.id.emojis_tab);
        this.mEmojiTab.setChoiceMode(GridView.CHOICE_MODE_SINGLE);
    }
}
