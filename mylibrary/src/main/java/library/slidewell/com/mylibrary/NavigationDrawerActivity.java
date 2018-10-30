package library.slidewell.com.mylibrary;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;

public class NavigationDrawerActivity extends AppCompatActivity {
    ArrayList<String> menuName;
    ArrayList<Integer> icons;
    ArrayList<getterClass>getterClasses;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

        //addMenuItemInNavMenuDrawer() ;

    }
//add menu to navigation drawer
//    private void addMenuItemInNavMenuDrawer(String menName, HashMap<String,Integer>menus)
//    {
//
//        //add menus
//        NavigationView navView = (NavigationView) findViewById(R.id.nav_view);
//        Menu menu = navView.getMenu();
//
//
//
//        Menu submenu = menu.addSubMenu(menName);
//        for(int i=0;i<menus.size();i++)
//        {
//           // submenu.add(menus.get(i));
//            MenuItem item = menu.add(1, 1, 1, "Picture");
//            item.setIcon(R.drawable.ic_email);
//            submenu.add(1,1,1,menus.get(i));
////            submenu.add(1,1,1,R.drawable.ic_email);
////            submenu.removeItem(1);
//        }
//
//        navView.invalidate();
//    }

    public void addMenu(String mname, int icon, Fragment fragment)
    {
        getterClass get= new getterClass(mname,icon,fragment);
        getterClasses.add(get);
    }

    public void setMenu(String menName, ArrayList<String> menuName)
    {
        NavigationView navView = (NavigationView) findViewById(R.id.nav_view);
        Menu menu = navView.getMenu();
        Menu submenu = menu.addSubMenu(menName);
        for(int i=0;i<menuName.size();i++)
        {
            // submenu.add(menus.get(i));
            MenuItem item = menu.add(1, 1, 1, menuName.get(i));
            //item.setIcon(icon.get(i));
//            submenu.add(1,1,1,"Snehal");
//            submenu.add(1,1,1,R.drawable.ic_email);
//            submenu.removeItem(1);
        }


        navView.invalidate();



    }


}
