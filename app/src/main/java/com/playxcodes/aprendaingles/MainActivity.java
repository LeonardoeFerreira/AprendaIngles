package com.playxcodes.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.playxcodes.aprendaingles.fragments.BichosFragment;
import com.playxcodes.aprendaingles.fragments.NumerosFragment;
import com.playxcodes.aprendaingles.fragments.VogaisFragment;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //removendo sombra
        getSupportActionBar().setElevation(0);


        //Fazendo as referencias
        smartTabLayout = findViewById(R.id.smartTabLayout);
        viewPager = findViewById(R.id.viewPager);

        //configurar smartablayout
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                  //criando as abas
                   .add("Bichos", BichosFragment.class)
                   .add("Números", NumerosFragment.class)
                   .add("Vogais", VogaisFragment.class)

                .create()
        );

        //definir o view pager
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }
}