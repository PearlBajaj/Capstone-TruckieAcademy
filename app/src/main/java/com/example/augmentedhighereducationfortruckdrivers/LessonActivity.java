package com.example.augmentedhighereducationfortruckdrivers;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import com.example.augmentedhighereducationfortruckdrivers.Models.Lesson;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.hbisoft.pickit.PickiT;
import com.hbisoft.pickit.PickiTCallbacks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


// to clarify, this activity is used to import lesson.
public class LessonActivity extends AppCompatActivity implements View.OnClickListener, PickiTCallbacks {

    final public static int FILE_REQUEST_CODE = 1;
    final public static int REQUEST_CODE_ASK_PERMISSIONS = 123;
    PickiT pickiT;
    public static FloatingActionButton upload_button;


    private void requestPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED ) {
            ActivityCompat
                    .requestPermissions(LessonActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE_ASK_PERMISSIONS);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CODE_ASK_PERMISSIONS:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission Granted
                    Toast.makeText(LessonActivity.this, "Permission Granted", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    // Permission Denied
                    Toast.makeText(LessonActivity.this, "Permission Denied", Toast.LENGTH_SHORT)
                            .show();
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        upload_button = findViewById(R.id.button_upload);
        System.out.println(upload_button);
        upload_button.setOnClickListener(this);
        // File picker
        pickiT = new PickiT(this, this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //System.out.println("Hello, I'm here!!!");
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_upload) {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("application/json");
            startActivityForResult(intent, FILE_REQUEST_CODE);
        }

    }

    public static void copy(File src, File dst) throws IOException {
        try (InputStream in = new FileInputStream(src)) {
            try (OutputStream out = new FileOutputStream(dst)) {
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
            }
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FILE_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {

                pickiT.getPath(data.getData(), Build.VERSION.SDK_INT);

            }
        }
    }




    public static String convertFileName(String name) {
        String fileName;
        fileName = (name.replaceAll("\\s", "_")).toLowerCase();

        return fileName;
    }

    // Copy selected file to internal app storage
    @Override
    public void PickiTonCompleteListener(String path, boolean wasDriveFile, boolean wasUnknownProvider, boolean wasSuccessful, String Reason) {
        if (wasSuccessful) {
            try {
                Toast toast = Toast.makeText(getApplicationContext(), "Upload successful", Toast.LENGTH_LONG);
                toast.show();

                File temp = new File(path);
                File dir = getFilesDir();
                Gson gson = new Gson();

                BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

//                //check if the json format is correct
//                if(!isJsonValid(gson, bufferedReader)){
//                        Toast toast1 = Toast.makeText(getApplicationContext(), "json format not valid!", Toast.LENGTH_LONG);
//                        toast1.show();
//                }


                Lesson testLesson = gson.fromJson(bufferedReader, Lesson.class);
                String fileName = convertFileName(testLesson.name) + ".json";

                File dest = new File(dir, fileName);
                copy(temp, dest);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch(com.google.gson.JsonSyntaxException ex) {
                Log.d("tag", "failed");
            }

        }
    }



    @Override
    public void PickiTonStartListener() {

    }

    @Override
    public void PickiTonProgressUpdate(int progress) {

    }


    //json validation function
    public static boolean isJsonValid(Gson gson, java.io.BufferedReader jsonReader){
        try {
            gson.fromJson(jsonReader, Lesson.class);
            return true;
        } catch(com.google.gson.JsonSyntaxException ex) {
            return false;
        }
    }
}
