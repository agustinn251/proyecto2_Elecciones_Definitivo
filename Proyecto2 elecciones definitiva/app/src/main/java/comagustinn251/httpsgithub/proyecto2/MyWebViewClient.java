package comagustinn251.httpsgithub.proyecto2;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;


class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {

        // Url base de la APP (al salir de esta url, abre el navegador) poner como se muestra, sin http://
        if(Uri.parse(url).getHost().endsWith("www.electoral.gov.ar/boletas.php#boletas")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }

}
