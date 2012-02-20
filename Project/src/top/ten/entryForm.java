package top.ten;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class entryForm extends Activity 
{
	EditText zipCode;
	EditText cityState;
	Button accept;
	
	public OnClickListener textListener = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			if(v==accept)
			{
				if(zipCode.getText().length()==5)
				{
					int theZip = Integer.parseInt(zipCode.getText().toString());
					//create a bundle and send to the next area
				}
				else if(cityState.getText().length()!=0)
				{
					String theCity = zipCode.getText().toString();
					//create a bundle and send to next area
				}
				else
				{
					//do nothing, future error check
				}
			}
		}
	};
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry);
        zipCode = (EditText)findViewById(R.id.editText1);
        cityState = (EditText)findViewById(R.id.autoCompleteTextView1);
        accept = (Button)findViewById(R.id.entryDone);
        accept.setOnClickListener(textListener);
    }
	
	
	
	
	
}
