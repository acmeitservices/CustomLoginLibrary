package library.slidewell.com.mylibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.test.espresso.remote.EspressoRemoteMessage;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
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
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    String getEmail;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password);

        userEmail = (EditText) findViewById(R.id.tvuserEmail);
        submitUser = (CardView) findViewById(R.id.SubmitUser);
        getEmail = userEmail.getText().toString();


        submitUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"hii submit email",Toast.LENGTH_SHORT).show();
                userEmail.setError(null);
                if(userEmail.getText().toString().length()==0)
                {
                    userEmail.setError("Empty Email");
                }
                else if(!isValidEmail(userEmail.getText().toString()))
                {
                    userEmail.setError("Invalid Email");
                }



            }
        });
    }

    private boolean isValidEmail(CharSequence email) {
        if (!TextUtils.isEmpty(email)) {
            return Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }
        return false;
    }

//    public void setEmail(String emailValue)
//    {
//        Toast.makeText(getApplicationContext(),"hii got email",Toast.LENGTH_SHORT).show();
//
//    }


//    public void validateEmail()
//    {
//            userEmail.addTextChangedListener(new TextWatcher() {
//                @Override
//                public void beforeTextChanged(CharSequence s, int start, int count, int after)
//                {
//
//                }
//
//                @Override
//                public void onTextChanged(CharSequence s, int start, int before, int count)
//                {
//
//                }
//
//                @Override
//                public void afterTextChanged(Editable s)
//                {
//                    if (getEmail.matches(emailPattern) && s.length() > 0)
//                    {
//                        Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(),"Invalid email address",Toast.LENGTH_SHORT).show();
//                    }
//                }
//
//            });
//    }
}
