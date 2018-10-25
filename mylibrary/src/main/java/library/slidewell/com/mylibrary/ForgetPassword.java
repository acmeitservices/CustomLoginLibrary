package library.slidewell.com.mylibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.test.espresso.remote.EspressoRemoteMessage;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Snehal Shewale,Nashik on 25/10/18 , 9:02 AM.
 */

public class ForgetPassword extends AppCompatActivity
{
    EditText userEmail;
    CardView submitUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password);

        userEmail = (EditText) findViewById(R.id.tvuserEmail);
        submitUser = (CardView) findViewById(R.id.SubmitUser);


        submitUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"hii submit email",Toast.LENGTH_SHORT).show();
                userEmail.setError(null);
                if(userEmail.getText().toString().length()==0)
                {
                    userEmail.setError("Empty Email");
                }
                else
                {

                }

            }
        });
    }
}
