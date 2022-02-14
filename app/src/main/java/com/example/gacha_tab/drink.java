package com.example.gacha_tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class drink extends Fragment {
    private TextView mTextView;
    private RadioButton ra;
    private RadioButton rb;
    private RadioButton rc;
    //private RadioButton rd;
    /*
    private final String[] milk = { "เฉาก๊วยคาราเมลโกโก้นมสด", "โกโก้เย็น", "ไมโลเย็น", "โอวัลตินภูเขาไฟ", "นมเย็น", "โยเกิร์ตปีโป้ปั่น", "นมสดปั่น", "นมสดปีโป้ปั่น", "นมสดทูโทนปั่น", "มะม่วงนมสดปั่น",
                                    "นมสดโอริโอ้ปั่น", "โกโก้ดิบ", "นมสดยูนิคอร์น", "นมหมีเรนโบว์", "นมหมีปั่น", "นมสดปั่น", "นมสด", "น้ำเต้าหู้", "น้ำเต้าฮวย"};

     */
    private final String[] cof = {  "มอคค่าปั่น", "ชาเขียวปั่น", "ชาเขียวโกโก้", "ชาเขียวนมเย็น", "กาแฟโบราณ", "ชามะนาวครีมชีส", "เนสกาแฟ", "ยกล้อ", "โอเลี้ยง", "ชาเย็น", "ชาดำเย็น", "ชาไทย",
            "ชาเนสทีเย็น", "ชาเนสทีเย็น", "ชาเขียวนมสด", "ชาเขียวมะนาว", "ชามะนาวโซดา", "กาแฟมินท์มะนาวโซดา","เฉาก๊วยคาราเมลโกโก้นมสด", "โกโก้เย็น", "ไมโลเย็น", "โอวัลตินภูเขาไฟ", "นมเย็น", "โยเกิร์ตปีโป้ปั่น", "นมสดปั่น", "นมสดปีโป้ปั่น", "นมสดทูโทนปั่น", "มะม่วงนมสดปั่น",
            "นมสดโอริโอ้ปั่น", "โกโก้ดิบ", "นมสดยูนิคอร์น", "นมหมีเรนโบว์", "นมหมีปั่น", "นมสดปั่น", "นมสด", "น้ำเต้าหู้", "น้ำเต้าฮวย"};
    private final String[] sofr = { "น้ำส้มปั่น", "น้ำผักปั่น", "น้ำผึ้งมะนาวปั่น", "มะนาวปั่น", "สตอเบอร์รี่โยเกิร์ต", "ยูซุบลูโซดา", "เก๊กฮวย", "ราสเบอร์รี่โซดา", "สมูทตี้มิกซ์เบอร์รี่", "สมูทตี้กี่วีกล้วยโยเกิร์ต",
            "สมูทตี้อะโวคาโดกล้วยมะนาว", "สมูทตี้สตอเบอร์รี่โยเกิร์ต", "สมูทตี้ส้มมะม่วง", "สมูทตี้ฝรั่ง", "เเมงโก้สมูทตี้", "สมูทตี้แอปเปิ้ล", "เชอร์รี่สมูทตี้", "สมูทตี้องุ่นมะนาว", "มะพร้าวนมสดปั่น",
            "เมล่อนปั่นนมสด", "มะม่วงโยเกิร์ตปั่น", "เสาวรส", "กล้วยปั่นคาราเมล", "น้ำฝรั่งสด", "มะนาวโซดา", "น้ำบ๊วย", "บ๊วยน้ำแดงโซดา", "น้ำแดงมะนาวโซดา", "น้ำเขียวมะนาวโซดา",
            "ลิ้นจี่สตรอว์เบอร์รีโซดา", "มะม่วงโซดา"};
    private final  String[] all = { "เฉาก๊วยคาราเมลโกโก้นมสด", "โกโก้เย็น", "ไมโลเย็น", "โอวัลตินภูเขาไฟ", "นมเย็น", "โยเกิร์ตปีโป้ปั่น", "นมสดปั่น", "นมสดปีโป้ปั่น", "นมสดทูโทนปั่น", "มะม่วงนมสดปั่น",
            "นมสดโอริโอ้ปั่น", "โกโก้ดิบ", "นมสดยูนิคอร์น", "นมหมีเรนโบว์", "นมหมีปั่น", "นมสดปั่น", "นมสด", "น้ำเต้าหู้", "น้ำเต้าฮวย","น้ำส้มปั่น", "น้ำผักปั่น", "น้ำผึ้งมะนาวปั่น", "มะนาวปั่น",
            "สตอเบอร์รี่โยเกิร์ต", "ยูซุบลูโซดา", "เก๊กฮวย", "ราสเบอร์รี่โซดา", "สมูทตี้มิกซ์เบอร์รี่", "สมูทตี้กี่วีกล้วยโยเกิร์ต", "สมูทตี้อะโวคาโดกล้วยมะนาว", "สมูทตี้สตอเบอร์รี่โยเกิร์ต", "สมูทตี้ส้มมะม่วง",
            "สมูทตี้ฝรั่ง", "เเมงโก้สมูทตี้", "สมูทตี้แอปเปิ้ล", "เชอร์รี่สมูทตี้", "สมูทตี้องุ่นมะนาว", "มะพร้าวนมสดปั่น", "เมล่อนปั่นนมสด", "มะม่วงโยเกิร์ตปั่น", "เสาวรส", "กล้วยปั่นคาราเมล",
            "น้ำฝรั่งสด", "มะนาวโซดา", "น้ำบ๊วย", "บ๊วยน้ำแดงโซดา", "น้ำแดงมะนาวโซดา", "น้ำเขียวมะนาวโซดา", "ลิ้นจี่สตรอว์เบอร์รีโซดา", "มะม่วงโซดา","มอคค่าปั่น", "ชาเขียวปั่น", "ชาเขียวโกโก้",
            "ชาเขียวนมเย็น", "กาแฟโบราณ", "ชามะนาวครีมชีส", "เนสกาแฟ", "ยกล้อ", "โอเลี้ยง", "ชาเย็น", "ชาดำเย็น", "ชาไทย", "ชาเนสทีเย็น", "ชาเนสทีเย็น", "ชาเขียวนมสด", "ชาเขียวมะนาว",
            "ชามะนาวโซดา", "กาแฟมินท์มะนาวโซดา","น้ำเปล่า"};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragdrink,container,false);

        ra = v.findViewById(R.id.cof);
        rb = v.findViewById(R.id.sofr);
        rc = v.findViewById(R.id.all);
        //rd = v.findViewById(R.id.All);

        mTextView = v.findViewById(R.id.textView);
        Button mButton = v.findViewById(R.id.button);
        mButton.setOnClickListener(v1 -> {
            if (ra.isChecked())
                Random(0);
            else if (rb.isChecked())
                Random(1);
            else if (rc.isChecked())
                Random(2);
//            else if (rd.isChecked())
//                Random(3);
        });
        return v;
    }

    public void Random(int i) {
        if(i == 0){
            Collections.shuffle(Arrays.asList(cof));
            mTextView.setText(cof[0]);
        }
        else if (i == 1){
            Collections.shuffle(Arrays.asList(sofr));
            mTextView.setText(sofr[0]);
        }
        else{
            Collections.shuffle(Arrays.asList(all));
            mTextView.setText(all[0]);
        }

    }
}
