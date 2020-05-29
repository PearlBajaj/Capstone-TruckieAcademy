package com.example.augmentedhighereducationfortruckdrivers;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;


import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import me.texy.treeview.TreeNode;
import me.texy.treeview.TreeView;

import static org.apache.commons.text.WordUtils.capitalizeFully;


//to clarify, this activity is used for the main menu
public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button;
    private Button Course;
    private ListView lv;
    public static TextToSpeech mTTS;
    public static TextToSpeech mTTS1;
    public static TextToSpeech mTTS2;
    public static boolean firstHomePage = false;
    //currently just for the demo, additional functions not created.
    private ViewGroup viewGroup;
    private TreeNode root;
    private TreeView treeView;
    protected Toolbar toolbar;
    public static List<String> fileList;
    public static List<String> filenamelist;
    String textToSay = "Hello, nice to meet you!";
    public static String fileName;
    public String text;
    public String text1;
    public String text2;
    public int result1;
    public int result2;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
        mAuth = FirebaseAuth.getInstance();

        //Find the id of button of help page
        //Set up the TTS of help page
        mTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    result1 = mTTS.setLanguage(Locale.ENGLISH);

                    if (result1 == TextToSpeech.LANG_MISSING_DATA
                            || result1 == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
//                        Course.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });
        //Set up the TTS of section pages
        mTTS2 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    result2 = mTTS2.setLanguage(Locale.ENGLISH);

                    if (result2 == TextToSpeech.LANG_MISSING_DATA
                            || result2 == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
//                        Course.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });
        //This speech only speak once, when user launch the app at the first time
        mTTS1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    if(!MainActivity.firstHomePage){
                        mTTS1.speak(textToSay, TextToSpeech.QUEUE_FLUSH, null,null);
                        MainActivity.firstHomePage = true;
                    }
                }
            }
        });
