package per.jianfei.studybehaviorapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView dependent = (TextView) findViewById(R.id.activity_main_text_view_one);
        dependent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Snackbar snackbar = Snackbar.make(findViewById(R.id.activity_main_constraint_layout), "点击了左边的文本", Snackbar.LENGTH_LONG);
        snackbar.setAction("取消", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        snackbar.show();
        ViewCompat.offsetTopAndBottom(v, 30);
    }
}