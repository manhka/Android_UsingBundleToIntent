package manhnguyen.intent.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] arr={"Ha noi","HCM","Ha Nam","Thai Binh"};
                Student student=new Student("MANH",19);
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                Bundle bundle=new Bundle();
                bundle.putString("string","THIS IS A STRING TYPE");
                bundle.putStringArray("stringArr",arr);
                bundle.putSerializable("object",student);
                bundle.putInt("int",123456);
                intent.putExtra("data",bundle);
                startActivity(intent);
            }
        });
    }
}