package pl.edu.uj.aml_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {



    public static final String NAME = "name";
    public static final String SURNAME = "surname";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }


    /**
     * Called by onClick event of go_button
     * @param view
     */
    public void startQuiz(View view){
        /* Creatig intent */
        Intent intent = new Intent(this, QuestionActivity.class);

        /*Getting text from editable fields */
        EditText name = (EditText) findViewById(R.id.name_edit_text);
        EditText surname = (EditText) findViewById(R.id.surname_edit_text);

        /*Passing date between activities*/
        intent.putExtra(NAME, name.getText().toString());
        intent.putExtra(SURNAME, surname.getText().toString());

        /*Starting activity */
        startActivity(intent);
    }
}