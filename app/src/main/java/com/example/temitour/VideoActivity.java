package com.example.temitour;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.example.temitour.paintings.Artist;
import com.example.temitour.paintings.Painting;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.robotemi.sdk.Robot;
import com.robotemi.sdk.TtsRequest;
import com.robotemi.sdk.listeners.OnRobotReadyListener;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import android.net.Uri;

/**
 * This class represents the Promo Video activity
 *
 * @author Genesis Benedith
 */
public class VideoActivity extends AppCompatActivity implements OnRobotReadyListener {

    VideoView videoView;
    MediaController mediaController = new MediaController(this);


//    @Override
//    public void onRobotReady(boolean b) {
//
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.promo_video);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.promo_video);
        VideoView promoVideoView = (VideoView) findViewById(R.id.promoVideoView);
        mediaController.setMediaPlayer(videoView);
        videoView.setMediaController(mediaController);
        // set Video URL
        promoVideoView.setVideoURI();
    }

    @Override
    public void onRobotReady(boolean b) {

    }
}
