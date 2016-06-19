package com.example.abhishek.menuexample1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
Button b1,b2;
EditText t1,t2;
User u;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		u=new User();
		t1=(EditText)findViewById(R.id.editText1);
		t2=(EditText)findViewById(R.id.editText2);
		b1=(Button)findViewById(R.id.button1);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			DatabaseDemo d=new DatabaseDemo(getApplicationContext());
			d.open();
		
			u.setEmail(t1.getText().toString());
			u.setPass(t2.getText().toString());
			if(d.login(u)){
				Toast.makeText(getApplicationContext(), "Login", 1000).show();
				
			}else{
				Toast.makeText(getApplicationContext(), "Invalid", 1000).show();
			}
			
				
			}
		});
		
	}
	
}
