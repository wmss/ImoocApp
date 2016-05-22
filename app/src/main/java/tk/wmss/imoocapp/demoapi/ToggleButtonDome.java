package tk.wmss.imoocapp.demoapi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

import tk.wmss.imoocapp.R;

/**
 * Created by wmss_ on 2016/5/21.
 */
public class ToggleButtonDome extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_toggle_button_demo);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButtonDemo_toggle_button);
        final ImageView imageView = (ImageView) findViewById(R.id.toggleButtonDemo_image_view);

        //使用匿名内部类实现对ToggleButton进行监听
        if (toggleButton != null) {
            toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    /*
                    * CompoundButton buttonView   代表被点击控件的本身
                    * boolean isChecked           代表被点击控件的状态
                    * 当点击这个toggleButton的时候，更换imageView的背景
                    * */
                    if (isChecked) {
                        if (imageView != null)
                            imageView.setBackgroundResource(R.drawable.on);
                    } else {
                        if (imageView != null)
                            imageView.setBackgroundResource(R.drawable.off);
                    }
                }
            });
        }

    }

}
