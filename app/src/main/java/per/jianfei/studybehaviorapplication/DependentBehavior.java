package per.jianfei.studybehaviorapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

/**
 * Copyright (C), buyuphk物流中转站
 * author: JianfeiMa
 * email: 1017033681@qq.com
 * revised: 2021-06-11
 * motto: 勇于向未知领域探索
 */
public class DependentBehavior extends CoordinatorLayout.Behavior<View> {
    public DependentBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        return dependency instanceof TextView;
    }

    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, View child, View dependency) {
        int offset = dependency.getTop() - child.getTop();
        ViewCompat.offsetTopAndBottom(child, offset);
        return true;
    }
}
