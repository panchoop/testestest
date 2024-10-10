package b.b.k;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

public class d implements AbsListView.OnScrollListener {
  public final View a;
  
  public final View b;
  
  public d(AlertController paramAlertController, View paramView1, View paramView2) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {
    AlertController.c((View)paramAbsListView, this.a, this.b);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */