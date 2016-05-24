package tk.wmss.imoocapp.demoapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import tk.wmss.imoocapp.R;

/**
 * Created by wmss_ on 2016/5/22.
 * 以下类还未测试是否能成功运行，明天再说，睡觉！！！
 */
public class CheckBoxDemo extends AppCompatActivity {
    private CheckBox checkBox;
    private String texts = "你选择的英雄有：";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_demo);
        addS(R.id.checkBoxDemo_checkbox_gailun);
    }

    /*
    * 创建一个方法
    * 该方法判断当前输入的CheckBox是否为true,如果为true则将当前的CheckBox的text属性值加入到texts变量值
    * */

    public void addS(int id) {
        checkBox = (CheckBox) findViewById(id);
        if (checkBox != null)
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String text = checkBox.getText().toString();
                        texts = " " + text;
                        TextView textView = (TextView) findViewById(R.id.checkBoxDemo_text_view);
                        if (textView != null)
                            textView.setText(texts + "。");
                    }
                }
            });
    }
}
