package com.example.augmentedhighereducationfortruckdrivers.UI;

import android.view.View;

import com.example.augmentedhighereducationfortruckdrivers.R;

import me.texy.treeview.base.BaseNodeViewBinder;
import me.texy.treeview.base.BaseNodeViewFactory;

public class NodeViewFactory extends BaseNodeViewFactory {


    @Override
    public BaseNodeViewBinder getNodeViewBinder(View view, int level) {

        //create node binder at runtime, based on parameter level provided. 0 = lesson, 1 = module, 2 = section
        switch (level) {
            case 0:
                return new LessonNodeViewBinder(view);
            case 1:
                return new ModuleNodeViewBinder(view);
            case 2:
                return new SectionNodeViewBinder(view);
            default:
                return null;
        }
    }

    public int getNodeLayoutId(int level) {
        switch (level) {
            case 0:
                return R.layout.item_lesson_level;
            case 1:
                return R.layout.item_module_level;
            case 2:
                return R.layout.item_section_level;
            default:
                return 0;
        }
    }


}
