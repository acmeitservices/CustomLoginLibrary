package library.slidewell.com.customlibrary.CustomView;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Snehal Shewale,Nashik on 26/10/18 , 6:28 PM.
 */

public class getterClass {
    String Menuname;
    int MenuIcon;

    public String getMenuname() {
        return Menuname;
    }

    public void setMenuname(String menuname) {
        Menuname = menuname;
    }

    public int getMenuIcon() {
        return MenuIcon;
    }

    public void setMenuIcon(int menuIcon) {
        MenuIcon = menuIcon;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    Fragment fragment;

    public getterClass(String Menuname1,int menuIcon1,Fragment fragment1)
    {
        this.Menuname=Menuname1;
        this.MenuIcon=menuIcon1;
        this.fragment=fragment1;

    }

}
