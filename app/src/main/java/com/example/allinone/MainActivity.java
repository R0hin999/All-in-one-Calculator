package com.example.allinone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
NavigationView navigationView;
DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    toolbar=findViewById(R.id.toolbar);
    navigationView=findViewById(R.id.sidemenu);
    drawerLayout=findViewById(R.id.drawer);
    setSupportActionBar(toolbar);
        loadfragment(new simple());
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer,R.string.closeDrawer);
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
     int ItemId=item.getItemId();
     if (ItemId==R.id.simple){
         loadfragment(new simple());
     } else if (ItemId==R.id.scientific) {
         loadfragment(new Scientific());
     }
     else if(ItemId==R.id.unit){
         loadfragment(new units());
     }else if(ItemId==R.id.Age){
         loadfragment(new Age());
     }
     else if(ItemId==R.id.SgpaToPerc){
         loadfragment(new SgpaToPerc());
     }
     else if(ItemId==R.id.history){
         history();
     }

drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }


});

    }

    private void history() {

        startActivity(new Intent(MainActivity.this,history.class));

    }

    private void loadfragment(Fragment fragment) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.container,fragment);
        ft.commit();
    }

}