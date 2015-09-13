package com.rabor.musicplayerdemo;

import android.content.Context;
import android.widget.MediaController;

// class presents a standard widget with play/pause, rewind, fast-forward, and skip (previous/next) buttons
public class MusicController extends MediaController {

    public MusicController(Context c){
        super(c);
    }

    public void hide(){}

}
