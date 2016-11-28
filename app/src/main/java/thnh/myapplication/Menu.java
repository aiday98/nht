package thnh.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class Menu extends AppCompatActivity {
    EditText editText;
    Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        editText =(EditText) findViewById(R.id.editText);
        save = (Button) findViewById(R.id.button);


    }
    public void savefile(View View){
        try{
            if (save.isClickable()){
                write();
            }
            Toast.makeText(this, "Ghi dữ liệu thành công!", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Log.e("Loi ghi file", e.toString());}
        }


    public  void write(){
        try{
            OutputStream os= openFileOutput("chuthich_in.txt",MODE_PRIVATE);
            String string= editText.getText().toString();
            os.write(string.getBytes());
            os.close();
        } catch (Exception e) {
            Log.e("Loi ghi file", e.toString());
        }
        }
    }





