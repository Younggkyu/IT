package com.example.ex7_7;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

@SuppressLint("NewApi")
public class MainActivity extends ActionBarActivity {
	LinearLayout baseLayout;
	Button button1, button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setTitle("배경색 바꾸기(컨텍스트 메뉴)");
		baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
		registerForContextMenu(button1);
		button2 = (Button) findViewById(R.id.button2);
		registerForContextMenu(button2);
	}
	
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		
		MenuInflater mInflater = getMenuInflater();
		if(v==button1) {
			menu.setHeaderTitle("배경색 변경");
			menu.setHeaderIcon(R.drawable.icon1);
			mInflater.inflate(R.menu.menu1, menu);
		}
		if (v==button2) {
			mInflater.inflate(R.menu.menu2, menu);
		}
	}
}