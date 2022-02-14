package com.example.gacha_tab;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.gacha_tab.databinding.ActivityMainBinding;
import com.example.gacha_tab.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.gacha_tab.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(view ->{
            popup();
        });
    }

    public void popup() {
        final TextView mail1;
        final TextView mail2;
        final TextView mail3;
        final TextView mail4;

        AlertDialog.Builder dialogbulider = new AlertDialog.Builder(this);
        final View pup = getLayoutInflater().inflate(R.layout.popup, null);

        dialogbulider.setView(pup);
        dialogbulider.show();

        mail1 = pup.findViewById(R.id.role1);
        String m1 = "supachai_chomchuey@cmu.ac.th";
        SpannableString st = new SpannableString(mail1.getText());
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                ClipboardManager clipbo = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",m1);
                clipbo.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Copied : "+ m1, Toast.LENGTH_SHORT).show();
            }
        };

        st.setSpan(clickableSpan1, 21,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mail1.setText(st);
        mail1.setMovementMethod(LinkMovementMethod.getInstance());

        mail2 = pup.findViewById(R.id.role2);
        String m2 = "thiraphat_n@cmu.ac.th";
        SpannableString st2 = new SpannableString(mail2.getText());
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                ClipboardManager clipbo = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",m2);
                clipbo.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Copied : "+ m2, Toast.LENGTH_SHORT).show();
            }
        };

        st2.setSpan(clickableSpan2, 12,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mail2.setText(st2);
        mail2.setMovementMethod(LinkMovementMethod.getInstance());

        mail3 = pup.findViewById(R.id.role3);
        String m3 = "phurinat_phanuphong@cmu.ac.th";
        SpannableString st3 = new SpannableString(mail3.getText());
        ClickableSpan clickableSpan3 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                ClipboardManager clipbo = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",m3);
                clipbo.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Copied : "+ m3, Toast.LENGTH_SHORT).show();
            }
        };

        st3.setSpan(clickableSpan3, 12,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mail3.setText(st3);
        mail3.setMovementMethod(LinkMovementMethod.getInstance());

        mail4 = pup.findViewById(R.id.role4);
        String m4 = "saengtawan_p@cmu.ac.th";
        SpannableString st4 = new SpannableString(mail4.getText());
        ClickableSpan clickableSpan4 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                ClipboardManager clipbo = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",m4);
                clipbo.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Copied : "+ m4, Toast.LENGTH_SHORT).show();
            }
        };

        st4.setSpan(clickableSpan4, 23,28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mail4.setText(st4);
        mail4.setMovementMethod(LinkMovementMethod.getInstance());
    }
}