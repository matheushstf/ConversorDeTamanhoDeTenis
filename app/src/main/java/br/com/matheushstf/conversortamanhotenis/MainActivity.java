package br.com.matheushstf.conversortamanhotenis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.button = findViewById(R.id.button);
        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.textFem = findViewById(R.id.text_fem);
        this.mViewHolder.textKids = findViewById(R.id.text_kids);
        this.mViewHolder.textMasc = findViewById(R.id.text_masc);
        this.mViewHolder.textFemUk = findViewById(R.id.text_fem_uk);
        this.mViewHolder.textMascUk = findViewById(R.id.text_masc_uk);

        this.mViewHolder.button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            String value = this.mViewHolder.editValue.getText().toString();
            if ("".equals(value)) {
                Toast.makeText(this, this.getString(R.string.informe_uma_numeracao), Toast.LENGTH_LONG).show();
                this.mViewHolder.textFem.setText("?");
                this.mViewHolder.textMasc.setText("?");
                this.mViewHolder.textKids.setText("?");
                this.mViewHolder.textFemUk.setText("?");
                this.mViewHolder.textMascUk.setText("?");
            } else {
                switch (value) {
                    case "26":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("K10");
                        break;
                    case "27":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("K11");
                        break;
                    case "28":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("K12");
                        break;
                    case "29":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("K13");
                        break;
                    case "30":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("1");
                        break;
                    case "31":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("2");
                        break;
                    case "32":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("2,5");
                        break;
                    case "33":
                        this.mViewHolder.textFem.setText("5");
                        this.mViewHolder.textFemUk.setText("35");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("3");
                        break;
                    case "34":
                        this.mViewHolder.textFem.setText("5,5");
                        this.mViewHolder.textFemUk.setText("36");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("4");
                        break;
                    case "35":
                        this.mViewHolder.textFem.setText("6,5");
                        this.mViewHolder.textFemUk.setText("37,5");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("5");
                        break;
                    case "36":
                        this.mViewHolder.textFem.setText("7");
                        this.mViewHolder.textFemUk.setText("38");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("6");
                        break;
                    case "37":
                        this.mViewHolder.textFem.setText("7,5");
                        this.mViewHolder.textFemUk.setText("39");
                        this.mViewHolder.textMasc.setText("--");
                        this.mViewHolder.textMascUk.setText("--");
                        this.mViewHolder.textKids.setText("6,5");
                        break;
                    case "38":
                        this.mViewHolder.textFem.setText("8,5");
                        this.mViewHolder.textFemUk.setText("40");
                        this.mViewHolder.textMasc.setText("7,5");
                        this.mViewHolder.textMascUk.setText("40,5");
                        this.mViewHolder.textKids.setText("7");
                        break;
                    case "39":
                        this.mViewHolder.textFem.setText("9");
                        this.mViewHolder.textFemUk.setText("40,5");
                        this.mViewHolder.textMasc.setText("8");
                        this.mViewHolder.textMascUk.setText("41,5");
                        this.mViewHolder.textKids.setText("--");
                        break;
                    case "40":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("9");
                        this.mViewHolder.textMascUk.setText("42,5");
                        this.mViewHolder.textKids.setText("--");
                        break;
                    case "41":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("9,5");
                        this.mViewHolder.textMascUk.setText("43,5");
                        this.mViewHolder.textKids.setText("--");
                        break;
                    case "42":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("10,5");
                        this.mViewHolder.textMascUk.setText("44,5");
                        this.mViewHolder.textKids.setText("--");
                        break;
                    case "43":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("11,5");
                        this.mViewHolder.textMascUk.setText("46");
                        this.mViewHolder.textKids.setText("--");
                        break;
                    case "44":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("12");
                        this.mViewHolder.textMascUk.setText("46,5");
                        this.mViewHolder.textKids.setText("--");
                        break;
                    case "45":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("12,5");
                        this.mViewHolder.textMascUk.setText("47");
                        this.mViewHolder.textKids.setText("--");
                        break;
                    case "46":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("13");
                        this.mViewHolder.textMascUk.setText("48");
                        this.mViewHolder.textKids.setText("--");
                    case "47":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("14");
                        this.mViewHolder.textMascUk.setText("49");
                        this.mViewHolder.textKids.setText("--");
                        break;
                    case "48":
                        this.mViewHolder.textFem.setText("--");
                        this.mViewHolder.textFemUk.setText("--");
                        this.mViewHolder.textMasc.setText("15");
                        this.mViewHolder.textMascUk.setText("50,5");
                        this.mViewHolder.textKids.setText("--");
                        break;

                }
            }
        }

    }

    private static class ViewHolder {
        EditText editValue;
        TextView textMasc;
        TextView textFem;
        TextView textKids;
        TextView textMascUk;
        TextView textFemUk;
        Button button;

    }


}