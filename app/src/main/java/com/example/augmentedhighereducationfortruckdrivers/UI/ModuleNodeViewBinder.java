package com.example.augmentedhighereducationfortruckdrivers.UI;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.augmentedhighereducationfortruckdrivers.R;

import me.texy.treeview.base.BaseNodeViewBinder;
import me.texy.treeview.TreeNode;

public class ModuleNodeViewBinder extends BaseNodeViewBinder {

    //attributes of the list slide (name and arrow for representing expansion state)
    TextView textView;
    ImageView imageView;

    //constructor, get the text and image
    public ModuleNodeViewBinder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.node_name_view);
        imageView = itemView.findViewById(R.id.arrow_img);
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_module_level;
    }

    @Override
    public void bindView(TreeNode treeNode) {
        //set the text to the node's value (dynamically editable)
        textView.setText(treeNode.getValue().toString());

        //set the arrow symbol to rotate if the slide is expanded
        imageView.setRotation(treeNode.isExpanded() ? 90 : 0);

        //set the arrow symbol to invisible if slide has no child( section level), othervise visible
        imageView.setVisibility(treeNode.hasChild() ? View.VISIBLE : View.INVISIBLE);
    }

    @Override
    public void onNodeToggled(TreeNode treeNode, boolean expand) {
        if (expand) {
            //set arrow rotate animation if the slide is clicked
            imageView.animate().rotation(90).setDuration(200).start();
        } else {
            imageView.animate().rotation(0).setDuration(200).start();
        }
    }


}
