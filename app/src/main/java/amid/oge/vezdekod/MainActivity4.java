package amid.oge.vezdekod;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity4 extends AppCompatActivity {
    static final int GALLERY_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        final int opr = intent.getIntExtra("opr", 0);
        if (opr == 2){
            TextView tv220 = (TextView) findViewById(R.id.textView220);
            tv220.setText("Добавить музыку");
            ImageView im = (ImageView) findViewById(R.id.imageView2);
            im.setImageResource(R.drawable.musiccode);
        }

        TextView statys = (TextView) findViewById(R.id.textView);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageView nasad = (ImageView) findViewById(R.id.textstart);
        nasad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opr == 0) {
                    Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                    startActivity(intent);
                    finish();
                    overridePendingTransition(R.anim.oreo, R.anim.right_in);
                }else{
                    Intent intent = new Intent(MainActivity4.this, MainActivity4.class);
                    startActivity(intent);
                    finish();
                    overridePendingTransition(R.anim.oreo, R.anim.right_in);
                }
            }
        });

        Button vpered = (Button) findViewById(R.id.button);
        vpered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opr == 0){
                    Intent intent = new Intent(MainActivity4.this, MainActivity4.class);
                    intent.putExtra("opr", 2);
                    startActivity(intent);
                    finish();
                    overridePendingTransition(R.anim.oreo, R.anim.left_in);
                }else {
//                    Intent intent = new Intent(MainActivity4.this, MainActivity4.class);
//                    startActivity(intent);
//                    finish();
//                    overridePendingTransition(R.anim.oreo, R.anim.left_in);
                }
            }
        });

    }

}