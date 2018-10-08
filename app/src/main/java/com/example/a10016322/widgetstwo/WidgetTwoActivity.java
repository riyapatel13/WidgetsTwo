package com.example.a10016322.widgetstwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class WidgetTwoActivity extends AppCompatActivity {

    TextView selection, pick;
    RadioGroup radioGroup;
    ImageView leftimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_two);

        selection = (TextView)(findViewById(R.id.selection_id));
        pick = (TextView)(findViewById(R.id.pick_id));
        radioGroup = (RadioGroup)(findViewById(R.id.radiogroup_id));
        leftimage = (ImageView)(findViewById(R.id.imageView_1));

        leftimage.setImageResource(R.drawable.up); //set image like this or in the xml file

        Toast message = Toast.makeText(this,"App Started", Toast.LENGTH_SHORT); //maketext is static
        message.show();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radio_A)
                    pick.setText("A selected");
                else if(checkedId == R.id.radio_B)
                    pick.setText("B selected");
                else if(checkedId == R.id.radio_C)
                {
                    pick.setText("C selected");
                    Toast message = Toast.makeText(WidgetTwoActivity.this, "C picked", Toast.LENGTH_SHORT);
                    //can't just write "this" bc it will refer to the anonymous inner class
                    message.show();
                }


            }
        });
    }
}
