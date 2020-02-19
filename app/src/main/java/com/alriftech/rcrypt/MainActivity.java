package com.alriftech.rcrypt;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.alriftech.rcrypt.PlayfairCipher;

public class MainActivity extends AppCompatActivity {

    TextView txtPlain;
    TextView txtKey;
    TextView txtCipher;
    RadioButton rdEnc;
    RadioButton rdDec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPlain = (TextView)findViewById(R.id.txtPlain);
        txtKey = (TextView)findViewById(R.id.txtKunci);
        txtCipher = (TextView)findViewById(R.id.txtCipher);

        rdEnc = (RadioButton)findViewById(R.id.rdEnc);
        rdDec = (RadioButton)findViewById(R.id.rdDec);
    }

    public void operasikan(View v) {
        PlayfairCipher pc = new PlayfairCipher();
        String hasil = "";

        pc.setKey(txtKey.getText().toString());
        pc.KeyGen();

        // if (rdEnc.isChecked())
            hasil = pc.encryptMessage(txtPlain.getText().toString());
        // else
            // hasil = pc.decryptMessage(txtPlain.getText().toString());

        txtCipher.setText(hasil);
    }
}
