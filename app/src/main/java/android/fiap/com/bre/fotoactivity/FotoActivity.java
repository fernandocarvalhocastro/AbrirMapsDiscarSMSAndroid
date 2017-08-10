package android.fiap.com.bre.fotoactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FotoActivity extends AppCompatActivity implements Button.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);

        Button btn = (Button)findViewById(R.id.btn_Exibir);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //Acessar Site
        /*
        Uri site = Uri.parse("http://www.google.com.br");
        Intent it = new Intent(Intent.ACTION_VIEW, site);
        startActivity(it);
        */

        //Disca
        /*
        Uri telefone = Uri.parse("tel://+551199999999");
        Intent it = new Intent(Intent.ACTION_DIAL, telefone);
        startActivity(it);
        */

        //Abre o Maps
        Uri mapa = Uri.parse("geo:0,2?z=3");
        Intent it = new Intent(Intent.ACTION_VIEW, mapa);
        startActivity(it);
    }
}
