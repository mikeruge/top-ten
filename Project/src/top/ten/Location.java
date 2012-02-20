package top.ten;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Location extends Activity 
{
	Button newButton;
    Button curButton;

	public OnClickListener secondListener = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			if(v==curButton)
			{
				Intent newIntent = new Intent();
				setResult(RESULT_OK, newIntent);
                finish();
			}
			if(v==newButton)
			{
				Intent nextIntent = new Intent(v.getContext(), entryForm.class);
				startActivityForResult(nextIntent, 0);
			}
		}
	};
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        newButton = (Button)findViewById(R.id.specificLoc);
        curButton = (Button)findViewById(R.id.currentLoc);
        newButton.setOnClickListener(secondListener);
        curButton.setOnClickListener(secondListener);
    }
}
