package comagustinn251.httpsgithub.proyecto2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;


public class webview extends AppCompatActivity {


    String url = "http://www.adpra.org.ar/wp-content/uploads/2017/06/ELECCIONES-2017-DESTINADA-A-ELECTORES-27-ABRIL-FULL.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        WebView web = (WebView) findViewById(R.id.wb);
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
        Button button= (Button) findViewById(R.id.pp);
        Button button1= (Button) findViewById(R.id.cPadron);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,MainActivity.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,padron.class);
                startActivity(intent);


    }

});
    }

}
