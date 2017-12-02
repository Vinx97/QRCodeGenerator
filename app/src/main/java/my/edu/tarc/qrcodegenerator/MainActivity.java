package my.edu.tarc.qrcodegenerator;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;


public class MainActivity extends AppCompatActivity {

    private Button generateButton;
    private EditText inputEditText;
    private ImageView QRCodeImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = this;

        generateButton = (Button)findViewById(R.id.generateButton);

        inputEditText = (EditText)findViewById(R.id.inputEditText);
        QRCodeImageView = (ImageView)findViewById(R.id.QRCodeImageView);

    }

    public void GenerateQRCodeButton(View view){
        Intent intent = new Intent(this, QRCodeGeneratorActivity.class);
        startActivity(intent);
    }

    public void ScanQRCodeButton(View view){
        Intent intent = new Intent(this, QRCodeScannerActivity.class);
        startActivity(intent);
    }
}
