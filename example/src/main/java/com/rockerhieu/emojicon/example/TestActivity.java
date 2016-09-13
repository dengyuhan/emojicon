package com.rockerhieu.emojicon.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;

import io.github.rockerhieu.emojicon.EmojiAdapter;
import io.github.rockerhieu.emojicon.emoji.Emojicon;
import io.github.rockerhieu.emojicon.emoji.People;

/**
 * author  dengyuhan
 * created 2016/9/13 15:53
 */
public class TestActivity extends AppCompatActivity{
    GridView gv;
    EditText ed;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        gv= (GridView) findViewById(R.id.gv);
        ed= (EditText) findViewById(R.id.ed);
        final EmojiAdapter emojiAdapter = new EmojiAdapter(this, People.DATA);
        gv.setAdapter(emojiAdapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Emojicon item = emojiAdapter.getItem(i);
                input(ed,item);
            }
        });
    }


    private void input(EditText editText,Emojicon emojicon) {
        if (editText == null || emojicon == null) {
            return;
        }

        int start = editText.getSelectionStart();
        int end = editText.getSelectionEnd();
        if (start < 0) {
            editText.append(emojicon.getEmoji());
        } else {
            editText.getText().replace(Math.min(start, end), Math.max(start, end), emojicon.getEmoji(), 0, emojicon.getEmoji().length());
        }
    }

    public void delete(View v){
        KeyEvent event = new KeyEvent(0, 0, 0, KeyEvent.KEYCODE_DEL, 0, 0, 0, 0, KeyEvent.KEYCODE_ENDCALL);
        ed.dispatchKeyEvent(event);
    }
}
