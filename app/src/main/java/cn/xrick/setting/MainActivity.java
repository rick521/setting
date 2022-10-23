package cn.xrick.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.leon.lib.settingview.LSettingItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //对一个控件进行点击事件
        LSettingItem one =(LSettingItem)findViewById(R.id.item_setting);
        one.setmOnLSettingItemClick(new LSettingItem.OnLSettingItemClick() {
            @Override
            public void click(boolean isChecked) {
                Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
            }
        });
    }
}