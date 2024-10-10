package com.app.damnvulnerablebank;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertController;
import b.b.k.g;
import b.b.k.h;

public class Dashboard extends h {
  public static void u(Dashboard paramDashboard) {
    ((ComponentActivity)paramDashboard).f.a();
  }
  
  public void addBeneficiary(View paramView) {
    startActivity(new Intent(getApplicationContext(), AddBeneficiary.class));
  }
  
  public void getCurrencyRates(View paramView) {
    startActivity(new Intent(getApplicationContext(), CurrencyRates.class));
  }
  
  public void getPendingBeneficiaries(View paramView) {
    startActivity(new Intent(getApplicationContext(), PendingBeneficiary.class));
  }
  
  public void logout(View paramView) {
    SharedPreferences.Editor editor = getApplicationContext().getSharedPreferences("jwt", 0).edit();
    editor.putBoolean("isloggedin", false);
    editor.apply();
    startActivity(new Intent(getApplicationContext(), MainActivity.class));
  }
  
  public void myprofile(View paramView) {
    startActivity(new Intent(getApplicationContext(), Myprofile.class));
  }
  
  public void onBackPressed() {
    g.a a = new g.a((Context)this);
    AlertController.b b = a.a;
    b.f = "Really Exit?";
    b.h = "Are you sure you want to exit?";
    b.k = b.a.getText(17039369);
    a.a.l = null;
    a a1 = new a(this);
    b = a.a;
    b.i = b.a.getText(17039379);
    a.a.j = a1;
    a.a().show();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558433);
    TextView textView = (TextView)findViewById(2131361921);
    if (a.a.a.a.a.R()) {
      Toast.makeText(getApplicationContext(), "Phone is Rooted", 0).show();
      finish();
    } 
  }
  
  public void resetPassword(View paramView) {
    startActivity(new Intent(getApplicationContext(), ResetPassword.class));
  }
  
  public void viewBeneficiaryAdmin(View paramView) {
    startActivity(new Intent(getApplicationContext(), ViewBeneficiaryAdmin.class));
  }
  
  public void viewMyBeneficiaries(View paramView) {
    startActivity(new Intent(getApplicationContext(), ViewBeneficiary.class));
  }
  
  public void viewTransactions(View paramView) {
    startActivity(new Intent(getApplicationContext(), GetTransactions.class));
  }
  
  public void viewbalance(View paramView) {
    startActivity(new Intent(getApplicationContext(), ViewBalance.class));
  }
  
  public class a implements DialogInterface.OnClickListener {
    public final Dashboard b;
    
    public a(Dashboard this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      Dashboard.u(this.b);
      System.exit(0);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\Dashboard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */