package ma.azehaf.tps4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SaveEtudiant extends AppCompatActivity {
    private static final String FILE_NAME = "myFile.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_etudiant_layout);
        Button buttonSave = findViewById(R.id.buttonSave);
        EditText nomField = findViewById(R.id.nomField);
        EditText prenomField = findViewById(R.id.prenomField);
        EditText telephoneField = findViewById(R.id.telephoneField);
        EditText emailField = findViewById(R.id.emailField);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream fos = openFileOutput(FILE_NAME,MODE_PRIVATE);
                    PrintWriter pw = new PrintWriter(fos,true);
                    pw.println(nomField.getText().toString()+"|"+
                            prenomField.getText().toString()+"|"+
                            telephoneField.getText().toString()+"|"+
                            emailField.getText().toString());

                }catch(Exception e){
                    e.printStackTrace();
                }
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}
