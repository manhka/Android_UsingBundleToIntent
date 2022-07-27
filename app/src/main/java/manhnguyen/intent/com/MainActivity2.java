package manhnguyen.intent.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView)findViewById(R.id.result);
       Intent intent=getIntent();
       Bundle bundle=intent.getBundleExtra("data");
       if (bundle!=null){
           String str=bundle.getString("string");
           int number=bundle.getInt("int",12);
           String[] arr=bundle.getStringArray("stringArr");
           Student student= (Student) bundle.getSerializable("object");
           textView.setText(student.getName()+ "-"+student.getAge()+"\n"+arr[0]+"\n"+str+"\n"+number);
       }

    }
}