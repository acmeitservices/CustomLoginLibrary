package library.slidewell.com.customlibrary.CustomView;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import library.slidewell.com.customlibrary.R;

public class navAct extends AppCompatActivity {
    ArrayList<String>menus;
    ArrayList<Integer>icon;
    ArrayList<getterClass>getterClasses;
    Fragment f;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
//        menu = new HashMap<>();
        menus=new ArrayList<>();
        icon=new ArrayList<>();
        getterClasses = new ArrayList<>();
        f= new Fragment();
        menus.add("Password");
        menus.add("Email");
        menus.add("Gallery");
        icon.add(R.drawable.avd_hide_password_1);
        icon.add(R.drawable.ic_email);
        icon.add(R.drawable.ic_insert_photo_black_24dp);
        addMenu("Share",R.drawable.ic_action_search,f);


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav);
       // navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);
        System.out.println("hiiiii===");
        addMenuItemInNavMenuDrawer("Social Media",menus,icon);
        System.out.println("Hiiiii===");

    }
    private void addMenu(String mname, int icon, Fragment fragment)
    {
        getterClass get= new getterClass(mname,icon,fragment);
        getterClasses.add(get);
    }
    private void addMenuItemInNavMenuDrawer(String menName, ArrayList<String>menunames,ArrayList<Integer>icon)
    {
        //add menus
        NavigationView navView = (NavigationView) findViewById(R.id.nav);
        Menu menu = navView.getMenu();

        Menu submenu = menu.addSubMenu(menName);
        for(int i=0;i<menunames.size();i++)
        {
            // submenu.add(menus.get(i));
            MenuItem item = menu.add(1, 1, 1, menunames.get(i));
            item.setIcon(icon.get(i));
//            submenu.add(1,1,1,"Snehal");
//            submenu.add(1,1,1,R.drawable.ic_email);
//            submenu.removeItem(1);
        }

        navView.invalidate();
    }
}
