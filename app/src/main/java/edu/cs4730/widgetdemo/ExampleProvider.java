package edu.cs4730.widgetdemo;

import java.util.Random;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

//http://www.vogella.com/articles/AndroidWidgets/article.html
//http://code4reference.com/2012/07/android-widget-tutorial/
//http://developer.android.com/guide/topics/appwidgets/index.html
//http://developer.android.com/guide/practices/ui_guidelines/widget_design.html

/*
 * So this is actually the widget and it updater.
 * There are a couple of calls to static functions in the exampleConfActivity, so the
 * preferences can be stored/restored/deleted.
 */


public class ExampleProvider extends AppWidgetProvider {

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
	
		// if there may be multiple widgets active, so update all of them
		final int N = appWidgetIds.length;
		for (int i = 0; i < N; i++) {
			updateAppWidget(context, appWidgetManager, appWidgetIds[i]);
		}
	}
	
	
	/*
	 * This is where the actual work is done.   It is called from onUpdate for each
	 * (homescreen) widget to update.   likely only one, but below we an change that functionality.
	 */
	static void updateAppWidget(Context context, AppWidgetManager appWidgetManager, int appWidgetId) {


	}

	
	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		// When the user deletes the widget, delete the preference associated
		// with it.
	}

	@Override
	public void onEnabled(Context context) {
		// Enter relevant functionality for when the first widget is created
        //in this case, nothing is necessary, since it is handled for every widget.
	}

	@Override
	public void onDisabled(Context context) {
		// Enter relevant functionality for when the last widget is disabled
        //it's all handled by the onDelete, so there is nothing here.
	}
	
}
