package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {


    private TextView username_text;
    private TextView name_text;
    private TextView age_text;
    User user = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        username_text = findViewById(R.id.text_username);
        name_text = findViewById(R.id.text_name);
        age_text = findViewById(R.id.text_age);

        user = getIntent().getParcelableExtra("user");
        if (user!= null) {


            username_text.setText(user.getUsername());
            name_text.setText(user.getName());
            age_text.setText(user.getAge());

            // TODO: display value here

        }
    }
}
