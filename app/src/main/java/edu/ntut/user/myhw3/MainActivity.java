package edu.ntut.user.myhw3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mRadGrp;
    private RadioGroup mRadSex;
    private TextView mTxtNumFamily;
    private Button mBtnOK;
    private TextView mTxtSug;
    private RadioButton mRadBtnMale;
    private RadioButton mRadBtnFemale;
    private String selectedSex;
    private TextView mTxtHob;
    private String[] strhob = {"興趣 : ","","","","","","","","","",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRadSex = (RadioGroup) findViewById(R.id.radGrpSex);
        mTxtNumFamily = (TextView) findViewById(R.id.txtNumFamily);
        mBtnOK = (Button) findViewById(R.id.btnOK);
        mTxtSug = (TextView) findViewById(R.id.txtSug);
        mRadBtnMale = (RadioButton) findViewById(R.id.radBtnMale);
        mRadBtnFemale = (RadioButton) findViewById(R.id.radBtnFemale);
        mTxtHob = (TextView) findViewById(R.id.txtHob);

        mBtnOK.setOnClickListener(btnOKOnClick);
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        String sug = "";

        switch (view.getId()){

            case(R.id.chk_dance):
                if(checked) strhob[1] = "跳舞";
                else strhob[1] = "";
                break;

            case (R.id.chk_drawing):
                if(checked) strhob[2] = "畫畫";
                else strhob[2] = "";
                break;

            case (R.id.chk_writing):
                if(checked) strhob[3] = "寫作";
                else strhob[3] = "";
                break;

            case (R.id.chk_reading):
                if(checked) strhob[4] = "閱讀";
                else strhob[4] = "";
                break;

            case (R.id.chk_eating):
                if(checked) strhob[5] = "美食";
                else strhob[5] = "";
                break;

            case (R.id.chk_swim):
                if(checked) strhob[6] = "游泳";
                else strhob[6] = "";
                break;

            case (R.id.chk_climbing):
                if(checked) strhob[7] = "爬山";
                else strhob[7] = "";
                break;

            case (R.id.chk_music):
                if(checked) strhob[8] = "音樂";
                else strhob[8] = "";
                break;

            case (R.id.chk_travel):
                if(checked) strhob[9] = "旅行";
                else strhob[9] = "";
                break;

            case (R.id.chk_sing):
                if(checked) strhob[10]= "唱歌";
                else strhob[10] = "";
                break;
        }
        for (int i = 0 ; i <strhob.length ; i++) {
            if(strhob[i] != "") sug+=strhob[i] + " ";
        }
        mTxtHob.setText(sug);
    }

    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            MarriageSuggestion ms = new MarriageSuggestion();

            String strSex = "";
            switch (mRadSex.getCheckedRadioButtonId()){
                case R.id.radBtnMale:
                    strSex = "male";
                    break;
                case R.id.radBtnFemale:
                    strSex = "female";
                    break;
            }
            int iAgeRange = 0;
        }
    };
}
