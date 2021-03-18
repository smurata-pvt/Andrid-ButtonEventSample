package jp.smurata_pvt.sample.buttonevent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        NavHostFragment navHostFragment = (NavHostFragment)getSupportFragmentManager().getFragments().get(0);
        List<Fragment> fragments = navHostFragment.getChildFragmentManager().getFragments();
        Log.d("MainActivity", "size:" + fragments.size());
        for (Fragment fragment : fragments) {
            Log.d("MainActivity", fragment.toString());
            if (fragment.isVisible()) {
                ((View.OnClickListener)fragment).onClick(view);
            }
        }
    }
}