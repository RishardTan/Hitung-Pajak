package com.example.hitungpajak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Vector;

public class Login extends AppCompatActivity
{
    //static Vector<Account> accountVector = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*accountVector.add(new Account("Rishard",111));
        accountVector.add(new Account("Manuel",222));
        accountVector.add(new Account("Christian",333));

         */

        //EditText NPWP = (EditText) findViewById(R.id.Npwp);

        Button Login = (Button) findViewById(R.id.LoginButton);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
                /*int npwp = Integer.parseInt(NPWP.getText().toString());

                for(int i=0; i<accountVector.size(); i++)
                {
                    Account curr = accountVector.get(i);
                    if(curr.npwp==npwp)
                    {
                        MainActivity.loginInfo(curr);
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                    }
                }

                 */

            }
        });
    }
}