//        Course = findViewById(R.id.Course);
////        redirects to Lessons page which has a list of Lessons in a Course
//        Course.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View section) {
//                Intent intent = new Intent(MainActivity.this, CourseContentActivity.class);
//                startActivity(intent);
//            }
//        });
        text = "Dear users, thank you for choosing us. This app is designed for truck drivers to provide higher education. We are still perfecting it and will continue to update it. We hope everyone can enjoy it. Sincerely, all team members.";
        text1 = "Summer is high time drivers take care of tyres as the high temperature increases the chance of tyre explosions. After driving for long distance, drivers sometimes use cold water to immediately cool down the tyres as they got really hot. This, however, is one cause of tyre explosion. The correct way is to park the truck in shade and let it cool down naturally. Another way is to adjust the pressure according to temperature. carrying load and tyre abrasion. Pressure too high or low can both cause tyre explosion. The article has been finished, repeat or start to answer the question?";
        text2 = "In summer, driver uses AC quite often without realising many hazard of long using hours of it. First, AC equipped truck has better tightness. Fuels's burning process in engine can produce carbon monoxide, which will make driver sick and dizzy. So drivers are advised to turn of AC and open windows after driving for a while. The article has been finished, repeat or start to answer the question?";
        fileList = getFiles();
    }

    private void speak() {
        if(!mTTS.isSpeaking()) {
            mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null,null);
        }
    }

    //Hardcode of speech in two sections: Lesson1-Module1-Section1 and Lesson1-Module1-Section2
    private void section_speak(int number) {
        switch(number){
            case 111:
                if(!mTTS2.isSpeaking()) {
                    //Just lorem ipsum, no meaning
                    mTTS2.speak(text1, TextToSpeech.QUEUE_FLUSH, null,null);
                }
            case 112:
                if(!mTTS2.isSpeaking()) {
                    //Just lorem ipsum, no meaning
                    mTTS2.speak(text2, TextToSpeech.QUEUE_FLUSH, null,null);
                }
            default:
                break;
        }
    }

    //Destroy the TextToSpeech object
    @Override
    protected void onDestroy() {
        if (mTTS != null) {
            mTTS.stop();
            mTTS.shutdown();
        }

        super.onDestroy();
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewGroup = (RelativeLayout) findViewById(R.id.container);
        setSupportActionBar(toolbar);

        // set up listview
        lv = (ListView)findViewById(R.id.list_view);
        filenamelist = UpdateFileName();

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, filenamelist);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                fileName = fileList.get(position);
                Intent intent = new Intent(getApplicationContext(), TeachActivity.class);
                intent.putExtra("FILE_NAME", fileName);
                startActivity(intent);


            }
        });

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {

                final int which_item = position;
                new AlertDialog.Builder(MainActivity.this)
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure?")
                        .setMessage("Do you want to delete this lesson")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                String fileName = filenamelist.get(which_item);
                                fileName = fileName.replaceAll(" ","_");
                                fileName = fileName.toLowerCase();
                                String withExtention = fileName +".json";

                                Log.d("tag", fileName);
                                System.out.println(withExtention);
                                File file = new File(getFilesDir(),withExtention);

                                deleteFile(withExtention);

                                filenamelist.remove(which_item);
                                arrayAdapter.notifyDataSetChanged();


                            }
                        })
                        .setNegativeButton("No",null)
                        .show();
                 return true;
            }
        });

        //setup the material drawer
        //if you want to update the items at a later time it is recommended to keep it in a variable
        //PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Add Lesson");
        ProfileDrawerItem pic = new ProfileDrawerItem().withIcon(R.mipmap.ic_launcher);
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIcon(R.drawable.help).withIdentifier(2).withName("Help");
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIcon(R.drawable.progress).withIdentifier(3).withName("Progress");
        PrimaryDrawerItem item4 = new PrimaryDrawerItem().withIcon(R.drawable.logout).withIdentifier(4).withName("Logout");


        //create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .addDrawerItems(
                        //item1,
                        pic,
                        item2,
                        item3,
                        item4

                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        if (drawerItem != null) {
                            Intent intent = null;
                            if (drawerItem.getIdentifier() == 2) {
                                speak();
                                intent = new Intent(MainActivity.this, HelpActivity.class);
                            } else if (drawerItem.getIdentifier() == 3) {
                                intent = new Intent(MainActivity.this, ProgressActivity.class);
                            } else if (drawerItem.getIdentifier() == 4) {
                                mAuth.signOut();
                                intent = new Intent(MainActivity.this, LoginActivity.class);
                                //MainActivity.this.startActivity(intent);
                                finish();


                            }
                            if (intent != null) {
                                MainActivity.this.startActivity(intent);
                            }
                        }
                        return true;
                    }
                })
                .build();






    }

    private List<String> getFiles() {
        List<String> resultList = new ArrayList<String>();
        File dir = getFilesDir();
        for (File file : dir.listFiles()) {
            resultList.add(file.getName());
        }
        return resultList;
    }

    private List<String> UpdateFileName() {
        List<String> List = new ArrayList<String>();
        File directory = getFilesDir();
        for (File f : directory.listFiles()) {
            String filename = FilenameUtils.removeExtension(f.getName());
            filename = filename.replaceAll("_"," ");
            filename = capitalizeFully(filename);
            List.add(filename);
        }
        return List;
    }

    @Override
    protected void onResume() {
        super.onResume();
        fileList = getFiles();
        initView();
    }
    
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    //Choose to jump into special page within special section
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch(item.getItemId()) {
//            case R.id.Help:
//                Intent intent3 = new Intent(this, HelpActivity.class);
//                this.startActivity(intent3);
//                speak();
//                break;
//            case R.id.add_lesson:
//                Intent intent4 = new Intent(this, LessonActivity.class);
//                this.startActivity(intent4);
//                break;
//            case R.id.Progress:
//                Intent intent5 = new Intent(this, ProgressActivity.class);
//                this.startActivity(intent5);
//                break;
//            case R.id.logout:
//                mAuth.signOut();
//                Intent intent6 = new Intent(this, LoginActivity.class);
//                this.startActivity(intent6);
//                finish();
//                break;
//
//
//
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//
//        return true;
//    }
}
