package diablo.softkeyboard.com;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by Diablo on 16/9/17.
 */
public class ItemPasswordLayout extends RelativeLayout
        implements MyNumKeyBoard.IOnKeyboardListener {
    private EditText editText;
    private ImageView[] imageViews;//使用一个数组存储密码框
    private MyNumKeyBoard myNumKeyBoard;
    private StringBuffer stringBuffer = new StringBuffer();//存储密码字符
    private static final int PASSWORD_COUNT = 6;
    private int currentCount = 0;

    public ItemPasswordLayout(Context context) {
        this(context, null);
    }

    public ItemPasswordLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ItemPasswordLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        imageViews = new ImageView[PASSWORD_COUNT];
        View view = View.inflate(context, R.layout.soft_keyboard_lay, this);

        editText = (EditText) findViewById(R.id.item_edittext);
        myNumKeyBoard = (MyNumKeyBoard) findViewById(R.id.view_keyboard);
        myNumKeyBoard.shuffleKeyboard();
        myNumKeyBoard.setIOnKeyboardListener(this);
        imageViews[0] = (ImageView) findViewById(R.id.item_password_iv1);
        imageViews[1] = (ImageView) findViewById(R.id.item_password_iv2);
        imageViews[2] = (ImageView) findViewById(R.id.item_password_iv3);
        imageViews[3] = (ImageView) findViewById(R.id.item_password_iv4);
        imageViews[4] = (ImageView) findViewById(R.id.item_password_iv5);
        imageViews[5] = (ImageView) findViewById(R.id.item_password_iv6);

        editText.setCursorVisible(false);//将光标隐藏
    }

    private InputCompleteListener inputCompleteListener;

    public void setInputCompleteListener(InputCompleteListener inputCompleteListener) {
        this.inputCompleteListener = inputCompleteListener;
    }

    @Override
    public void onInsertKeyEvent(String text) {
        if (currentCount < PASSWORD_COUNT) {
            stringBuffer.append(text);
            imageViews[currentCount].setImageResource(R.drawable.has_pass_bg);
            currentCount++;
            if (currentCount == PASSWORD_COUNT) {
                inputCompleteListener.inputComplete(String.valueOf(stringBuffer));
            }
        }
    }

    @Override
    public void onDeleteKeyEvent() {
        if (stringBuffer.length() > 0) {
            //删除相应位置的字符
            stringBuffer.delete((currentCount - 1), currentCount);
            currentCount--;
            imageViews[stringBuffer.length()].setImageResource(R.drawable.no_pass_bg);
        }
    }

    public interface InputCompleteListener {
        void inputComplete(String password);
    }

    public EditText getEditText() {
        return editText;
    }
}
