package com.example.encylo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class menu extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav=(NavigationView)findViewById(R.id.nav_menu);
        drawerLayout =(DrawerLayout)findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.menu_home:
                        Toast.makeText(getApplicationContext(),"home panel is open",Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    /* case R.id.menu_settings:
                        Toast.makeText(getApplicationContext(),"settings panel is open",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(),settings.class);
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_act_america:
                        Toast.makeText(getApplicationContext(),"Act-America panel is open",Toast.LENGTH_LONG).show();
                        Intent intent_act = new Intent(getApplicationContext(),act.class);
                        startActivity(intent_act);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_air_ moss:
                        Toast.makeText(getApplicationContext(),"Air-Moss panel is open",Toast.LENGTH_LONG).show();
                        Intent intent_air = new Intent(getApplicationContext(),airmoss.class);
                        startActivity(intent_air);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break; */

                    case R.id.menu_aquaris:
                        Toast.makeText(getApplicationContext(),"Aquarius panel is open",Toast.LENGTH_LONG).show();
                        Intent intent_aquaris = new Intent(getApplicationContext(),aquarius.class);
                        startActivity(intent_aquaris);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_ats:
                        Toast.makeText(getApplicationContext(),"ATS panel is open",Toast.LENGTH_LONG).show();
                        Intent intent_ats = new Intent(getApplicationContext(),ats.class);
                        startActivity(intent_ats);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_atom:
                        Toast.makeText(getApplicationContext(),"ATOM panel is open",Toast.LENGTH_LONG).show();
                        Intent intent_atom = new Intent(getApplicationContext(),atom.class);
                        startActivity(intent_atom);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_adios:
                        Toast.makeText(getApplicationContext(),"Adeos panel is open",Toast.LENGTH_LONG).show();
                        Intent intent_adeos = new Intent(getApplicationContext(),adeos.class);
                        startActivity(intent_adeos);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_aqua:
                        Toast.makeText(getApplicationContext(),"AQUA panel is open",Toast.LENGTH_LONG).show();
                        Intent intent_aq = new Intent(getApplicationContext(),aqua.class);
                        startActivity(intent_aq);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_atlas:
                        Toast.makeText(getApplicationContext(),"Atlas panel is open",Toast.LENGTH_LONG).show();
                        Intent intent_at = new Intent(getApplicationContext(),atlas.class);
                        startActivity(intent_at);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;


                }


                return true;
            }
        });

    }
}