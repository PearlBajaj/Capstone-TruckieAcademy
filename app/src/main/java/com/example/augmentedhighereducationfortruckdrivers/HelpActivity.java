package com.example.augmentedhighereducationfortruckdrivers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

import static com.example.augmentedhighereducationfortruckdrivers.MainActivity.mTTS;



//to clarify, this activity is for the help page.
public class HelpActivity extends FragmentActivity {

    private Button quit;
    private TextToSpeech quitSpeech;
    private TextView text;
    public static String text1;

    //Create help page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        //The button of home page
        quit = findViewById(R.id.node_name_view1);
        quitSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = quitSpeech.setLanguage(Locale.ENGLISH);
                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        quit.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });
        //Click the home button and jump to home page
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View section) {
                mTTS.stop();//Stop current speech
                Intent intent = new Intent(HelpActivity.this, MainActivity.class);
                startActivity(intent);
                speak();
            }
        });
        //Marquee effect
        text = findViewById(R.id.text_1);
        text.setSelected(true);
        text1 = "Welcome back.";

        TextView textView = findViewById(R.id.text_3);
        textView.setText(Html.fromHtml("<u>"+"Before using this app, Please confirm that your microphone is working properly."+"</u>"));
    }

    //When user return to home page, speak "Welcome back"
    private void speak() {
        if(!quitSpeech.isSpeaking()) {
            quitSpeech.speak(text1, TextToSpeech.QUEUE_FLUSH, null,null);
        }
    }

    @Override
    protected void onDestroy() {
        if (quitSpeech != null) {
            quitSpeech.stop();
            quitSpeech.shutdown();
        }

        super.onDestroy();
    }
}
