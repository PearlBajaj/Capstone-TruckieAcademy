package com.example.augmentedhighereducationfortruckdrivers.UI;

import android.content.Intent;
import android.provider.Settings;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.example.augmentedhighereducationfortruckdrivers.HelpActivity;
import com.example.augmentedhighereducationfortruckdrivers.MainActivity;
import com.example.augmentedhighereducationfortruckdrivers.R;

import java.util.Locale;

import me.texy.treeview.base.BaseNodeViewBinder;
import me.texy.treeview.TreeNode;

import static androidx.core.content.ContextCompat.startActivity;

public class SectionNodeViewBinder extends BaseNodeViewBinder {

    //attributes of the list slide (name and arrow for representing expansion state)

    TextView textView;
    ImageView imageView;
    TextToSpeech mTTS;

    //constructor, get the text and image
    public SectionNodeViewBinder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.node_name_viewx);
        imageView = itemView.findViewById(R.id.arrow_img);
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_section_level;
    }

    @Override
    public void bindView(TreeNode treeNode) {
        //set the text to the node's value (dynamically editable)
        textView.setText(treeNode.getValue().toString());
    }

    @Override
    public void onNodeToggled(TreeNode treeNode, boolean expand) {

    }
}
