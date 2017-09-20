package com.example.mihail.anextends;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;

    EditText editText;

    Button button;

    String getText = "...";

    GameEasy GameEasy = new GameEasy();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        editText = (EditText) findViewById(R.id.editText);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        float numPlayer = 0;

        if (TextUtils.isEmpty(editText.getText().toString())) {
            textView.setText("Поле не может быть пустым");
            return;
        }

        numPlayer = Float.parseFloat(editText.getText().toString());

        GameEasy.setNumber( (int) numPlayer);
        GameEasy.createRandomNumbers();

        getText = GameEasy.retResult();

        textView.setText(getText);
    }
}
