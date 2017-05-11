package com.sumupSDK.cordova.sdk;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.sumup.merchant.api.SumUpAPI;
import com.sumup.merchant.api.SumUpPayment;
import com.sumup.merchant.api.SumUpState;

public class SumupSDKCordovaPlugin extends CordovaPlugin {
    private CallbackContext callbackContext;
    private Activity activity = null;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        this.callbackContext = callbackContext;
        this.activity = this.cordova.getActivity();
        if (action.equals('success')) {
            this.callbackContext.success('success');
        }
        else {
            this.callbackContext.success('error');
        }
        return true;
    }
}