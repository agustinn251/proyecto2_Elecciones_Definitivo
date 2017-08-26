package comagustinn251.httpsgithub.proyecto2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String url = "https://www.electoral.gov.ar/boletas/boletas.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        WebView web = (WebView) findViewById(R.id.miPadron);
        web.setWebViewClient(new MyWebViewClient());
        web.setFocusable(true);
        web.setFocusableInTouchMode(true);

        web.getSettings().setDomStorageEnabled(true);
        web.getSettings().setDatabaseEnabled(true);
        web.getSettings().setAppCacheEnabled(true);
        web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(url);
        final Context context=this;
        Button button= (Button) findViewById(R.id.padron);
        Button button1= (Button) findViewById(R.id.siguiente);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,padron.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,webview.class);
                startActivity(intent);
            }
        });
        }

    }

