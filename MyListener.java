import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyListener implements KeyListener {
    private int UP = 0;
    private int DOWN =1;
    private int LEFT = 2;
    private int RIGHT = 3;
    public boolean [] keys;
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if(keyCode == 'w' || keyCode =='W'){
            keys[UP] = true;
        }
        else{
            keys[UP] = false;
        }
        if(keyCode == 's' || keyCode == 'S'){
            keys[DOWN] = true;
        }
        else{
            keys[DOWN] = false;
        }
        if(keyCode == 'a' || keyCode == 'A'){
            keys[LEFT] = true;
        }
        else{
            keys[LEFT] = false;
        }
        if(keyCode == 'd' || keyCode == 'D'){
            keys[RIGHT] = true;
        }
        else{
            keys[RIGHT] = false;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
    public MyListener(){
        keys = new boolean[4];//alloctate keys

    }
    public void handleInput(){
        //this could be an iterface? - would make sense if i did that.
        
    }

}
