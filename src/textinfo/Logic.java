package textinfo;

import java.util.Objects;

public class Logic {
    private int chars;
    private int rows;

    private boolean ending;

    public void count(){
        chars = 0;
        rows = 0;
        ending = true;

    }


    public void setText(String textInput) {
        if (Objects.equals(textInput, "stop") || Objects.equals(textInput, "Stop")) {
            ending = false;
        }
        else {
            chars = chars + textInput.length();
            rows = rows + 1;
        }
    }

    public int getcharCount() {
        return chars;
    }

    public int getrowCount() {
        return rows;
    }

    public boolean runstate() {
        return ending;
    }
}
//räknar rader,tecken och ord(3)
//har koll på längsta ordet(3)
//har koll på att användaren skrivit stop