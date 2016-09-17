package diablo.softkeyboard.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ItemPasswordLayout itemPasswordLayout =
                (ItemPasswordLayout) findViewById(R.id.act_zhifubao_IPLayout);
        itemPasswordLayout.setInputCompleteListener(new ItemPasswordLayout.InputCompleteListener() {
            @Override
            public void inputComplete(String password) {
                Toast.makeText(MainActivity.this,password,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
