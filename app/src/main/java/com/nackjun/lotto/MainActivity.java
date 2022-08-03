package com.nackjun.lotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.text);
        Button btn = (Button) findViewById(R.id.btn);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Random r = new Random();


        // 버튼 클릭 이벤트
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                // 옵션 세팅
                int [] one_to_9 = {1,2,3,4,5,6,7,8,9};
                int [] ten_to_29 = {11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
                int [] thirty_to_39 = {31,32,33,34,35,36,37,38,39};
                int [] fourty_to_45 = {41,42,43,44,45};
                int [] result = new int[6];

                result[0] = one_to_9[r.nextInt(8) + 1];
                while (result[1] == result[2]) { //중복방지
                    result[1] = ten_to_29[r.nextInt(18) + 1];
                    result[2] = ten_to_29[r.nextInt(18) + 1];
                }
                result[3] = thirty_to_39[r.nextInt(8) + 1];
                result[4] = fourty_to_45[r.nextInt(4) + 1];
                result[5] = r.nextInt(45) + 1;

                // 중복 방지
                while (result[5] == result[0] || result[5] == result[1] || result[5] == result[2] || result[5] == result[3]
                        || result[5] == result[4]) {
                    result[5] = r.nextInt(45) + 1;
                }

                // 결과 정렬
                Arrays.sort(result);
                String num1 = Integer.toString(result[0]);
                String num2 = Integer.toString(result[1]);
                String num3 = Integer.toString(result[2]);
                String num4 = Integer.toString(result[3]);
                String num5 = Integer.toString(result[4]);
                String num6 = Integer.toString(result[5]);
                String lotto = (num1 +" , " + num2 + " , "+ num3 + " , "+ num4 + " , "+ num5 + " , "+ num6 );

                // 텍스트 설정
                text.setText(lotto);

            } // onclick
        }) ; // btn


        // 버튼 클릭 이벤트
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 옵션 세팅
                int [] one_to_9 = {1,2,3,4,5,6,7,8,9};
                int [] ten_to_29 = {11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
                int [] thirty_to_39 = {31,32,33,34,35,36,37,38,39};
                int [] result = new int[6];

                result[0] = one_to_9[r.nextInt(8)+1];
                while(result[1]==result[2]||result[1]==result[3]||result[2]==result[3]) { //중복방지
                    result[1] = ten_to_29[r.nextInt(18)+1];
                    result[2] = ten_to_29[r.nextInt(18)+1];
                    result[3] =  ten_to_29[r.nextInt(18)+1];
                }
                while(result[4]==result[5]) {
                    result[4] = thirty_to_39[r.nextInt(8)+1];
                }
                result[5] = r.nextInt(45)+1;
                while(result[5]==result[0]||result[5]==result[1]||result[5]==result[2]||result[5]==result[3]
                        ||result[5]==result[4]){
                    result[5] = r.nextInt(45)+1;
                }

                // 결과 정렬
                Arrays.sort(result);
                String num1 = Integer.toString(result[0]);
                String num2 = Integer.toString(result[1]);
                String num3 = Integer.toString(result[2]);
                String num4 = Integer.toString(result[3]);
                String num5 = Integer.toString(result[4]);
                String num6 = Integer.toString(result[5]);
                String lotto = (num1 +" , " + num2 + " , "+ num3 + " , "+ num4 + " , "+ num5 + " , "+ num6 );

                // 텍스트 설정
                text.setText(lotto);

            } // onclick
        }) ; // btn2

        // 버튼 클릭 이벤트
        btn3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                int [] result = new int[6];
                // 랜덤번호 생성
                for (int i = 0; i < result.length; i++) {
                    result[i] = r.nextInt(45) + 1;
                    // 중복번호 제거
                    for(int j = 0; j < i; j++) {
                        if(result[i] == result[j]) {
                            i--;
                            break;
                        }
                    }
                }

                // 결과 정렬
                Arrays.sort(result);
                String num1 = Integer.toString(result[0]);
                String num2 = Integer.toString(result[1]);
                String num3 = Integer.toString(result[2]);
                String num4 = Integer.toString(result[3]);
                String num5 = Integer.toString(result[4]);
                String num6 = Integer.toString(result[5]);
                String lotto = (num1 +" , " + num2 + " , "+ num3 + " , "+ num4 + " , "+ num5 + " , "+ num6 );

                // 텍스트 설정
                text.setText(lotto);

            } // onclick
        }) ; // btn3



    }// main


}