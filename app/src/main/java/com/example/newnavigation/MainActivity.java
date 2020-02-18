package com.example.newnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.newnavigation.databinding.ActivityMainBinding;

import me.yokeyword.swipebackfragment.SwipeBackActivity;

public class MainActivity extends SwipeBackActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setFragment(new HomeFragment());
        initNavigationBottom();
    }

    private void initNavigationBottom() {

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> {
            Fragment selectedFragment = null;
            switch (menuItem.getItemId()) {
                case R.id.navigation_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.navigation_requests:
                    selectedFragment = new RequestFragment();
                    break;
                case R.id.navigation_metersdata:
                    selectedFragment = new MetricaFragment();
                    break;
            }

            setFragment(selectedFragment);

            return true;
        });
    }


    public void setFragment(Fragment fragment) {

        getSupportFragmentManager().beginTransaction()
                .add(binding.navHostFragment.getId(), fragment)
                .addToBackStack(null)
                .commit();
    }
}
