package com.example.template;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.template.a01_ayout.L01_LinearActivity;
import com.example.template.a01_ayout.L02_FrameActivity;
import com.example.template.a01_ayout.L03_RelativeActivity;

public class HomeActivity extends AppCompatActivity {

    /**Personel**/

    //Var glo
    Button btnLinearLayout;
    Button btnFrameLayout;

    Button btnRelativeLayout;


    //2 Mathodes init pour initia des widget

    public void initUI(){
        btnLinearLayout = findViewById(R.id.btn_linear_layout);

        btnFrameLayout = findViewById(R.id.btn_frame_layout);

        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
    }


    //pour afficher method complete faut apres "btnLinearLayout.setOnClickListener(new" mettre "Crtl espace"
    public void setBtnLinearLayout()
    {
     btnLinearLayout.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             startActivity(new Intent(HomeActivity.this, L01_LinearActivity.class));
         }
     });
    }

    public void setBtnFrameLayout(){
        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L02_FrameActivity.class));
            }
        });
    }

    public void setBtnRelativeLayout(){
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L03_RelativeActivity.class));
            }
        });
    }
    //4 Methode pour gestion boutton LinearLayout

    /**Life Cycle
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *     previously being shut down then this Bundle contains the data it most
     *     recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initUI();
        setBtnLinearLayout();
        setBtnFrameLayout();
        setBtnRelativeLayout();
    }
}