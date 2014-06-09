package com.example.flyingman.utility.lib.googleplay;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

import android.content.Context;
import android.widget.Toast;

public class GooglePlayDeviceTools {

	/**
	 * 
	 * @param ctx
	 * @author Wen Ging
	 * @date 20140604
	 */
	public static void get_google_available(Context ctx) {
		int google_available = GooglePlayServicesUtil.isGooglePlayServicesAvailable(ctx);

		if (ConnectionResult.SUCCESS == google_available) {

		} else if (ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED == google_available) {
			Toast.makeText(ctx, "SERVICE_VERSION_UPDATE_REQUIRED", Toast.LENGTH_SHORT).show();

		} else if (ConnectionResult.SERVICE_MISSING == google_available) {
			Toast.makeText(ctx, "SERVICE_MISSING", Toast.LENGTH_SHORT).show();

		} else if (ConnectionResult.SERVICE_DISABLED == google_available) {
			Toast.makeText(ctx, "SERVICE_DISABLED", Toast.LENGTH_SHORT).show();

		} else {
			Toast.makeText(ctx, "What the fxxk", Toast.LENGTH_SHORT).show();
		}
	}
}
