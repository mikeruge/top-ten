package top.ten;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class catagories extends ListActivity
{
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listmain);
		ListView list = getListView();
		LayoutInflater inflate = getLayoutInflater();
		View header = inflate.inflate(R.layout.listhead, (ViewGroup)findViewById(R.id.header_layout_root));
		list.addHeaderView(header, null, false);
		
		String listStrings[] = {"item1","item2","item3","item4","item5","item6"};
		list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listStrings));
	}
	
	
}
