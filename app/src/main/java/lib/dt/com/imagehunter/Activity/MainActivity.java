package lib.dt.com.imagehunter.Activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import lib.dt.com.imagehunter.R;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private enum Page {
        search, download
    }

    private DrawerLayout mDrawer;

    private Page mCurrentPage;
    private Fragment mSearchFragment, mDownloadFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        init();
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                showFragment(Page.search);
                break;
            case R.id.download:
                showFragment(Page.download);
                break;
        }
        mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void init() {
        mDrawer = $(R.id.drawer_layout);

        showFragment(Page.search);
    }

    private void showFragment(Page page) {
        if (mCurrentPage != null && mCurrentPage == page) {
            return;
        }
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        Fragment currentFragment = getFragmentFromPage(mCurrentPage);
        if (currentFragment != null && currentFragment.isAdded()) {
            transaction.hide(currentFragment);
        }
        Fragment showFragment = getFragmentFromPage(page);
        if (showFragment != null) {
            if (showFragment.isAdded()) {
                transaction.show(showFragment);
            } else {
                transaction.add(R.id.frame, showFragment);
            }
        }
        transaction.commit();
        mCurrentPage = page;
    }

    private Fragment getFragmentFromPage(Page page) {
        if (page == null) {
            return null;
        }
        switch (page) {
            case search:
                if (mSearchFragment == null) {
                    mSearchFragment = new SearchFragment();
                }
                return mSearchFragment;
            case download:
                if (mDownloadFragment == null) {
                    mDownloadFragment = new DownloadFragment();
                }
                return mDownloadFragment;
        }
        return null;
    }
}
